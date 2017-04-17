package yukicoder.No369;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());

        BigInteger ans = BigInteger.ZERO;
        for (int i = 0; i < N; i++) {
            ans = ans.add(new BigInteger(sc.next()));
        }

        BigInteger V = new BigInteger(sc.next());

        System.out.println(ans.subtract(V));
    }
}
