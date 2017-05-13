package atcoder.abc.abc061.b;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());

        Map<Integer, Integer> r = new HashMap<>();
        for (int i = 1; i <= N; i++) r.put(i, 0);

        int M = Integer.parseInt(sc.next());
        for (int i = 0; i < M; i++) {
            int A = Integer.parseInt(sc.next());
            int B = Integer.parseInt(sc.next());

            r.put(A, r.get(A)+1);
            r.put(B, r.get(B)+1);
        }

        r.forEach((i, i2) -> System.out.println(i2));
    }
}
