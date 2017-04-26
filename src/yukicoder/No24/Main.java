package yukicoder.No24;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < 10; i++) map.put(i, 1);

        for (int i = 0; i < N; i++) {
            List<Integer> tmp = new ArrayList<>();
            for (int j = 0; j < 4; j++) tmp.add(Integer.parseInt(sc.next()));

            String YN = sc.next();

            if ("YES".equals(YN)) {
                tmp.forEach(integer -> map.put(integer, map.get(integer) + 1));
            }
            if ("NO".equals(YN)) {
                tmp.forEach(integer -> map.put(integer, 0));
            }
        }

        final int[] max = {Integer.MIN_VALUE};
        final int[] ans = {0};
        map.forEach((integer, integer2) -> {
            if (max[0] < integer2) {
                max[0] = integer2;
                ans[0] = integer;
            }
        });
        System.out.println(ans[0]);
    }
}
