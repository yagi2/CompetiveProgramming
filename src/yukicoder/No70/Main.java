package yukicoder.No70;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int sum = 0;
        for (int i = 0; i < N; i++) {
            String G = sc.next();
            String W = sc.next();

            int Gh = Integer.parseInt(G.split(":")[0]);
            int Gm = Integer.parseInt(G.split(":")[1]);
            int Wh = Integer.parseInt(W.split(":")[0]);
            int Wm = Integer.parseInt(W.split(":")[1]);

            sum += ((Wh - Gh) * 60 + (Wm - Gm) + 24 * 60) % (24 * 60);
        }
        System.out.println(sum);
    }
}
