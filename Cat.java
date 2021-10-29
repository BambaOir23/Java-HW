public class Cat {
    private boolean isFull;
    private int appetite;
    private String name;
    private Person host;

    public Cat(int appetite, String name, Person host) {
        isFull = false;
        this.appetite = appetite;
        this.name = name;
        this.host = host;
    }

    public void eat(Plate plate) {
        if (plate.hasEnoughFoodFor(appetite) && !isFull) {
            System.out.println(name + " ест.");
            plate.decreaseFood(appetite);
            isFull = true;
        } else if (!plate.hasEnoughFoodFor(appetite)) {
            System.out.println(name + " жалобно теребит лапкой тарелку.");
            host.addFoodTo(plate, appetite);
        } else if (isFull) {
            System.out.println(name + "сыт, неделю есть не будет");
        }
    }
}

