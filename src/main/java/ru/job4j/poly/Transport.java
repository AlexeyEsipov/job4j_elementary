package ru.job4j.poly;

public interface Transport {
    double refuel(int liters);

    void go();

    void passenger(int numberOfPassenger);
}
