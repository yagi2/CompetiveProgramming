package yukicoder.No3000;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, String> A = new HashMap<>();

        A.put("p", "o");
        A.put("f", "r");
        A.put("n", "a");
        A.put("o", "n");
        A.put("v", "g");
        A.put("u", "e");
        A.put("a", "c");
        A.put("x", "i");
        A.put("q", "p");
        A.put("w", "h");
        A.put("f", "r");
        A.put("m", "b");
        A.put("b", "q");
        A.put("g", "s");
        A.put("r", "u");
        A.put("i", "f");
        A.put("h", "t");
        A.put("c", "l");
        A.put("d", "m");
        A.put("e", "d");
        A.put("j", "x");
        A.put("k", "y");
        A.put("o", "n");
        A.put("l", "z");
        A.put("s", "v");
        A.put("t", "w");
        A.put("y", "j");
        A.put("z", "k");

        Scanner sc = new Scanner(System.in);

        String S = sc.next();

        StringBuilder ans = new StringBuilder();
        for (String s : S.split("")) {
            ans.append(A.get(s));
        }
        System.out.println(ans);
    }
}
