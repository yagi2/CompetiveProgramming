package aoj.ITP1_4.C;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int a = Integer.parseInt(sc.next());
            String op = sc.next();
            int b = Integer.parseInt(sc.next());

            if ("?".equals(op)) break;

            switch (op) {
                case "+":
                    System.out.println(a+b);
                    break;
                case "-":
                    System.out.println(a-b);
                    break;
                case "*":
                    System.out.println(a*b);
                    break;
                case "/":
                    System.out.println((int)Math.floor(a/b));
                    break;
            }
        }
    }
}
