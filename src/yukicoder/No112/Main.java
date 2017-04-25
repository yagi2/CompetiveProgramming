package yukicoder.No112;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());

        List<Integer> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A.add(Integer.parseInt(sc.next()));
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            if (max < A.get(i)) max = A.get(i);
            if (min > A.get(i)) min = A.get(i);
        }

        if (max != min) {
            int K = 0;
            int T = 0;
            for (int i = 0; i < N; i++) {
                if (A.get(i) == max) T++;
                if (A.get(i) == min) K++;
            }
            System.out.printf("%d %d\n", T, K);
        } else {
            System.out.println(((max / (A.size() - 1)) == 2)? (A.size() + " 0") : ("0 " + A.size()));
        }
    }
}
