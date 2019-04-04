package mate.academy.homeWork1.homeEx4;


import java.util.Scanner;

public class Recursions {

    public static void main(String[] args) {

        System.out.println("Введите переменную от которой вы хотите узнать число Фибоначчи : ");
        Scanner input = new Scanner(System.in);
        System.out.println("Число Фибоначчи от " + input.nextInt() + " равно : " + fibonacci(input.nextInt()));

        System.out.println("Факториал 6  = " + factorial(6));

        System.out.println("Ряд Тейлора 1 с индексом 2 = " + taylor(2, 1));
    }

    static int fibonacci(int chislo) {
        if (chislo == 0) {
            return 0;
        } else if (chislo == 1) {
            return 1;
        } else {
            return (fibonacci(chislo - 1) + fibonacci(chislo - 2));
        }
    }

    public static int factorial(int number) {
        if (number <= 1) {
            return 1;
        }
        int result = factorial(number - 1) * number;
        return result;
    }

    public static double taylor(int index, int value) {
        if (index == 0) {
            return 1;
        }
        double negativeOnePowered = Math.pow(-1, index);
        double indexFactorial = factorial(index * 2);
        double valuePowered = Math.pow(value, 2 * index);
        double recursion = taylor(index - 1, value);
        double result = (negativeOnePowered / indexFactorial) *  valuePowered + recursion;
        return result;
    }
}
