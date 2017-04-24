package yukicoder.No166;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger H = new BigInteger(sc.next());
        BigInteger W = new BigInteger(sc.next());
        BigInteger N = new BigInteger(sc.next());
        BigInteger K = new BigInteger(sc.next());

        System.out.println((H.multiply(W).subtract(BigInteger.ONE).mod(N).add(BigInteger.ONE).compareTo(K) == 0)? "YES" : "NO");
    }
}