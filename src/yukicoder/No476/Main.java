package yukicoder.No476;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());
        long A = Long.parseLong(sc.next());

        long sum = 0;
        for (int i = 0; i < N; i++) {
            sum += Long.parseLong(sc.next());
        }

        double avg = (double)sum / N;

        if ((double)A == avg) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
