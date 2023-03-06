package lesson7;

public class FeedCats {
    public static void main(String[] args) {
        int time = 0;
        Cat[] cat = new Cat[4];
        cat[0] = new Cat("Рыжик", 130, 3);
        cat[1] = new Cat("Штакет", 110, 4);
        cat[2] = new Cat("Цезарь", 90, 5);
        cat[3] = new Cat("Эдельвейс",120,4);
        Plate plate = new Plate(700);

        System.out.println("У нас  живут четыре котика: " + cat[0].getName() + ", " + cat[1].getName()+ ", " + cat[2].getName()
                + " и " + cat[3].getName()  + ",которые хотят есть каждые " + cat[0].getSatietyTime() + ", " + cat[1].getSatietyTime()+ ", " + cat[2].getSatietyTime() + " и " + cat[3].getSatietyTime()
                + " час(а/ов) соответственно.");
        System.out.println("Утром в миску мы насыпали  " + plate.getFood() + " гр. вкуснейшего мясного кошачьего корма.");
        do {
            for (Cat i : cat) {
                //Кот голоден
                if (i.getSatiety() == 0) {

                    //добавляем корм, когда не хватает
                    if (!plate.checkFood(i.getAppetite())) {
                        plate.increaseFood();
                    }

                    //Кормим кота
                    i.eat(plate);
                    System.out.println("Кот " + i.getName() + " съел " + i.getAppetite() +
                            " гр. корма ,следующая кормежка у него через " + (i.getSatiety()) + " часа(ов)");
                }
                //уменьшение показателя сытости
                i.setSatiety(i.getSatiety() - 1);
            }
            System.out.println("С момента начала кормежки прошел(ло) " + time + " час(а). В миске осталось " + plate.getFood() + " гр. корма.");
            time++;
            if (time>12){
                System.out.println("Упссс, кошачий корм закончился, будем есть мясо!");

            }
            // Подкрепление в течении 12 часов
        } while (time <= 12);

    }
}
