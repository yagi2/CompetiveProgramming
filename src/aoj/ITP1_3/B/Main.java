package aoj.ITP1_3.B;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1;
        while(true) {
            int n = sc.nextInt();
            if (n == 0) break;
            System.out.printf("Case %d: %d\n", i, n);
            i++;
        }
    }
}
