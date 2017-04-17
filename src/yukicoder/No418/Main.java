package yukicoder.No418;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next() + "A";

        int cnt = 0;
        boolean minFlag = false;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'm' && S.charAt(i+1) == 'i') minFlag = true;
            if (minFlag && S.charAt(i) == 'n') {
                cnt++;
                minFlag = false;
            }
        }

        System.out.println(cnt);
    }
}
