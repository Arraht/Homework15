package Service.transport.bicycle;

import Service.action.Check;
import Service.transport.general.Transport;

public class Bicycle extends Transport implements Check {


    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void check(Transport transport) {
      super.check(transport);
    }
}