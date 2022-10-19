public class Car {
    private final String brand;
    private final String model;
    private final double engineVolume;
    private final String color;
    private final int productionYear;
    private final String productionCountry;

    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        this.brand = brand.equals("") ? "default" : brand;
        this.model = model.equals("") ? "default" : model;
        this.engineVolume = engineVolume == 0 ? 1.5 : engineVolume;
        this.color = color.equals("") ? "белый" : color;
        this.productionYear = productionYear == 0 ? 2000 : productionYear;
        this.productionCountry = productionCountry.equals("") ? "default" : productionCountry;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    @Override
    public String toString() {
        return "Марка: " + getBrand() + ", модель: " + getModel() + ", объем двигателя: " + getEngineVolume()
                + ", цвет: " + getColor() + ", год выпуска: " + getProductionYear()
                + ", страна выпуска: " + getProductionCountry();
    }
}
