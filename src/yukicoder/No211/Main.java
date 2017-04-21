package yukicoder.No211;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int K = Integer.parseInt(sc.next());

        int sum = 0;
        int[][] dice = {{2, 3, 5, 7, 11, 13}, {4, 6, 8, 9, 10, 12}};

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (dice[0][i] * dice[1][j] == K) sum++;
            }
        }

        System.out.println((double)sum / 36);
    }
}
