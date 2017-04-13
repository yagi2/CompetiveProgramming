package yukicoder.No188;

public class Main {
    public static void main(String[] args) {
        int ans = 0;
        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= 31; j++) {
                if (i == 2 && j == 29) break;
                if ((i == 4 || i == 6 || i == 9 || i == 11) && j == 30) break;

                int a = j % 10;
                int b = (int)(j / 10);

                if (i == a + b) ans++;
            }
        }

        System.out.println(ans);
    }
}
