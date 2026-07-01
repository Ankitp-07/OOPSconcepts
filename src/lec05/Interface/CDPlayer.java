package lec05.Interface;

public class CDPlayer implements media {

    @Override
    public void start() {
        System.out.println("music startss");
    }

    @Override
    public void stop() {
        System.out.println("music stop");
    }
}
