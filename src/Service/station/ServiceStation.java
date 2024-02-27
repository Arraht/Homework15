package Service.station;

import Service.transport.general.Transport;

public class ServiceStation {
    public void checkTransport(Transport transport) {
        System.out.println("Обслуживаем " + transport.getModelName());
        transport.check();
    }
}