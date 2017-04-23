package yukicoder.No504;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
        long K = sc.nextLong();

        long NO = 1;
        System.out.println(NO);
        for (long i = 0; i < N-1; i++) {
            long tmp = sc.nextLong();
            if (K < tmp)NO++;
            System.out.println(NO);
        }
    }
}
