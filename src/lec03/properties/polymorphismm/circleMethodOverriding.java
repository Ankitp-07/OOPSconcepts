package lec03.properties.polymorphismm;

public class circleMethodOverriding extends shapes {    //child class


    //this will run when object of circle is created
    // hence it is overriding the parent method
    @Override  //this is called annotation
    void area(){
        System.out.println("Circle area is: pie * r * r ");
    }

}
