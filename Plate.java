package lesson7;

public class Plate  extends FeedCats {
    private int food;
    public int getFood() {
        return food;
    }
    public Plate(int food) {
        this.food = food;
    }
    public void decreaseFood(int n) {
        food -= n;
    }
    public void increaseFood() {
        this.food += 600;
        System.out.println("Мы добавили в миску 550 гр. корма");
    }
    public boolean checkFood(int n) {
        return (food - n) >= 0;
    }

}
