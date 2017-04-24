package yukicoder.No159;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double p = Double.parseDouble(sc.next());
        double q = Double.parseDouble(sc.next());

        System.out.println(((1 - p) * q < p * (1 - q) * q)? "YES" : "NO");
    }
}
