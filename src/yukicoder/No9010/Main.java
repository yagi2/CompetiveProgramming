package yukicoder.No9010;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger N = new BigInteger(sc.next());

        if (N.mod(new BigInteger("4")).compareTo(BigInteger.ZERO) == 0) {
            if (N.mod(new BigInteger("100")).compareTo(BigInteger.ZERO) == 0) {
                if (N.mod(new BigInteger("400")).compareTo(BigInteger.ZERO) == 0) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            } else {
                System.out.println("Yes");
            }
        } else {
            System.out.println("No");
        }
    }
}
