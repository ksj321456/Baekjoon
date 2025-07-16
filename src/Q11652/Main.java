package Q11652;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<Long, Long> map = new TreeMap<>();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            Long num = Long.parseLong(br.readLine());
            map.put(num, map.getOrDefault(num, 0L) + 1);
        }

        Long max = 0L;
        Long result = 0L;
        for (Long key : map.keySet()) {
            if (max < map.get(key)) {
                max = map.get(key);
                result = key;
            }
        }
        System.out.println(result);
    }
}
