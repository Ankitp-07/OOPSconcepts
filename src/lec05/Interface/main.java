package lec05.Interface;

public class main {
    public static void main(String[] args) {
//        car car = new car();
//        car.acc();
//        car.start();
//        car.brake();
//        car.stop();

//the problem occurring during implemnting the media interface , which one it will print while we call car.start()
        //engine wala ya media wala , so we put all these in another clasess.

        //sab chijo ka alag alag class bana liye hain , so that no confusion hhappens , and successfully multiple inheritance ko achieve kiya ja sake

        niceCar car3 = new niceCar();
        car3.start();
        car3.startMusic();
        car3.updateEngine();
        car3.start();













        engine car2 = new car();
        //System.out.println(car.a) ;//not accessbile as refernce type is engine


    }
}
