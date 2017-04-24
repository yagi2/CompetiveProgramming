package yukicoder.No128;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger N = new BigInteger(sc.next());
        BigInteger M = new BigInteger(sc.next());

        System.out.println(N.divide(M).divide(new BigInteger("1000")).multiply(new BigInteger("1000")));
    }
}
