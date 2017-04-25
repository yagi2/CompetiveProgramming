package yukicoder.No69;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<String, Integer> A = input(sc);
        HashMap<String, Integer> B = input(sc);

        System.out.println((A.equals(B))? "YES" : "NO");
    }

    private static HashMap<String, Integer> input(Scanner sc) {
        HashMap<String, Integer> res = new HashMap<>();
        for (String s : sc.next().split("")) {
            if (!res.containsKey(s)) res.put(s, 0);
            res.put(s, res.get(s) + 1);
        }

        return res;
    }
}
