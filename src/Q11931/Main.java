package Q11931;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            list.add(Integer.parseInt(st.nextToken()));
        }

        list.sort((num1, num2) -> num2 - num1);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int num : list) {
            bw.write(num + "\n");
        }
        bw.flush();
    }
}
