public class Main2 {

    public static void main(String[] args) {
        AnimalFactory factory = new AnimalFactory();

        Cat cat = factory.newCat(200);
        Dog dog = factory.newDog(500, 10);

        cat.runOn(125);
        cat.swimOn(1);

        dog.runOn(520);
        dog.swimOn(9);

        System.out.println("Животных создано всего: " + factory.getAnimalsCount());
        System.out.println("Собак создано всего: " + factory.getDogsCount());
        System.out.println("Кошек создано всего: " + factory.getCatsCount());
    }
}
