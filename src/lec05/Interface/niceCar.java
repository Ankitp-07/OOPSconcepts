package lec05.Interface;

public class niceCar {
    private engine engine;
    private media player = new CDPlayer();
    public niceCar(){
        this.engine = new powerEngine();
    }
    public niceCar(engine engine){
        this.engine=engine;
    }

    public  void start(){
        engine.start();
    }
    public  void stop(){
        engine.stop();
    }
    public  void startMusic() {
        player.start();     //aab music player ko start stop karega
    }
    public  void updateEngine(){
        this.engine= new ElectricEngine();
    }
}
