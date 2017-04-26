package yukicoder.No22;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());

        String[] S = sc.next().split("");

        Map<Integer, Integer> dp = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            if (S[i].equals("(")) {
                stack.push(i);
            } else {
                int n = stack.pop();
                dp.put(i, n);
                dp.put(n, i);
            }
        }

        System.out.println(dp.get(K - 1) + 1);
    }
}
