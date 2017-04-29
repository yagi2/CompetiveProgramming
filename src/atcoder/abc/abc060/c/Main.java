package atcoder.abc.abc060.c;

import java.util.Scanner;

//WA
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long T = sc.nextLong();

        sc.nextInt();

        long X = T;
        for (int i = 0; i < N - 1; i++) {
            long t = sc.nextLong();
            if (t >= T) {
                X += T;
            } else {
                X += T- (T - t);
            }
            System.out.println(X);
        }
        System.out.println(X);
    }
}
