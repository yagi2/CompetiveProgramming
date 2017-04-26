package yukicoder.No21;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());

        List<Integer> n = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            n.add(Integer.parseInt(sc.next()));
        }

        int ans = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (ans < Math.abs(n.get(i) - n.get(j))) {
                    ans = Math.abs(n.get(i) - n.get(j));
                }
            }
        }
        System.out.println(ans);
    }
}
