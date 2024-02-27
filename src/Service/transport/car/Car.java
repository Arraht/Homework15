package Service.transport.car;

import Service.transport.general.Transport;

public class Car extends Transport {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void check() {
        super.check();
        System.out.println("\tПроверяем двигатель");
    }
}