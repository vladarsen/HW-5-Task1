package com.vladarsenjtev;

public class Car {
    private String brand;
    private String engine;

    public Car(String brand, String engine) {
        this.brand = brand;
        this.engine = engine;
    }

    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
    }

    private void startElectricity() {
        System.out.println("Запуск питания авто");
    }

    private void startCommand() {
        System.out.println("Проверка работоспостобности всех систем авто");
    }

    private void startFuelSystem() {
        System.out.println("Запуск топливной системы авто");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", engine='" + engine + '\'' +
                '}';
    }
}