package yukicoder.No495;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();

        long right = 0;
        long left = 0;

        String[] sp = S.split("");
        for (int i = 0; i < sp.length; i++) {
            if (i != sp.length - 1) {
                if (sp[i].equals("^") && sp[i+1].equals("*")) {
                    left++;
                }
                if (sp[i].equals("(") && sp[i+1].equals("*")) {
                    right++;
                }
            }
        }
        System.out.println(left + " " + right);
    }
}
