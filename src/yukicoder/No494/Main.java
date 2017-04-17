package yukicoder.No494;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] CS = "yukicoder".split("");

        Scanner sc = new Scanner(System.in);

        String WS = sc.next();

        for (int i = 0; i < WS.length(); i++) {
            if (WS.charAt(i) == '?') {
                System.out.println(CS[i]);
                break;
            }
        }
    }
}
