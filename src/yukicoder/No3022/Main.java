package yukicoder.No3022;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());

        List<String> num = new ArrayList<>();

        num.add("zero");
        num.add("one");
        num.add("two");
        num.add("three");
        num.add("four");
        num.add("five");

        for (int i = num.indexOf("one"); i <= N; i++) {
            if (i % (num.indexOf("three") * num.indexOf("five")) == num.indexOf("zero")) {
                System.out.println("FizzBuzz");
            } else if (i % num.indexOf("three") == num.indexOf("zero")) {
                System.out.println("Fizz");
            } else if (i % num.indexOf("five") == num.indexOf("zero")) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
