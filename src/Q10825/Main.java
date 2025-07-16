package Q10825;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

class Student {
    private String name;
    private int korean;
    private int english;
    private int math;

    public void setName(String name) {
        this.name = name;
    }

    public void setKorean(int korean) {
        this.korean = korean;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public String getName() {
        return name;
    }

    public int getKorean() {
        return korean;
    }

    public int getEnglish() {
        return english;
    }

    public int getMath() {
        return math;
    }
}
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        List<Student> studentList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            Student student = new Student();
            student.setName(st.nextToken());
            student.setKorean(Integer.parseInt(st.nextToken()));
            student.setEnglish(Integer.parseInt(st.nextToken()));
            student.setMath(Integer.parseInt(st.nextToken()));
            studentList.add(student);
        }

        studentList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getKorean() == o2.getKorean()) {
                    if (o1.getEnglish() == o2.getEnglish()) {
                        if (o1.getMath() == o2.getMath()) {
                            return o1.getName().compareTo(o2.getName());
                        }
                        return o2.getMath() - o1.getMath();
                    }
                    return o1.getEnglish() - o2.getEnglish();
                }
                return o2.getKorean() - o1.getKorean();
            }
        });

        for (Student student : studentList) {
            System.out.println(student.getName());
        }
    }
}
