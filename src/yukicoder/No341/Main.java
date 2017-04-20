package yukicoder.No341;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        int max = 0;

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '…') {
                int tmp = 1;
                for (int j = i + 1; j < S.length(); j++) {
                    if (S.charAt(j) != '…') break;
                    tmp++;
                }
                if (max < tmp) max = tmp;
            }
        }

        System.out.println(max);
    }
}
