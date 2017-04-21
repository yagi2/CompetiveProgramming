package yukicoder.No185;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());

        int ans = 0;
        int tmp = 0;


        int X;
        int Y;

        for (int i = 0; i < N; i++) {
            X = Integer.parseInt(sc.next());
            Y = Integer.parseInt(sc.next());
            ans = Y - X;
            if (i == 0)tmp = ans;
            if (ans <= 0 || ans != tmp) {
                ans = -1;
                break;
            }
            tmp = ans;
        }
        System.out.println(ans);
    }
}
