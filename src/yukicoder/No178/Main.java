package yukicoder.No178;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());
        List<BigInteger> width = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            width.add(new BigInteger(sc.next()).add(new BigInteger(sc.next()).multiply(new BigInteger("4"))));
        }

        width.sort((o1, o2) -> {
            if (o1.compareTo(o2) == 1) return -1;
            if (o1.compareTo(o2) == -1) return 1;
            return 0;
        });
        BigInteger max = width.get(0);

        boolean flag = true;
        BigInteger cnt = BigInteger.ZERO;
        for (int i = 1; i < N; i++) {
            if (width.get(i).compareTo(max) == 0) continue;
            if (max.subtract(width.get(i)).mod(new BigInteger("2")).compareTo(BigInteger.ZERO) == 0) {
                cnt = cnt.add(max.subtract(width.get(i)).divide(new BigInteger("2")));
            } else {
                flag = false;
                break;
            }
        }
        System.out.println((flag)? cnt : "-1");
    }
}
