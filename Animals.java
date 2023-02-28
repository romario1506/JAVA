package lesson6;

abstract class Animals {

    protected String name;
    protected String animal;
    protected int limitRun;
    protected int limitSwim;


    public static int countAnimals = 0;

    public Animals(String name) {
        this.name = name;
        ++ countAnimals;

    }

    public void animalInfo() {
        System.out.println(this.animal + " " + this.name + " может пробежать: " + this.limitRun + " м., и  может проплыть: "
                + this.limitSwim + " м.");
    }

    public void run(int distRun) {
        if (this.limitRun >= distRun) System.out.println(this.animal + " " + this.name + " пробегает: " + distRun + " м.");
        else System.out.println(this.animal + " " + this.name + " не может пробежать так далеко");
    }

    public void swim(int distSwim) {
        if (this.limitSwim >= distSwim) System.out.println(this.animal + " " + this.name + "  проплывает: " + distSwim + " м.");
        else System.out.println(this.animal + " " + this.name + " не может проплыть так много");
    }

}
