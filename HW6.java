package lesson6;

public class HW6 {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Штакет");
        Cat cat2 = new Cat("Валера");
        Cat cat3 = new Cat("Эдельвейс");

        Dog dog1 = new Dog("Бублик");
        Dog dog2 = new Dog("Мухтар");
        Dog dog3 = new Dog("Дося");

        System.out.println("Полосу препятствий проходят следующие животные:");
        System.out.println();
        cat1.animalInfo();
        cat1.run(110);
        cat1.swim(10);
        System.out.println();

        cat2.animalInfo();
        cat2.run(12);
        cat2.swim(5);
        System.out.println();

        cat3.animalInfo();
        cat3.run(250);
        cat3.swim(0);
        System.out.println();

        System.out.println();

        dog1.animalInfo();
        dog1.run(400);
        dog1.swim(5);
        System.out.println();

        dog2.animalInfo();
        dog2.run(30);
        dog2.swim(11);
        System.out.println();

        dog3.animalInfo();
        dog3.run(70);
        dog3.swim(10);
        System.out.println();

        System.out.println("Всего животных = " + Animals.countAnimals + " Котов = " + Cat.countCat + " Собак = "+Dog.countDog);
    }



}
