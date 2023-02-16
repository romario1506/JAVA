package lesson2;

public class HomeWorkTwo {

    public static void main(String[] args) {
        System.out.println(method1(15, 12));
        method2(-5);
        System.out.println(method3(-1));
        method4("ok", 10);
        System.out.println(method5(900));


    }

    public static boolean method1(int a, int b) {
        System.out.print(" Метод 1. ");
        int sum = a + b;
        return sum > 10 && sum < 20;

    }

    public static void method2(int a) {
        System.out.print(" Метод 2. ");
        if (a >= 0)
            System.out.println(a + " - число положительное");
        else
            System.out.println(a + " - число отрицательное");
    }

    public static boolean method3(int a) {
        System.out.print(" Метод 3. ");
        return a < 0;
    }

    public static void method4(String word, int count) {
        System.out.print(" Метод 4. ");
        System.out.println();
        for (int i = 1; i <= count; i++) {
            System.out.println("" + i + ". " + " " + word);
        }
    }

    public static boolean method5(int year) {
        System.out.print(" Метод 5. ");
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return year % 4 == 0;
        }
    }
}
