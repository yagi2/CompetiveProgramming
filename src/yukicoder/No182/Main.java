package yukicoder.No182;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] argse) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());

        Map<Long, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            long X = Long.parseLong(sc.next());

            if (!map.containsKey(X)) map.put(X, 0);
            map.put(X, map.get(X) + 1);
        }

        final int[] sum = {0};
        map.forEach((aLong, integer) -> {
            if (integer == 1) sum[0]++;
        });

        System.out.println(sum[0]);
    }
}
