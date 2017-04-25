package yukicoder.No88;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String first = sc.next();

        List<String> ban = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            ban.add(sc.next());
        }

        int k = 0;
        for (int i = 0; i < 8; i++) {
            for (String s : ban.get(i).split("")) {
                if ("w".equals(s) || "b".equals(s)) k++;
            }
        }

        if (k % 2 == 0 ^ "oda".equals(first)) {
            System.out.println("yukiko");
        } else {
            System.out.println("oda");
        }
    }
}
