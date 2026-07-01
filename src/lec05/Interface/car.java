package lec05.Interface;

public class car implements engine , brake{

    int a =35;

    @Override
    public void brake() {
        System.out.println("I brake like a normal man");
    }

    @Override
    public void start() {
        System.out.println("I started driving .... ");
    }

    @Override
    public void stop() {
        System.out.println("i stopped the driving ");
    }

    @Override
    public void acc() {
        System.out.println("i have much accelator ");
    }
}
