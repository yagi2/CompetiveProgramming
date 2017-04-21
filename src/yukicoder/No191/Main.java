package yukicoder.No191;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = Long.parseLong(sc.next());

        List<Long> votes = new ArrayList<>();
        for (long i = 0; i < N; i++) {
            votes.add(Long.parseLong(sc.next()));
        }
        final long[] allVotes = {0};
        votes.forEach(aLong -> allVotes[0] += aLong);

        final int[] cnt = {0};
        votes.forEach(aLong -> {
            if (aLong <= allVotes[0] / 10) cnt[0] += 30;
        });
        System.out.println(cnt[0]);
    }
}
