package Service.transport.truck;

import Service.action.Check;
import Service.transport.general.Transport;

public class Truck extends Transport implements Check {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void check(Transport transport) {
        for (int i = 0; i < transport.getWheelsCount(); i++) {
            System.out.print("\tМеняем покрышку");
            System.out.print(" № " + (i + 1) + " у " + transport.getModelName());
            System.out.println();
        }
        System.out.println("\tПроверяем двигатель");
        System.out.println("\tПроверяем прицеп");
    }
}