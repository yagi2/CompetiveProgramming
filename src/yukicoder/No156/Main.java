package yukicoder.No156;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());

        List<Integer> candies = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            candies.add(Integer.parseInt(sc.next()));
        }
        Collections.sort(candies);

        int index = 0;
        for (int i = 0; i < M; i++) {
            if (candies.get(index) == 0) index++;
            int tmp = candies.get(index);
            candies.remove(index);
            candies.add(tmp - 1);
            Collections.sort(candies);
        }

        final int[] cnt = {0};
        candies.forEach(integer -> {
            if (integer == 0) cnt[0]++;
        });

        System.out.println(cnt[0]);
    }
}
