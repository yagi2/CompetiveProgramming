package yukicoder.No192;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());

        if (N % 2 == 0) System.out.println(N);
        if (N % 2 == 1) System.out.println(N-1);
    }
}
