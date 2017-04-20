package yukicoder.No345;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        List<Integer> cwwList = new ArrayList<>();
        for (int i = 0; i < S.length() - 1; i++) {
            int n = 0;
            if (S.charAt(i) == 'c') {
                int wwCount = 0;
                for (int j = i+1; j < S.length(); j++) {
                   if (S.charAt(j) == 'w') wwCount++;
                   if (wwCount == 2) {
                       n = j+1;
                       break;
                   }

                }
            }
            n -= i;
            if (n > 0) {
                cwwList.add(n);
            }
        }

        if (cwwList.size() == 0) {
            System.out.println("-1");
        } else {
            int min = Integer.MAX_VALUE;
            for (Integer n : cwwList) {
                if (min > n) min = n;
            }
            System.out.println(min);
        }
    }
}
