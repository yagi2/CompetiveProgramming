package yukicoder.No26;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int circle = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());

        for (int i = 0; i < M; i++) {
            int b = Integer.parseInt(sc.next());
            int a = Integer.parseInt(sc.next());

            if (b == circle) {
                circle = a;
            } else if (a == circle) {
                circle = b;
            }
        }
        System.out.println(circle);
    }
}
