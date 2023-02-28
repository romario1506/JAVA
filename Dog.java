package lesson6;

public class Dog extends Animals {
    public static int countDog = 0;
    public Dog(String name) {
        super(name);
        this.animal = "Собака";
        this.limitRun = 500;
        this.limitSwim = 10;
        ++countDog;
    }
}
