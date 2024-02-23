package Service.action;

public interface Check {
    public void updateTyre();
    default public void checkEngine() {
        System.out.println("\tНет двигателя!");
    }
    default public void checkTrailer() {
        System.out.println("\tНет прицепа!");
    }
}