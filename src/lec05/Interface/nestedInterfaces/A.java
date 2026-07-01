package lec05.Interface.nestedInterfaces;

public class A {
    //nested interface

    //must be public and default
    public  interface   NestedInterface{
        boolean isOdd(int num);
    }

}

//may be public private and protected 
class B implements  A.NestedInterface{

    @Override
    public boolean isOdd(int num) {
        return (num&1)==1;
    }
}
