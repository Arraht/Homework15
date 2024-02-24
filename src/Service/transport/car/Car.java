package Service.transport.car;

import Service.action.Check;
import Service.transport.general.Transport;

public class Car extends Transport implements Check {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void check(Transport transport) {
        for (int i = 0; i < transport.getWheelsCount(); i++) {
            System.out.print("\tМеняем покрышку");
            System.out.print(" № " + (i + 1) + " у " + transport.getModelName());
            System.out.println();
        }
        System.out.println("\tПроверяем двигатель");
    }
}