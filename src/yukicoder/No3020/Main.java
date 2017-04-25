package yukicoder.No3020;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] S = sc.next().split("");

        Map<String, Integer> YEAH = new HashMap<>();
        for (String s : S) {
            if (!YEAH.containsKey(s)) YEAH.put(s, 0);
            YEAH.put(s, YEAH.get(s) + 1);
        }

        System.out.printf("%d %d %d %d %d\n",
                (YEAH.containsKey("Y"))? YEAH.get("Y") : 0,
                (YEAH.containsKey("E"))? YEAH.get("E") : 0,
                (YEAH.containsKey("A"))? YEAH.get("A") : 0,
                (YEAH.containsKey("H"))? YEAH.get("H") : 0,
                (YEAH.containsKey("!"))? YEAH.get("!") : 0);
    }
}
