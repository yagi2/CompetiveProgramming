package yukicoder.No216;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());
        int[][] scores = new int[N][2];

        for (int i = 0; i < N; i++) {
            scores[i][0] = Integer.parseInt(sc.next());
        }


        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            int p = Integer.parseInt(sc.next());

            if (p == 0) {
                scores[i][1] = 0;
                continue;
            }

            if (!map.containsKey(p)) map.put(p, 0);
            map.put(p, map.get(p) + scores[i][0]);
            scores[i][1] = p;
        }

        int K = 0;
        for (int i = 0; i < N; i++) {
            if (scores[i][1] == 0) {
                K += scores[i][0];
            }
        }

        final int[] max = {-1};
        map.values().forEach(integer -> {
            if (max[0] < integer) max[0] = integer;
        });

        System.out.println((max[0] <= K)? "YES" : "NO");
    }
}
