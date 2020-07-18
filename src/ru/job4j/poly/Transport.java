package ru.job4j.poly;

public interface Transport {
    void go();
    void passenger(int numberOfPassenger);
    double refuel(int liters);
}
