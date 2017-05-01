package aoj.ITP1_11.D;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Dice> dices = new ArrayList<>();

        int n = Integer.parseInt(sc.next());
        for (int i = 0; i < n; i++) {
            dices.add(new Dice());
            dices.get(i).inputDice(sc);
        }

        boolean flag = false;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (Dice.isSameDice(dices.get(i), dices.get(j))) {
                    flag = true;
                    break;
                }
            }
            if (flag) break;
        }
        System.out.println((!flag)? "Yes" : "No");
    }

    static class Dice {
        private List<Integer> D = new ArrayList<>();

        void inputDice(Scanner sc)  {
            for (int i = 0; i < 6; i++) D.add(Integer.parseInt(sc.next()));
        }

        int getTop() {
            return D.get(0);
        }


        int getFront() {
            return D.get(1);
        }

        int getRight() {
            return D.get(2);
        }

        int getBack() {
            return D.get(3);
        }

        int getLeft() {
            return D.get(4);
        }

        int getBottom() {
            return D.get(5);
        }

        int getSum() {
            final int[] sum = {0};
            D.forEach(integer -> sum[0] += integer);
            return sum[0];
        }

        void searchFromTopAndFront(int top, int front) {
            while (!(getTop() == top && getFront() == front)) {
                if (getTop() == top && getFront() != front) {
                    slideRight();
                } else if (getTop() != top && getFront() == front) {
                    moveE();
                } else {
                    moveN();
                }
            }
        }

        void move(String t) {
            for (String s : t.split("")) {
                switch (s) {
                    case "N":
                        moveN();
                        break;
                    case "E":
                        moveE();
                        break;
                    case "W":
                        moveW();
                        break;
                    case "S":
                        moveS();
                        break;
                }
            }
        }

        private void slideRight() {
            List<Integer> tmp = new ArrayList<>();

            tmp.add(D.get(0));
            tmp.add(D.get(3));
            tmp.add(D.get(1));
            tmp.add(D.get(4));
            tmp.add(D.get(2));
            tmp.add(D.get(5));

            D = new ArrayList<>(tmp);
        }

        private void slideLeft() {
            slideRight();
            slideRight();
            slideRight();
        }

        private void moveN() {
            List<Integer> tmp = new ArrayList<>();

            tmp.add(D.get(1));
            tmp.add(D.get(5));
            tmp.add(D.get(2));
            tmp.add(D.get(3));
            tmp.add(D.get(0));
            tmp.add(D.get(4));

            D = new ArrayList<>(tmp);
        }

        private void moveE() {
            List<Integer> tmp = new ArrayList<>();

            tmp.add(D.get(3));
            tmp.add(D.get(1));
            tmp.add(D.get(0));
            tmp.add(D.get(5));
            tmp.add(D.get(4));
            tmp.add(D.get(2));

            D = new ArrayList<>(tmp);
        }

        private void moveW() {
            moveE();
            moveE();
            moveE();
        }

        private void moveS() {
            moveN();
            moveN();
            moveN();
        }

        private void print() {
            D.forEach(integer -> System.out.printf("%d ", integer));

            System.out.println();
        }

        private boolean compareTo(Dice d) {
            return getFront() == d.getFront() &&
                    getRight() == d.getRight() &&
                    getBack() == d.getBack() &&
                    getLeft() == d.getLeft() &&
                    getTop() == d.getTop() &&
                    getBottom() == d.getBottom();

        }

        private boolean isDuplicate() {
            Map<Integer, Integer> map = new HashMap<>();

            D.forEach(integer -> {
                if (!map.containsKey(integer)) map.put(integer, 0);
                map.put(integer, map.get(integer) + 1);
            });

            final boolean[] res = {false};
            map.forEach((integer, integer2) -> {
                if (integer2 > 1) res[0] = true;
            });

            return res[0];
        }

        static boolean isSameDice(Dice f, Dice s) {
            if (f.getSum() != s.getSum()) return false;

            if (f.getTop() == f.getFront()) {
                while (f.getTop() == f.getFront()) {
                    f.slideRight();
                    f.moveN();
                }
            } else {
                for (int i = 0; i < 6; i++) {
                    if (f.getTop() == s.getTop() && f.getFront() == s.getFront()) break;

                    if (s.getTop() == f.getTop() && s.getFront() != f.getFront()) {
                        s.slideRight();
                    } else if (s.getTop() != f.getTop() && s.getFront() == f.getFront()) {
                        s.moveE();
                    } else {
                        s.moveN();
                    }
                }
            }
            return f.compareTo(s);
        }
    }
}
