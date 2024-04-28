package Interfaces.generics;

import Interfaces.Entities.Car;
import Interfaces.concretes.CarVehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle bmwCar = new CarVehicle();
        Car car = new Car("Bmw");
        bmwCar.start(car);
    }
}
