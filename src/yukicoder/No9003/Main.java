package yukicoder.No9003;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double N = Double.parseDouble(sc.next());
        double e = (0.0001 * N) + N;

        System.out.println("decimal");
        System.out.println(e);
    }
}
