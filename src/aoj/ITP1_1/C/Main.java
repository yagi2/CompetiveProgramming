package aoj.ITP1_1.C;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(String.format("%d %d", a*b, (a*2)+(b*2)));
    }
}
