import transport.Car;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Human maxim = new Human("Максим", 35, "Минск", "Бренд менеджер");
        Human anna = new Human("Анна", 29, "Москва", "Методист образовательныъ программ");
        Human katya = new Human("Екатерина", 28, "Калининград", "Продакт-менеджер");
        Human artem = new Human("Артем", 27, "Москва", "Директор по развитию бизнеса");
        Human someone = new Human("", 0, "", "");

        System.out.println(maxim);
        System.out.println(someone);
        System.out.println("\n\n\n");

        Car lada = new Car("Lada", "Grande", 1.7, "желтый", 2015,
                "Россия", "механическая", "хэтчбек", "123", 4);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3,
                "черный", 2020,"Германия",
                "", "", "н388но999", 4);
        System.out.println(lada);
        System.out.println(audi);

        Car.Insurance insurance = lada.new Insurance(LocalDate.of(2022,9,10), 7635.55, "123bc789");
        insurance.checkDuration();

        System.out.println("\n\n\n");
        Flower rose = new Flower("роза обыкновенная", null, "Голландия", 35.59, 0);
        Flower chrysanthemum = new Flower("хризантема", null, " ", 15, 5);
        Flower peony = new Flower("пион", null, "Англия", 69.9, 1);
        Flower gypsophila = new Flower("гипсофила", null, "Турция", 19.5, 10);
        System.out.println(rose);
        System.out.println(chrysanthemum);
        System.out.println(peony);
        System.out.println(gypsophila);

        Bouquet bouquet = new Bouquet();
        bouquet.addFlowers(rose, 3);
        bouquet.addFlowers(chrysanthemum, 5);
        bouquet.addFlowers(gypsophila, 1);
        System.out.println(bouquet);

    }
}