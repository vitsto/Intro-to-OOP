package transport;

import java.time.LocalDate;
import java.util.regex.Pattern;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int productionYear;
    private final String productionCountry;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private boolean summerTires;
    private Key key;
    private Insurance insurance;

    public class Key {
        private final String remoteEngineStart;
        private final String keylessAccess;

        public Key(String remoteEngineStart, String keylessAccess) {
            this.remoteEngineStart = Car.this.isDefine(remoteEngineStart) ? remoteEngineStart : "default";
            this.keylessAccess = Car.this.isDefine(keylessAccess) ? keylessAccess : "default";
        }
    }

    public class Insurance {
        private final LocalDate duration;
        private final double cost;
        private final String serialNumber;

        public Insurance(LocalDate duration, double cost, String serialNumber) {
            this.duration = duration;
            this.cost = cost;
            this.serialNumber = isValidSerialNumber(serialNumber) ? serialNumber : null;
        }

        private boolean isValidSerialNumber(String serialNumber) {
            if (Pattern.matches("[а-яА-Яa-zA-Z0-9]{9}", serialNumber)) {
                return true;
            } else {
                System.out.println("Номер страховки некорректный");
                return false;
            }
        }

        public void checkDuration() {
            if (LocalDate.now().isAfter(duration)) {
                System.out.println("Страховка просрочена. Оформите новую");
            }
        }
    }

    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry, String transmission, String bodyType, String registrationNumber, int numberOfSeats) {
        this.brand = isDefine(brand) ? brand : "default";
        this.model = isDefine(model) ? model : "default";
        this.engineVolume = engineVolume == 0 ? 1.5 : engineVolume;
        this.color = isDefine(color) ? color : "белый";
        this.productionYear = productionYear == 0 ? 2000 : productionYear;
        this.productionCountry = isDefine(productionCountry) ? productionCountry : "default";
        this.transmission = isDefine(transmission) ? transmission : "автомат";
        this.bodyType = isDefine(bodyType) ? bodyType : "седан";
        this.registrationNumber = isValidRegistrationNumber(registrationNumber) ? registrationNumber : "x000xx000";
        this.numberOfSeats = numberOfSeats <= 0 ? 4 : numberOfSeats;
    }

    private boolean isValidRegistrationNumber(String registrationNumber) {
        return Pattern.matches("[а-я][0-9]{3}[а-я]{2}[0-9]{3}", registrationNumber);
    }

    private boolean isDefine(String str) {
        return !(str == null || str.isEmpty() || str.isBlank());
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
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

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume == 0 ? 1.5 : engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color.equals("") ? "белый" : color;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public boolean isSummerTires() {
        return summerTires;
    }

    public void setSummerTires(boolean summerTires) {
        this.summerTires = summerTires;
    }

    @Override
    public String toString() {
        return "Марка: " + getBrand() + ", модель: " + getModel() + ", объем двигателя: " + getEngineVolume()
                + ", цвет: " + getColor() + ", год выпуска: " + getProductionYear()
                + ", страна выпуска: " + getProductionCountry() + ", коробка передач: " + getTransmission()
                + ", тип кузова: " + getBodyType() + ", регистрационный номер: " + getRegistrationNumber()
                + ", количество мест: " + getNumberOfSeats() + ", резина: " + (isSummerTires() ? "летняя" : "зимняя");
    }
}
