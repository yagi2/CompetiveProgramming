package yukicoder.No111;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long L = Long.parseLong(sc.next());

        long cnt = 0;
        for (int i = 3; i <= L; i++) {
            if (i % 2 == 0) continue;
            cnt += L - i + 1;
        }
        System.out.println(cnt);
    }
}
