package yukicoder.No480;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());

        int ans = 0;
        for (int i = 1; i <= N; i++) {
            ans += i;
        }
        System.out.println(ans);
    }
}
