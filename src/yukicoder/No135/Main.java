package yukicoder.No135;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());
        List<Integer> p = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            p.add(Integer.parseInt(sc.next()));
        }

        int d = Integer.MAX_VALUE;
        Collections.sort(p);
        for(int i = 0; i < N - 1; i++) {
            if (Math.abs(p.get(i) - p.get(i+1)) == 0) continue;
            if (d > Math.abs(p.get(i) - p.get(i+1))) d = Math.abs(p.get(i) - p.get(i+1));
        }
        System.out.println((d == Integer.MAX_VALUE)? "0" : d);
    }
}
