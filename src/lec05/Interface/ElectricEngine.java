package lec05.Interface;

public class ElectricEngine implements engine{
    @Override
    public void start() {
        System.out.println("ElectricEngine stRTS");
    }

    @Override
    public void stop() {
        System.out.println("ElectricEngine stop");
    }

    @Override
    public void acc() {
        System.out.println("ElectricEngine accelerate");
    }
}
