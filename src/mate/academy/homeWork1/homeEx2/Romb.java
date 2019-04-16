package mate.academy.homeWork1.homeEx2;

public class Romb {

    private static String STAR = "*";
    private static String SPACE = " ";

    public static void main(String[] args) {
        Romb romb = new Romb();
        romb.start(5);
    }

    public void string(int x, int spaces) {
        for (int i = 0; i < spaces; i++) {
            System.out.print(SPACE);
        }
        for (int i = 1; i <= x; i++) {
            System.out.print(STAR);
        }
        System.out.println();
    }

    public void start(int x) {
        int spaces = (x - 1) / 2;

        for (int i = 1; i <= x; i += 2) {
            string(i, spaces);
            if (spaces != 0) spaces--;
        }
        for (int i = x - 2; i >= 0; i -= 2) {
            string(i, spaces + 1);
            spaces++;
        }
    }
}
