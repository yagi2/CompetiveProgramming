package yukicoder.No63;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long L = Long.parseLong(sc.next());
        int K = Integer.parseInt(sc.next());

        int num = (int)Math.ceil(L / 2.0 / K);
        System.out.println(K * (num - 1));
    }
}
