package Service.transport.general;

import Service.action.Check;

public abstract class  Transport implements Check {
    private String modelName;
    private int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public void check(){
        for (int i = 0; i < wheelsCount; i++) {
            System.out.print("\tМеняем покрышку");
            System.out.print(" № " + (i + 1) + " у " + modelName);
            System.out.println();
        }
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }
}