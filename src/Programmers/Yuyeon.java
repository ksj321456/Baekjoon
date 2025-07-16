package Programmers;

public class Yuyeon {

    public static void main(String[] args) {
        int[] schedules = {700, 800, 1100};
        int[][] timelogs = {{710, 2359, 1050, 700, 650, 631, 659},
                {800, 801, 805, 800, 759, 810, 809},
                {1105, 1001, 1002, 600, 1059, 1001, 1100}};
        int startday = 5;
        System.out.println(solution(schedules, timelogs, startday));
    }

    public static int solution(int[] schedules, int[][] timelogs, int startday) {
        int result = 0;

        for (int i = 0; i < schedules.length; i++) {
            boolean canGetPrize = true;

            // 출근 희망 시각 + 10분 계산
            int scheduleTime = schedules[i];
            int limitTime = addMinutes(scheduleTime, 10);

            // 7일 동안 확인
            for (int day = 0; day < 7; day++) {
                // 현재 날짜의 요일 계산 (1:월, 2:화, ..., 6:토, 7:일)
                int currentDayOfWeek = ((startday - 1 + day) % 7) + 1;

                // 토요일(6), 일요일(7)은 건너뛰기
                if (currentDayOfWeek == 6 || currentDayOfWeek == 7) {
                    continue;
                }

                // 실제 출근 시간이 제한 시간보다 늦으면 실패
                if (timelogs[i][day] > limitTime) {
                    canGetPrize = false;
                    break;
                }
            }

            if (canGetPrize) {
                result++;
            }
        }

        return result;
    }

    // 시간에 분을 더하는 함수 (예: 958 + 10분 = 1008)
    private static int addMinutes(int time, int minutesToAdd) {
        int hour = time / 100;
        int minute = time % 100;

        minute += minutesToAdd;

        // 60분 넘으면 시간 증가
        if (minute >= 60) {
            hour += minute / 60;
            minute = minute % 60;
        }

        return hour * 100 + minute;
    }
}
