package yukicoder.No481;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean map[];
        map = new boolean[11];
        List<Integer> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 9; i++){
            list.add(Integer.parseInt(sc.next()));
            map[list.get(i)] = true;
        }

        for (int i = 1; i <= 10; i++) {
            if (!map[i]) {
                System.out.println(i);
            }
        }
    }
}
