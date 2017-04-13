package yukicoder.No289;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] sp = sc.next().split("");

        int ans = 0;
        for (String s : sp) {
            if (Character.isDigit(s.charAt(0))) {
                ans += Integer.parseInt(s);
            }
        }
        System.out.println(ans);
    }
}
