package yukicoder.No123;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());

        List<Integer> trump = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            trump.add(i);
        }

        for (int i = 0; i < M; i++) {
            int maime = Integer.parseInt(sc.next());
            int tmp = trump.get(maime-1);
            trump.remove(maime-1);
            trump.add(0, tmp);
        }

        System.out.println(trump.get(0));
    }
}
