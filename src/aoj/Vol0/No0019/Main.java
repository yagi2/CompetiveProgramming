package aoj.Vol0.No0019;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        System.out.println(fact(n));
    }

    private static long fact(int n) {
        if (n == 0) return 1;
        return n * fact(n - 1);
    }
}
