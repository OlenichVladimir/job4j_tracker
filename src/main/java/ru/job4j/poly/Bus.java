package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Автобус едет ");
    }

    @Override
    public void passengers(int count) {
        System.out.println("Количество пассажиров в автобусе " + count + " Человек");
    }

    @Override
    public int refill(int liters) {
        int priceOneLitter = 60;
        return priceOneLitter * liters;
    }

    public static void main(String[] args) {
        Transport bus = new Bus();
        bus.drive();
        bus.passengers(6);
        System.out.println("Стоимость топлива " + bus.refill(100) + " Рублей");
    }
}
