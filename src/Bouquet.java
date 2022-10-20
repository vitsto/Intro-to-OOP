import java.math.BigDecimal;
import java.math.RoundingMode;

public class Bouquet {
    // я мог бы здесь использовать HashMap, для пар "цветок-количество", но
    // т.к.подразумевается, что мы еще не проходили коллекции, решил
    // выполнить задачу с помощью массивов.
    // Например,если во flowers[0] - "роза обыкновенная", тогда countFlowers[0] - количество этих роз в букете
    private final Flower[] flowers;
    private final int[] countFlowers;
    private int currentIndex;

    public Bouquet() {
        this.flowers = new Flower[100];
        this.countFlowers = new int[100];
        this.currentIndex = 0;
    }

    public void addFlowers(Flower flower, int count) {
        for (int i = 0; i < currentIndex && flowers[i] != null; i++) {
            if (flowers[i].getFlowerName().equals(flower.getFlowerName())) {
                countFlowers[i] += count;
                return;
            }
        }
        flowers[currentIndex] = flower;
        countFlowers[currentIndex] = count;
        currentIndex++;
    }

    private int getBouquetLifeSpan() {
        int min = 1000;
        for (int i = 0; i < currentIndex && flowers[i] != null; i++) {
            if (flowers[i].getLifeSpan() < min) {
                min = flowers[i].getLifeSpan();
            }
        }
        return min;
    }

    private double getCost() {
        double cost = 0;
        for (int i = 0; i < currentIndex && flowers[i] != null; i++) {
            cost += flowers[i].getCost() * countFlowers[i];
        }
        int allowance = 10; // надбавка за работу
        cost = cost + (cost * allowance / 100);
        return new BigDecimal(cost).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    @Override
    public String toString() {
        StringBuilder information = new StringBuilder("Информация о букете:\n----------\n");
        for (int i = 0; i < currentIndex && flowers[i] != null; i++) {
            information.append(flowers[i].getFlowerName())
                    .append(" (")
                    .append(flowers[i].getFlowerColor())
                    .append(")")
                    .append(" - ")
                    .append(countFlowers[i])
                    .append(" шт.\n");
        }
        information.append("----------\nЦена: ")
                .append(getCost())
                .append(" руб.")
                .append("\nСрок стояния: ")
                .append(getBouquetLifeSpan())
                .append(" дн.");
        return information.toString();

    }
}
