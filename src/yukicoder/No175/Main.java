package yukicoder.No175;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L = Integer.parseInt(sc.next());
        int N = Integer.parseInt(sc.next());

        System.out.println((int)Math.pow(2, (L - 3)) * N);
    }
}
