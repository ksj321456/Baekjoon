package Programmers;

public class TaekbaeBox {

    public static void main(String[] args) {
        System.out.println(solution(22, 6, 8)); // 예상: 3 (8, 17, 20)
    }

    public static int solution(int n, int w, int num) {
        // 상자의 위치(row, column) 찾기
        int row = (num - 1) / w;
        int col = 0;
        int wIdx = w - 1;

        if (row % 2 == 0) {
            col = (num - 1) % w;
        } else {
            col = wIdx - (num - 1) % w;
        }
        int answer = 0;

        for (; row < (n + wIdx) / w; row++) {
            int aboveBox = 0;
            if (row % 2 == 0) {
                aboveBox = col + row * w;
            } else {
                aboveBox = (wIdx - col) + (row * w);
            }

            if (aboveBox < n) {
                answer++;
            }
        }
        return answer;
    }
}
