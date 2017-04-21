package yukicoder.No231;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int D = Integer.parseInt(sc.next());

        boolean f = false;
        for (int i = 1; i <= D; i++) {
            if (sc.nextLong() - sc.nextInt() * 30000 >= 500000) {
                f = true;
                System.out.println("YES");
                System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n", i, i, i, i, i, i);
                break;
            }
        }
        if (!f) {
            System.out.println("NO");
        }
    }
}
