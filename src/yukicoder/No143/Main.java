package yukicoder.No143;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int K = Integer.parseInt(sc.next());
        int N = Integer.parseInt(sc.next());
        int F = Integer.parseInt(sc.next());

        long sum = 0;
        for (int i = 0; i < F; i++) {
            sum += Long.parseLong(sc.next());
        }

        System.out.println((sum > (K * N))? "-1" : ((K * N) - sum));
    }
}
