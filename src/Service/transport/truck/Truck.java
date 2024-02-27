package Service.transport.truck;

import Service.transport.general.Transport;

public class Truck extends Transport {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void check() {
        super.check();
        System.out.println("\tПроверяем двигатель");
        System.out.println("\tПроверяем прицеп");
    }
}