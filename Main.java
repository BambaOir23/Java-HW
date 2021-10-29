public class Main {
    public static void main(String[] args) {
        Person host = new Person();

        Cat[] cats = {
                new Cat(3, "Рыжий", host),
                new Cat(6, "Оболтус", host),
                new Cat(9, "Петр Петрович", host)
        };

        Plate plate = new Plate(0);

        plate.showInfo();

        for (Cat cat : cats) {
            cat.eat(plate);
            plate.showInfo();
        }

        for (Cat cat : cats) {
            cat.eat(plate);
            plate.showInfo();
        }
    }
}
