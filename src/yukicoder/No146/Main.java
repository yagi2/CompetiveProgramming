package yukicoder.No146;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());

        Map<BigDecimal, BigDecimal> desks = new HashMap<>();
        for (int i = 0; i < N; i++) {
            desks.put(new BigDecimal(sc.next()), new BigDecimal(sc.next()));
        }

        final BigDecimal[] can = {BigDecimal.ZERO};
        desks.forEach((bigDecimal, bigDecimal2) -> can[0] = can[0].add(bigDecimal.divide(new BigDecimal("2"), BigDecimal.ROUND_CEILING).multiply(bigDecimal2)));

        System.out.println(can[0].toBigInteger().mod(new BigInteger("10").pow(9).add(new BigInteger("7"))));
    }
}
