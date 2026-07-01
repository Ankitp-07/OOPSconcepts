package lec04.modifiersAsDiffPkg;

import lec04.Access.A;
//case1 for accessibility
public class subclass extends A {
    public subclass(int num, String name) {
        super(num, name);
    }

    
    public static void main(String[] args) {
        subclass obj = new subclass(45,"ankkitffdf");
        int n = obj.num;


     //below thing is not possible
        // as the Base class does not know itself that it is extending to some other class
//        A obj2 = new A(56 , "8ty");
//        int r =obj2.num



    }
}
//case2 accessibility
class subsubclass extends subclass{

    public subsubclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        subsubclass obj = new subsubclass(35,"5400");
        int n= obj.num;

        //checking for instance
        System.out.println(obj instanceof A);  //yess it is the instance iof the A class , as it is  grandchilren of the A

        System.out.println(obj.getClass());
    }
}




