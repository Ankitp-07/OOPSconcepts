package lec05.AbstractDemo;

import javax.crypto.spec.PSource;

public abstract class parent {

    //we have variables here tooo
    int age;
    final  int value ;
    //can we create a constructor for a abstract classs
    public parent(int age){
        this.age =age;
        value=900;
    }

    static void hello(){
        System.out.println("this is static methods in abstract classes");
    }
    void normal(){
        System.out.println("this is normal method , that will overriden by the son ");
    }

    abstract void career(String name) ;

    abstract void partner(String name, int age) ;
}
