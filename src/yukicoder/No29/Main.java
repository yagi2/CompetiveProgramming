package yukicoder.No29;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());

        Map<Integer, Integer> items = new HashMap<>();
        for (int i = 0; i < N * 3; i++) {
            int a = Integer.parseInt(sc.next());

            if (!items.containsKey(a)) items.put(a, 0);
            items.put(a, items.get(a) + 1);
        }

        int[] powerUp = {0};
        items.forEach((integer, integer2) -> {
            if (integer2 >= 2) {
                powerUp[0] += integer2 / 2;
                items.put(integer, integer2 % 2);
            }
        });

        int[] ac = {0};
        items.forEach((integer, integer2) -> {
            if (integer2 == 1) {
                ac[0]++;
            }
            if (ac[0] == 4) {
                powerUp[0]++;
                ac[0] = 0;
            }
        });

        System.out.println(powerUp[0]);
    }
}
