package yukicoder.No485;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());

        double D = (double)B / A;

        if (D - Math.floor(D) == 0.0) {
            System.out.printf("%d\n", (int)Math.floor(D));
        } else {
            System.out.println("NO");
        }
    }
}
