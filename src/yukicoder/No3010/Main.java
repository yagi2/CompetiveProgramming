package yukicoder.No3010;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        File f = new File("/bin");
        String[] s = f.list();

        Arrays.sort(s);
        for (String t : s) {
            System.out.println(t);
        }
    }
}
