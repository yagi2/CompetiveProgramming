package yukicoder.No373;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(new BigInteger(sc.next()).multiply(new BigInteger(sc.next())).multiply(new BigInteger(sc.next())).mod(new BigInteger(sc.next())));
    }
}
