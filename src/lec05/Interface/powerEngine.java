package lec05.Interface;

public class powerEngine implements engine{
    @Override
    public void start() {
        System.out.println("powerEngine stRTS");
    }

    @Override
    public void stop() {
        System.out.println("powerEngine stop");
    }

    @Override
    public void acc() {
        System.out.println("powerEngine accelerate");
    }
}
