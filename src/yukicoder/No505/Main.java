package yukicoder.No505;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());
        List<Integer> nums = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            nums.add(Integer.parseInt(sc.next()));
        }

        long max = nums.get(0);
        long min = nums.get(0);
        for (int i = 1; i < N; i++) {
            long tmax = Long.MIN_VALUE;
            long tmin = Long.MAX_VALUE;

            tmax = Math.max(tmax, max + nums.get(i));
            tmin = Math.min(tmin, min + nums.get(i));

            tmax = Math.max(tmax, max - nums.get(i));
            tmin = Math.min(tmin, min - nums.get(i));

            tmax = Math.max(tmax, max * nums.get(i));
            tmin = Math.min(tmin, min * nums.get(i));

            if (nums.get(i) != 0) {
                tmax = Math.max(tmax, max / nums.get(i));
                tmax = Math.max(tmax, min / nums.get(i));

                tmin = Math.min(tmin, max / nums.get(i));
                tmin = Math.min(tmin, min / nums.get(i));
            }

            min = tmin;
            max = tmax;
        }
        System.out.println(max);
    }
}
