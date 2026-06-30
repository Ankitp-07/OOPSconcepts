package lec04.Access;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
       //  A obj = new A(43,"ankit",new int[4]);
        A obj = new A(43,"ankit");

        ArrayList arr = new ArrayList();
       // arr.DEFAULT_CAPACITY   //we cannot acess this , it is mentioed private in arraylist class


        //accessing private data member by getter and setter method
        System.out.println(obj.getNum());
        obj.setNum(46);
        System.out.println(obj.getNum());


    }
}
