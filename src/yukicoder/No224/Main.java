package yukicoder.No224;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());
        String[] S = sc.next().split("");
        String[] T = sc.next().split("");

        int cnt = 0;
        for (int i = 0; i < N; i++) {
            if (!Objects.equals(S[i], T[i])) cnt++;
        }

        System.out.println(cnt);
    }
}
