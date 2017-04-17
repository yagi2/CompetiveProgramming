package yukicoder.No378;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger N = new BigInteger(sc.next());

        BigInteger tmp = N;
        BigInteger M = BigInteger.ZERO;
        while (tmp.compareTo(BigInteger.ZERO) == 1) {
            M = M.add(tmp);
            tmp = tmp.divide(new BigInteger("2"));
        }

        BigInteger Q = N.multiply(new BigInteger("2"));

        System.out.println(Q.subtract(M));
    }
}
