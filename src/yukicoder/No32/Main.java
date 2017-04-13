package yukicoder.No32;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());
        int N = Integer.parseInt(sc.next());

        int ans = 0;

        // 1->25
        M += (int)N / 25;
        ans += N % 25;
        // 25->100
        L += (int)M / 4;
        ans += M % 4;
        // 100->1000
        ans += L % 10;

        System.out.println(ans);
    }
}
