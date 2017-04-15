package yukicoder.No441;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger A = new BigInteger(sc.next());
        BigInteger B = new BigInteger(sc.next());

        BigInteger S = A.add(B);
        BigInteger P = A.multiply(B);

        if (S.compareTo(P) > 0) {
            System.out.println("S");
        } else if (S.compareTo(P) < 0) {
            System.out.println("P");
        } else if (S.compareTo(P) == 0) {
            System.out.println("E");
        }
    }
}
