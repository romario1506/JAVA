package lesson4;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkFour {
    private static final int SIZE = 5;
    private static final int WINSIZE = 4;


    private static final char DOT_EMPTY = '•';
    private static final char DOT_X = 'X';
    private static final char DOT_0 = '0';

    public static final String HEADER_FIRST_SYMBOL = "♥";
    public static final String SPACE_MAP_SYMBOL = " ";

    private static final char[][] MAP = new char[SIZE][SIZE];

    private static final Scanner in = new Scanner(System.in);
    private static final Random random = new Random();

    private static int turnsCount = 0;

    public static void main(String[] args) {
        turnGame();
    }

    public static void turnGame() {
        do {
            System.out.println("Добро пожаловать в игру X и 0 ! ☺ ");
            System.out.println("Ваше поле для игры готово, Вы ходите первым!");
            initMap();
            printMap();
            playGame();
        } while (isContinueGame());

    }

    private static boolean isContinueGame() {
        System.out.println(" Продолжаем играть? ☺ да\\нет ");
        return switch (in.next()) {
            case "да", "y", "+" -> true;
            default -> false;
        };
    }

    private static void initMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                MAP[i][j] = DOT_EMPTY;
            }
        }
    }


    private static void printMap() {
        printHeader();
        printBodyMap();
    }

    private static void printHeader() {
        printMapNumber(HEADER_FIRST_SYMBOL + SPACE_MAP_SYMBOL);
        for (int i = 0; i < SIZE; i++) {
            printMapNumber(i + 1 + SPACE_MAP_SYMBOL);
        }
        System.out.println();
    }

    private static void printMapNumber(String i) {
        System.out.print(i);
    }

    private static void printBodyMap() {
        for (int i = 0; i < SIZE; i++) {
            printMapNumber(i + 1 + "  ");
            for (int j = 0; j < SIZE; j++) {
                printMapNumber(MAP[i][j] + SPACE_MAP_SYMBOL);
            }
            System.out.println();
        }
    }

    private static void playGame() {
        while (true) {
            humanTurn();
            printMap();
            if (checkEnd(DOT_X)) {
                break;
            }

            aiTurn();
            printMap();
            if (checkEnd(DOT_0)) {
                break;
            }

        }
    }


    private static void humanTurn() {
        System.out.println("\nВАШ ХОД!");
        int rowNumber;
        int columnNumber;

        while (true) {
            System.out.print("Пожалуйста, введите координату Строки: ");
            rowNumber = in.nextInt() - 1;

            System.out.print("Пожалуйста, введите координату Столбца: ");
            columnNumber = in.nextInt() - 1;

            if (isCellValid(rowNumber, columnNumber)) {
                break;
            }
            System.out.printf("ОШИБКА! Ячейка с координатами %s:%s уже используется %n", rowNumber + 1, columnNumber + 1);
        }
        MAP[rowNumber][columnNumber] = DOT_X;
        turnsCount++;
    }

    private static boolean checkEnd(char symb) { //проверка победы
        if (checkWin(symb)) {
            if (symb == DOT_X) {
                System.out.println("Поздравляем с победой!");
            } else {
                System.out.println("Что-то не очень Вы сыграли, Компьютер победил!");
            }
            return true;
        }

        if (checkDraw()) {
            System.out.println("Ничья!☻");
            return true;
        }

        return false;
    }


    private static boolean checkWin(char symb) {
        int gor, ver;
        int diagonalsMain, diagonalsAdditional;
        for (int i = 0; i < SIZE; i++) {
            gor = 0;
            ver = 0;
            for (int j = 0; j < SIZE; j++) {
                if (MAP[i][j] == symb) {
                    gor++;
                } else if (MAP[i][j] != symb && gor < WINSIZE) {
                    gor = 0;
                }
                if (MAP[j][i] == symb) {
                    ver++;
                } else if (MAP[j][i] != symb && ver < WINSIZE) {
                    ver = 0;
                }
            }
            if (gor >= WINSIZE || ver >= WINSIZE) {
                return true;
            }
        }
        for (int j = 0; j < SIZE; j++) {
            diagonalsMain = 0;
            for (int i = 0; i < SIZE; i++) {
                int a = j + i;
                if (a < SIZE) {
                    if (MAP[i][a] == symb) {
                        diagonalsMain++;
                    } else if (MAP[i][a] != symb && diagonalsMain < WINSIZE) {
                        diagonalsMain = 0;
                    }
                }
                if (diagonalsMain >= WINSIZE) {
                    return true;
                }
            }
        }
        for (int j = 1; j < SIZE; j++) {
            diagonalsMain = 0;
            for (int i = 0; i < SIZE; i++) {
                int a = j + i;
                if (a < SIZE) {
                    if (MAP[a][i] == symb) {
                        diagonalsMain++;
                    } else if (MAP[a][i] != symb && diagonalsMain < WINSIZE) {
                        diagonalsMain = 0;
                    }
                }
                if (diagonalsMain >= WINSIZE) {
                    return true;
                }
            }
        }
        for (int j = 0; j < SIZE; j++) {
            diagonalsAdditional = 0;
            for (int i = 0; i < SIZE; i++) {
                int a = (SIZE - 1) - i;
                int b = j + i;
                if (a >= 0 && b < SIZE) {
                    if (MAP[b][a] == symb) {
                        diagonalsAdditional++;
                    } else if (MAP[b][a] != symb && diagonalsAdditional < WINSIZE) {
                        diagonalsAdditional = 0;
                    }
                }
                if (diagonalsAdditional >= WINSIZE) {
                    return true;
                }
            }
        }
        for (int j = 1; j < SIZE; j++) {
            diagonalsAdditional = 0;
            for (int i = 0; i < SIZE; i++) {
                int a = (SIZE - 1) - j - i;
                if (a >= 0) {
                    if (MAP[i][a] == symb) {
                        diagonalsAdditional++;
                    } else if (MAP[i][a] != symb && diagonalsAdditional < WINSIZE) {
                        diagonalsAdditional = 0;
                    }
                }
                if (diagonalsAdditional >= WINSIZE) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean checkDraw() {
        /*for (char[] chars : MAP) {
            for (char symb : chars) {
                if (symb == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;*/
        return turnsCount >= SIZE * SIZE;
    }

    private static void aiTurn() {
        System.out.println("\nХОД КОМПЬЮТЕРА!");
        int rowNumber;
        int columnNumber;

        do {
            rowNumber = random.nextInt(SIZE);
            columnNumber = random.nextInt(SIZE);

        } while (!isCellValid(rowNumber, columnNumber));
        System.out.println("Компьютер походил в точку " + (rowNumber + 1) + " " + (columnNumber + 1));
        MAP[rowNumber][columnNumber] = DOT_0;
        turnsCount++;
    }

    private static boolean isCellValid(int rowNumber, int columnNumber) {
        return MAP[rowNumber][columnNumber] == DOT_EMPTY;
    }
}
