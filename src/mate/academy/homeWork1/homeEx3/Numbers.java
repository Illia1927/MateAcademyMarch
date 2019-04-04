package mate.academy.homeWork1.homeEx3;

public class Numbers {
    public static void main(String[] args) {

        System.out.println(multiplyNumber(2));
        System.out.println(degree(3, 3));
        System.out.println(cube(3));
    }
    private static int multiplyNumber(int number){
        int rezult = number * number;
        return rezult;
    }
    private static int degree(int a, int b){
        int rezult = 1;
        for (int i = 1; i < b; i++) {
            rezult = rezult * a;
        }
        return rezult;
    }
    private static int cube(int a){
        int rezult = a * a * a;
        return rezult;
    }
}
