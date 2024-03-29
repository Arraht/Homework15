package main;

import Service.station.ServiceStation;
import Service.transport.bicycle.Bicycle;
import Service.transport.car.Car;
import Service.transport.truck.Truck;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("car1",4);
        Car car2 = new Car("car2", 4);

        Truck truck = new Truck("truck1", 6);
        Truck truck2 = new Truck("truck2", 8);

        Bicycle bicycle = new Bicycle("bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("bicycle2", 2);
        ServiceStation station = new ServiceStation();
        station.checkTransport(bicycle);
        station.checkTransport(bicycle2);
        station.checkTransport(car);
        station.checkTransport(car2);
        station.checkTransport(truck);
        station.checkTransport(truck2);
    }
}