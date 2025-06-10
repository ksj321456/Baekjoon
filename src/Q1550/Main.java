package Q1550;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String hex = br.readLine();  // 한 줄 전체 입력 (ex: A, 1F, 10AB3 등)

        int decimal = Integer.parseInt(hex, 16);  // 16진수 문자열 → 10진수 int
        System.out.println(decimal);
    }
}
