package aoj.ITP1_4.A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf("%d %d %f\n", a / b, a % b, (double)a / b);
    }
}
