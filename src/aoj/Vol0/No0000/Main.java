package aoj.Vol0.No0000;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <=9; j++) {
                System.out.println(String.format("%dx%d=%d", i, j, i*j));
            }
        }
    }
}
