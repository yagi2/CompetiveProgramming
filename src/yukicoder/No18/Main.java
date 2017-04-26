package yukicoder.No18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] S = sc.next().split("");
        StringBuilder ans = new StringBuilder();

        List<String> a = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"));

        for (int i = 0; i < S.length; i++) {
            int tmp = a.indexOf(S[i]) - i - 1;

            if (tmp >= 0) {
                ans.append(a.get(tmp));
            } else if (-tmp % 26 == 0) {
                ans.append("A");
            }
            else {
                tmp = -tmp;
                tmp %= 26;
                ans.append(a.get(26-tmp));
            }
        }
        System.out.println(ans);
    }
}
