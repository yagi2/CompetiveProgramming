package yukicoder.No311;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger N = new BigInteger(sc.next());
        // Fizz = 2 buzz = 2  FizzBuzz = 4;
        BigInteger cnt = N.divide(new BigInteger("5"));
        cnt = cnt.add(N.divide(new BigInteger("3")));

        System.out.println(cnt.multiply(new BigInteger("2")));
    }
}
