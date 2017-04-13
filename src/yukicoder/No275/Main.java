package yukicoder.No275;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(sc.next()));
        }

        Collections.sort(list);
        if (list.size() % 2 == 0) {
            System.out.printf("%f\n", (list.get(list.size() / 2) + list.get((list.size() / 2) - 1)) / 2.0f);
        } else {
            System.out.println(list.get(list.size() / 2));
        }
    }
}
