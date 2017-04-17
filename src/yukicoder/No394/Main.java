package yukicoder.No394;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> scores = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            scores.add(Integer.parseInt(sc.next()));
        }
        Collections.sort(scores);
        scores.remove(0);
        scores.remove(scores.size()-1);

        int sum = 0;
        for (int i : scores) {
            sum += i;
        }
        System.out.printf("%.2f\n",sum / 4.0);
    }
}
