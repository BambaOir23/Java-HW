public class Main {
    public static void main(String[] args) {

        Employee[] employees = {
                new Employee(
                        "Stepanov Vadim Vladimirovich",
                        "Manager",
                        "stepa@ya.ru",
                        "+7(495)123-4567",
                        50000,
                        38),
                new Employee(
                        "Urin Michail Urievich",
                        "Engineer",
                        "micha@ya.ru",
                        "+7(8312)567-890",
                        80000,
                        41),
                new Employee(
                        "Bakanova Natalia Vladimirovna",
                        "Director",
                        "boss1@mail.ru",
                        "+7812-432-654-7",
                        230000,
                        33),
                new Employee(
                        "Grigiriychev Andrey Valentinovich",
                        "Cleaner",
                        "iamgod@mail.ru",
                        "+7-901-3456781",
                        17000,
                        46),
                new Employee(
                        "Antonov Artjom Igorevich",
                        "Teacher",
                        "bigbosss@ya.ru",
                        "+7831-252-3636",
                        110000,
                        52)
        };

        int minAge = 40;
        for (Employee employee : employees)
        {
            if (employee.age > minAge)
            {
                employee.printInfo();
                System.out.println();
            }
        }
    }
}
