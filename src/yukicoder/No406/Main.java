package yukicoder.No406;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());
        List<Long> kamos = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            kamos.add(Long.parseLong(sc.next()));
        }

        Collections.sort(kamos);

        List<Long> S = new ArrayList<>();
        for (int i = 0; i < N - 1; i++) {
            S.add(kamos.get(i+1) - kamos.get(i));
        }

        if (S.contains(new Long("0"))) {
            System.out.println("NO");
        } else {
            Set<Long> set = new HashSet<>(S);
            List<Long> d = new ArrayList<>(set);

            if (d.size() == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
