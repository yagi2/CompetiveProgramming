package yukicoder.No296;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = Long.parseLong(sc.next()) - 1;
        int H = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());
        int T = Integer.parseInt(sc.next());

        M += T * N;
        H += M / 60;
        M %= 60;
        H %= 24;

        System.out.printf("%d\n%d", H, M);

    }
}
