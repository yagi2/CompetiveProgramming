package yukicoder.No477;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger N = new BigInteger(sc.next());
        BigInteger K = new BigInteger(sc.next());

        N = N.divide(K.add(new BigInteger("1")));
        System.out.println(N.add(new BigInteger("1")));
    }
}
