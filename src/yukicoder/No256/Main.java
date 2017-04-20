package yukicoder.No256;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] S = sc.next().split("");
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(S));

        list.sort((o1, o2) -> {
            int o1n = Integer.parseInt(o1);
            int o2n = Integer.parseInt(o2);

            if (o1n > o2n) return -1;
            if (o1n < o2n) return 1;
            return 0;
        });

        for (String s : list) {
            System.out.print(s);
        }
        System.out.println();
    }
}
