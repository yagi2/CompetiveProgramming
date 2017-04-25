package yukicoder.No51;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int W = Integer.parseInt(sc.next());
        int D = Integer.parseInt(sc.next());

        int K = 0;
        for (int i = D; i > 0; i--) {
            K = (int)Math.floor(W / Math.pow(i, 2));
            W -= K;
        }
        System.out.println(K);
    }
}
