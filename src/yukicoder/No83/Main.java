package yukicoder.No83;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());

        List<Integer> ans = new ArrayList<>();
        while (N > 0) {
            if (N % 2 == 1) {
                ans.add(7);
                N -= 3;
            } else {
                ans.add(1);
                N -= 2;
            }
        }

        ans.forEach(System.out::print);
        System.out.println();
    }
}
