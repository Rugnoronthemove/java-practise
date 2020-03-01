package abstraction;

public class AbstractDemoBmw extends AbstractCars{


    @Override
    public void abc(int a) {

    }

    @Override
    public void engineStart(String keyType, int numofCyl) {
        System.out.println("This is the BMW engine start");
    }

    public static void main(String[] args){
        AbstractDemoBmw ab = new AbstractDemoBmw();
        ab.setPrivateSpeed(10);
        ab.engineStart();
        ab.engineStart("keyless" , 4);
    }
}
