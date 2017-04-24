package yukicoder.No138;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();

        int Amj = Integer.parseInt(A.split("\\.")[0]);
        int Amm = Integer.parseInt(A.split("\\.")[1]);
        int Ami = Integer.parseInt(A.split("\\.")[2]);

        String B = sc.next();

        int Bmj = Integer.parseInt(B.split("\\.")[0]);
        int Bmm = Integer.parseInt(B.split("\\.")[1]);
        int Bmi = Integer.parseInt(B.split("\\.")[2]);

        if (Amj > Bmj) {
            System.out.println("YES");
        } else if (Amj < Bmj) {
            System.out.println("NO");
        } else {
            if (Amm > Bmm) {
                System.out.println("YES");
            } else if (Amm < Bmm) {
                System.out.println("NO");
            } else {
                if (Ami >= Bmi) {
                    System.out.println("YES");
                } else if (Ami < Bmi) {
                    System.out.println("NO");
                }
            }
        }
    }
}
