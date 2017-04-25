package yukicoder.No56;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long D = Long.parseLong(sc.next());
        int P = Integer.parseInt(sc.next());

        D *= 100 + P;
        D /= 100;
        System.out.println(D);
    }
}
