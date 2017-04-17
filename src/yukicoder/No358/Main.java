package yukicoder.No358;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> A = new ArrayList<>();
        for (int i = 0; i < 3; i ++) {
            A.add(Integer.parseInt(sc.next()));
        }

        int cnt = 0;
        for (int i = 3; i <= 2000; i ++) {
            List<Integer> T = new ArrayList<>();
            T.add(A.get(0) % i);
            T.add(A.get(1) % i);
            T.add(A.get(2) % i);

            if (isKadomatsu(T)) cnt++;
        }

        if (cnt >= 1000) {
            System.out.println("INF");
        } else {
            System.out.println(cnt);
        }
    }

    private static boolean isKadomatsu(List<Integer> A) {
        List<Integer> T = new ArrayList<>(A);

        return ((!Objects.equals(T.get(0), T.get(2)))&&((T.get(1) < T.get(0) && T.get(1) < T.get(2)) || (T.get(1) > T.get(0) && T.get(1) > T.get(2))));
    }
}
