package yukicoder.No395;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = Integer.parseInt(sc.next());

        if (A < 15) {
            System.out.println("-1");
        } else {
            for (int i = 8;;i++) {
                if (A - i == 7) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
