package yukicoder.No5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L = Integer.parseInt(sc.next());
        int N = Integer.parseInt(sc.next());

        List<Integer> blocks = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            blocks.add(Integer.parseInt(sc.next()));
        }
        Collections.sort(blocks);

        int ans = 0;
        for (int i = 0; i < N; i++) {
            if (L - blocks.get(i) >= 0) {
                ans++;
                L -= blocks.get(i);
            } else {
                break;
            }
        }

        System.out.println(ans);
    }
}
