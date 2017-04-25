package yukicoder.No3004;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> S = new ArrayList<>(Arrays.asList("y", "u", "k", "i", "c", "o", "d", "e", "r"));
        while (true) {
            int N = Integer.parseInt(sc.next());

            if (N == 0) break;
            System.out.println(S.get(N-1));
        }
    }
}
