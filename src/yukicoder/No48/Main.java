package yukicoder.No48;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = Integer.parseInt(sc.next());
        int Y = Integer.parseInt(sc.next());
        int L = Integer.parseInt(sc.next());

        int sum = 0;

        if (Y >= 0 && X == 0) {
            sum += (int)Math.ceil((double)Y / L);
        }
        if (Y >= 0 && Math.abs(X) > 0) {
            sum += (int)(Math.ceil((double)Y / L) + 1 + Math.ceil((double)Math.abs(X) / L));
        }
        if (Y < 0) {
            sum += (int)(1 + Math.ceil((double)Math.abs(X) / L) + 1 + Math.ceil((double)Math.abs(Y) / L));
        }

        System.out.println(sum);
    }
}
