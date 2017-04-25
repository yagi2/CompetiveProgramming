package yukicoder.No99;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());

        List<Long> X = new ArrayList<>();

        int even = 0;
        int odd = 0;

        for (int i = 0; i < N; i++) {
            X.add(Long.parseLong(sc.next()));

            if (X.get(i) % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        if (even == odd) {
            System.out.println("0");
        } else {
            System.out.println((even > odd)? even-odd : odd-even);
        }
    }
}
