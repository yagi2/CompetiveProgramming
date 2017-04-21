package yukicoder.No201;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        BigInteger AP = new BigInteger(sc.next());

        sc.next();

        String B = sc.next();
        BigInteger BP = new BigInteger(sc.next());

        if (AP.compareTo(BP) == 0) System.out.println("-1");
        if (AP.compareTo(BP) == -1)  System.out.println(B);
        if (AP.compareTo(BP) == 1) System.out.println(A);
    }
}
