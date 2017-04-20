package yukicoder.No292;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        int i = Integer.parseInt(sc.next());
        int u = Integer.parseInt(sc.next());

        StringBuilder R = new StringBuilder();
        for (int j = 0; j < S.length(); j++) {
            if (j != i && j != u) {
                R.append(S.charAt(j));
            }
        }

        System.out.println(R);
    }
}
