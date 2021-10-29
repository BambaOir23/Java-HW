public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int appetite) {
        if (!hasEnoughFoodFor(appetite)) {
            System.out.println("Хочет больше, чем есть в тарелке!");
        }
        else {
            food = food - appetite;
        }
    }

    public void showInfo() {
        System.out.println("В тарелке " + food + " единиц еды.");
    }

    public boolean hasEnoughFoodFor(int appetite)
    {
        return appetite <= food;
    }

    public void increaseFood(int countOfFood)
    {
        food += countOfFood;
    }
}
