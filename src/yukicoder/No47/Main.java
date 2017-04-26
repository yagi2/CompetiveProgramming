package yukicoder.No47;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = Long.parseLong(sc.next());

        int B = 1;
        int A = 0;
        while (B < N) {
            A++;
            B *= 2;
        }
        System.out.println(A);
    }
}
