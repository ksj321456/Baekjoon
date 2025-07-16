package Q9375;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt = Integer.parseInt(st.nextToken());

        for (int i = 0; i < cnt; i++) {
            int n = Integer.parseInt(br.readLine());
            Map<String, Integer> map = new HashMap<>();

            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                String wear = "";
                while (st.hasMoreElements()) {
                    st.nextToken();
                    wear = st.nextToken();
                }
                map.put(wear, map.getOrDefault(wear, 0) + 1);
            }

            int result = 1;

            for (String key : map.keySet()) {
                result *= (map.get(key) + 1);
            }
            System.out.println(result - 1);
        }
    }
}
