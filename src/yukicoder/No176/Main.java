package yukicoder.No176;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());

        List<Integer> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A.add(Integer.parseInt(sc.next()));
        }

        int cnt = 0;
        for (int i = 0; i < N - 2; i++) {
            if (isKadomatsu(A.get(i), A.get(i + 1), A.get(i + 2))) cnt++;
        }

        System.out.println(cnt);
    }

    private static boolean isKadomatsu(int a, int b, int c) {
        List<Integer> K = new ArrayList<>();
        K.add(a); K.add(b); K.add(c);
        K.sort((o1, o2) -> {
            if (o1 > o2) return -1;
            if (o1 < o2) return 1;
            return 0;
        });
        return (K.get(1) == a || K.get(1) == c) && (a != b && a != c && b != c);
    }
}
