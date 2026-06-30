package lec04.Access;

public class subclass extends A {

    public subclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        subclass obj = new subclass(24,"34tt23");
        System.out.println( obj.num);  //'num' has private access in 'lec04.Access. A'

    }
}
