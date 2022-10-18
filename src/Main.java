public class Main {
    public static void main(String[] args) {
        Human maxim = new Human("Максим", 1987, "Минск", "Бренд менеджер");
        Human anna = new Human("Анна", 1993, "Москва", "Методист образовательныъ программ");
        Human katya = new Human("Екатерина", 1994, "Калининград", "Продакт-менеджер");
        Human artem = new Human("Артем", 1995, "Москва", "Директор по развитию бизнеса");
        Human someone = new Human();
        Human someone2 = new Human("", -2000, "", "");

        System.out.println(maxim);
        System.out.println(someone);

        Car lada = new Car("Lada", "Grande", 1.7, "желтый", 2015,"Россия");
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3, "черный", 2020,"Германия");
        Car bmw = new Car("BMW", "Z8", 3, "черный", 2021,"Германия");
        Car kia = new Car("Kia", "Sportage 4е поколение", 2.4, "красный", 2018,"Южная Корея");
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016,"Южная Корея");

        System.out.println(lada);
        System.out.println(audi);

    }
}