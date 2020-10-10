package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void go() {
        System.out.println("Bus go");
    }

    @Override
    public void passenger(int numberOfPassenger) {
        System.out.println(numberOfPassenger + "passengers on the bus");
    }

    @Override
    public double refuel(int liters) {
        double fuelPrice = 1.5;
        return liters * fuelPrice;
    }
}
