package yukicoder.No46;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());

        long ans = (long)(b / a);

        if (b % a != 0) {
            ans++;
        }

        System.out.println(ans);
    }
}
