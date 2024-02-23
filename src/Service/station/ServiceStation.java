package Service.station;

import Service.transport.general.Transport;

public class ServiceStation {
    public void check(Transport transport) {
        System.out.println("Обслуживаем " + transport.getModelName());
        for (int i = 0; i < transport.getWheelsCount(); i++) {
            transport.updateTyre();
            System.out.print(" № " + (i + 1) + " у " + transport.getModelName());
            System.out.println();
        }
        transport.checkEngine();
        transport.checkTrailer();
    }
}
