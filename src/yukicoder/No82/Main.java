package yukicoder.No82;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int W = Integer.parseInt(sc.next());
        int H = Integer.parseInt(sc.next());

        String S = sc.next();
        String N = "W".equals(S)? "B" : "W";

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        System.out.print(S);
                    } else {
                        System.out.print(N);
                    }
                } else {
                    if (j % 2 == 0) {
                        System.out.print(N);
                    } else {
                        System.out.print(S);
                    }
                }
            }
            System.out.println();
        }
    }
}
