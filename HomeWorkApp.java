package lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
        System.out.println("Привет ОкуДЖАВА");
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }


    static void printThreeWords() {

        System.out.println("_________");
        System.out.println("|Orange |");
        System.out.println("|Banana |");
        System.out.println("|Apple  |");
        System.out.println("---------");
    }

    static void checkSumSign() {
        int varA = 2;
        int varB = -2;

        System.out.println("3. Сумма переменных = " + (varA + varB));

        if ((varA + varB) >= 0) {
            System.out.println("Сумма положительная");
        }
        if ((varA + varB) < 0) {
            System.out.println("Сумма отрицательная");
        }
    }
    private static void printColor() {

        int value = 356;
        System.out.println(" 4.Значение value = " + value);
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100){
            System.out.println("Желтый");
        } else if (value > 100){
            System.out.println("Зеленый");
        }
    }
    private static void compareNumbers() {
        int varA = -53;
        int varB = 10;
        System.out.println(" 5. Переменная А = " + varA);
        System.out.println(" Переменная B = " + varB);
        if (varA >= varB){
            System.out.println("a >= b");
        }if (varA < varB){
            System.out.println("a < b");
        }

    }
}