package atcoder.abc.abc059.b;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger A = new BigInteger(sc.next());
        BigInteger B = new BigInteger(sc.next());

        if (A.compareTo(B) == 1) System.out.println("GREATER");
        if (A.compareTo(B) == -1) System.out.println("LESS");
        if (A.compareTo(B) == 0) System.out.println("EQUAL");
    }
}
