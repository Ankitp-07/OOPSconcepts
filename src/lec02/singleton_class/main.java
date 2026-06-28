package lec02.singleton_class;

public class main {

    public static void main(String[] args) {

        singleton obj1 = singleton.getInstance();
        singleton obj2 = singleton.getInstance();
//both the reference variables pointing the same thing or object
        System.out.println(obj1 == obj2);
    }
}