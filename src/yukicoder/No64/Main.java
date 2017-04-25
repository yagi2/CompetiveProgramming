package yukicoder.No64;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long F0 = Long.parseLong(sc.next());
        long F1 = Long.parseLong(sc.next());
        long N = Long.parseLong(sc.next()) % 3;

        List<Long> X = new ArrayList<>();
        X.add(F0);
        X.add(F1);
        X.add(X.get(0) ^ X.get(1));

        System.out.println(X.get((int) (N%3)));


    }
}
