package Q3986;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    static int answer = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            solve(s);
        }
        System.out.println(answer);
    }

    private static void solve(String s) {

        // 문자열의 길이가 홀수라면 return
        if (s.length() % 2 == 1) return;

        Stack<Character> stack = new Stack<>();

        int length = s.length();

        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);

            // Stack이 비어 있으면 push Character
            if (stack.empty()) {
                stack.push(c);
            }
            // Stack의 peek 값과 현재 문자열 index값에 대응하는 Character 비교
            // 같다면 Stack pop 다르다면 push Character
            else {
                if (stack.peek() == c) {
                    stack.pop();
                }
                else {
                    stack.push(c);
                }
            }
        }
        // Stack이 비어 있다면 answer++
        if (stack.empty()) answer++;
    }
}
