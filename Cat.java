package lesson6;

public class Cat extends Animals {
    public static int countCat = 0;
    public Cat(String name) {
        super(name);
        this.limitRun = 200;
        this.animal = "Кот";
        ++ countCat;
    }

    @Override
    public void swim(int distSwim) {
        System.out.println("Увы, наши Коты не умеют плавать!");
    }
}