package Service.action;

import Service.transport.general.Transport;

public interface Check {
    default void check(Transport transport) {
    }
}