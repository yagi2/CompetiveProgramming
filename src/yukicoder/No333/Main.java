package yukicoder.No333;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long A = Integer.parseInt(sc.next());
        long B = Integer.parseInt(sc.next());
        System.out.println((A > B)? (2000000000 - B - 1) : (B - 2));
    }
}