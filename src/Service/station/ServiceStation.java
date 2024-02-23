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
    public void check(Transport transport1, Transport transport2) {
        System.out.println("Обслуживаем " + transport1.getModelName());
        for (int i = 0; i < transport1.getWheelsCount(); i++) {
            transport1.updateTyre();
            System.out.print(" № " + (i + 1) + " у " + transport1.getModelName());
            System.out.println();
        }
        transport1.checkEngine();
        transport1.checkTrailer();
        System.out.println("Обслуживаем " + transport2.getModelName());
        for (int i = 0; i < transport2.getWheelsCount(); i++) {
            transport2.updateTyre();
            System.out.print(" № " + (i + 1) + " у " + transport2.getModelName());
            System.out.println();
        }
        transport2.checkEngine();
        transport2.checkTrailer();
    }
}
