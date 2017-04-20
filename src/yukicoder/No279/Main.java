package yukicoder.No279;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        int t = 0, r = 0, e = 0;

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 't') t++;
            if (S.charAt(i) == 'r') r++;
            if (S.charAt(i) == 'e') e++;
        }

        e /= 2;

        List<Integer> tree = new ArrayList<>();

        tree.add(t);
        tree.add(r);
        tree.add(e);

        Collections.sort(tree);
        System.out.println(tree.get(0));
    }
}
