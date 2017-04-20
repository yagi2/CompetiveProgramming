package yukicoder.No337;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());
        int P = Integer.parseInt(sc.next());

        System.out.println((P == N * P) ? "=" : "!=");
    }
}
