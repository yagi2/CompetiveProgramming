package yukicoder.No400;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuffer S = new StringBuffer(sc.next());
        S.reverse();

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '>') ans.append("<");
            if (S.charAt(i) == '<') ans.append(">");
        }

        System.out.println(ans);
    }
}
