package yukicoder.No379;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigDecimal N = new BigDecimal(sc.next());
        BigDecimal G = new BigDecimal(sc.next());
        BigDecimal V = new BigDecimal(sc.next());

        BigDecimal coin = N.divide(new BigDecimal("5"), BigDecimal.ROUND_FLOOR);
        BigDecimal gas = G.multiply(coin);
        System.out.println(gas.divide(V, 12, BigDecimal.ROUND_HALF_UP));
    }
}
