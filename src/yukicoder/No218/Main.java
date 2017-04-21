package yukicoder.No218;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());
        long c = Long.parseLong(sc.next());

        int normal = (int)Math.ceil((double)a / b);
        int bonus = (int)Math.ceil((double)a / c);
        int border = (int)Math.floor((double)normal * (2.0 / 3.0));

        System.out.println((bonus <= border)? "YES" : "NO");
    }
}
