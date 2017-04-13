package yukicoder.No9008;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        long[] nums = new long[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextLong();
        }

        long sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        System.out.println(sum);
    }
}
