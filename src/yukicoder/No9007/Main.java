package yukicoder.No9007;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());

        if (N != 1) {
            System.out.println(N + " 0");
        } else {
            System.out.println("0 " + N);
        }
    }
}
