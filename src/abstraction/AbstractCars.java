package abstraction;

public abstract class AbstractCars {

    private int privateSpeed;

    public void setPrivateSpeed(int speed) {
        this.privateSpeed = speed;
    }

    public void engineStart() {
        System.out.println("Engine started");
    }

    public abstract void abc(int a);

    public abstract void engineStart(String keyType, int numofCyl);

}
