package Service.transport.truck;

import Service.action.Check;
import Service.transport.general.Transport;

public class Truck extends Transport implements Check {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("\tПроверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("\tПроверяем прицеп");
    }
}