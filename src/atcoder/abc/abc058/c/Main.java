package atcoder.abc.abc058.c;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// AC
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> inputs = new ArrayList<>();

        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            inputs.add(sc.next());
        }

        int maxInput = 0;
        for (int i = 1; i < inputs.size(); i++) {
            if (inputs.get(maxInput).length() < inputs.get(i).length()) {
                maxInput = i;
            }
        }

        String[] maxStrArr = inputs.get(maxInput).split("");
        List<String[]> otherStrArr = new ArrayList<>();
        for (int i = 0; i < inputs.size(); i++) {
            if (i == maxInput) continue;
            otherStrArr.add(inputs.get(i).split(""));
        }

        List<String> ansChars = new ArrayList<>();
        for (String aMaxStrArr : maxStrArr) {
            int matchCount = 0;
            for (String[] anOtherStrArr : otherStrArr) {
                for (int k = 0; k < anOtherStrArr.length; k++) {
                    if (aMaxStrArr.equals(anOtherStrArr[k])) {
                        matchCount++;
                        anOtherStrArr[k] = "";
                        break;
                    }
                }
            }

            if (matchCount == otherStrArr.size()) {
                ansChars.add(aMaxStrArr);
            }
        }

        Collections.sort(ansChars);

        for (String ansChar : ansChars) {
            System.out.print(ansChar);
        }
        System.out.println();
    }
}
