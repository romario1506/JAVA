package lesson3;

public class HomeWorkThree {
    public static void main(String[] args) {
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
        System.out.println("\nTask 5: ");
        doTask5(5, 1);
        minMaxNumbers();
    }


    private static void invertArray() {
        System.out.println("Задание 1");
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) arr[i] = 1;
            else arr[i] = 0;
            System.out.print(" " + arr[i] + " ");
        }
    }

    private static void fillArray() {
        System.out.println();
        System.out.println("Задание 2");
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }

    private static void changeArray() {
        System.out.println();
        System.out.println("Задание 3");
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.print(" " + arr[i] + " ");
        }
    }

    private static void fillDiagonal() {
        System.out.println();
        System.out.println("Задание 4");
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, x = arr[i].length - 1; j < arr[i].length; j++, x--) {
                if (i == j || i == x) arr[i][j] = 1;
                else arr[i][j] = 0;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void doTask5(int len, int initialValue){
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print("[" + i + "]" + arr[i] + " ");
        }
    }

    private static void minMaxNumbers() {
        System.out.println();
        System.out.println("Задание 6");
        int arr[] = new int[]{5, 354, 12, 8};
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > min) min = arr[i];
            else if (arr[i] < max) max = arr[i];
        }
        System.out.println("Максимальное значение: " + min);
        System.out.println("Минимальное значение: " + max);
    }
}