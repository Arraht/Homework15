package Service.transport.bicycle;

import Service.action.Check;
import Service.transport.general.Transport;

public class Bicycle extends Transport implements Check {


    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void check(Transport transport) {
        for (int i = 0; i < transport.getWheelsCount(); i++) {
            System.out.print("\tМеняем покрышку" );
            System.out.print(" № " + (i + 1) + " у " + transport.getModelName());
            System.out.println();
        }
    }
}