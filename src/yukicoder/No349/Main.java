package yukicoder.No349;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());

        Map<String, Integer> F = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String input = sc.next();

            if (!F.containsKey(input)) {
                F.put(input, 0);
            }
            F.put(input, F.get(input) + 1);
        }

        int max = -1;
        for (Integer value : F.values()) {
            if (max < value) {
                max = value;
            }
        }

        if (2 * (max - 1) < N) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
