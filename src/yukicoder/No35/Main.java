package yukicoder.No35;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());

        int CN = 0;
        int MN = 0;
        for (int i = 0; i < N; i++) {
            int M = Integer.parseInt(sc.next());
            String[] S = sc.next().split("");

            if ((int)Math.floor((12 * M / 1000.0)) >= S.length) {
                CN += S.length;
            } else {
                int tmp = (int)Math.floor(12 * M / 1000.0);
                CN += tmp;
                MN += S.length - tmp;
            }
        }
        System.out.printf("%d %d\n", CN, MN);
    }
}
