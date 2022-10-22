public class Flower {
    private String flowerName;
    private String flowerColor;
    private String country;
    private double cost;
    private int lifeSpan;

    public Flower(String flowerName, String flowerColor, String country, double cost, int lifeSpan) {
        this.flowerName = isDefine(flowerName) ? flowerName : "не определено";
        this.flowerColor = isDefine(flowerColor) ? flowerColor : "белый";
        this.country = isDefine(country) ? country : "Россия";
        this.cost = cost > 0 ? cost : 1;
        this.lifeSpan = lifeSpan > 0 ? lifeSpan : 3;

    }

    private boolean isDefine(String str) {
        return !(str == null || str.isEmpty() || str.isBlank());
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        this.flowerColor = isDefine(flowerColor) ? flowerColor : "белый>";
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = isDefine(country) ? country : "Россия";
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost > 0 ? cost : 1;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan > 0 ? lifeSpan : 3;
    }

    public String getFlowerName() {
        return flowerName;
    }

    public void setFlowerName(String flowerName) {
        this.flowerName = isDefine(flowerName) ? flowerColor : "не определено";
    }

    @Override
    public String toString() {
        return "Название: " + getFlowerName() + ", Цвет: " + getFlowerColor() +  ", Страна: " + getCountry()
                + ", Стоимость: " + getCost() + " руб., Срок стояния: " + getLifeSpan() + " дн.";
    }
}
