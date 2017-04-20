package yukicoder.No299;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(new BigInteger(sc.next()).subtract(BigInteger.ONE).multiply(new BigInteger("52")).add(new BigInteger("316")));
    }
}
