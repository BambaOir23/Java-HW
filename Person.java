public class Person {
    public void addFoodTo(Plate plate, int food) {
        System.out.println("Хозяйка добавляет еду в миску");
        plate.increaseFood(food);
    }
}