package Service.transport.car;

import Service.action.Check;
import Service.transport.general.Transport;

public class Car extends Transport implements Check {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("\tПроверяем двигатель");
    }
}