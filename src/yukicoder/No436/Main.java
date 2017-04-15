package yukicoder.No436;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();

        int c = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'w')break;
            if (S.charAt(i) == 'c') {
                c++;
            }
        }
        int w = S.length() - c;

        if (c <= w) {
            System.out.println(c-1);
        } else if (c > w) {
            System.out.println(w);
        }
    }
}
