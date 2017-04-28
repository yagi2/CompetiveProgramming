package aoj.ITP1_7.A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int m = Integer.parseInt(sc.next());
            int f = Integer.parseInt(sc.next());
            int r = Integer.parseInt(sc.next());

            if (m == -1 && f == -1 && r == -1) break;

            if (m == -1 || f == -1) {
                System.out.println("F");
            } else if (m + f >= 80) {
                System.out.println("A");
            } else if (m + f >= 65 && m + f < 80) {
                System.out.println("B");
            } else if (m + f >= 50 && m + f < 65) {
                System.out.println("C");
            } else if (m + f >= 30 && m + f < 50) {
                if (r >= 50) {
                    System.out.println("C");
                } else {
                    System.out.println("D");
                }
            } else if (m + f < 30) {
                System.out.println("F");
            }
        }
    }
}
