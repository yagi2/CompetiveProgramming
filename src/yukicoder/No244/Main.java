package yukicoder.No244;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());

        Map<Integer, Integer> renchon = new HashMap<>();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                String s = sc.next();
                if (s.equals("nyanpass")) {
                    if (!renchon.containsKey(j)) {
                        renchon.put(j, 0);
                    }
                    renchon.put(j, renchon.get(j)+1);
                }
            }
        }

        int cnt = 0;
        for (int i = 0; i < N; i++) {
            if (!renchon.containsKey(i)) continue;
            if (renchon.get(i) == N - 1) cnt++;
        }

        if (cnt != 1) {
            System.out.println("-1");
        } else {
            renchon.forEach((integer, integer2) -> {
                if (integer2 == N -1) System.out.println(integer+1);
            });
        }
    }
}
