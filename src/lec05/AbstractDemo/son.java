package lec05.AbstractDemo;

public class son extends parent {


    public son(int age){
        //this.age=age;
        super(age);
    }
    @Override
    void normal() {
        super.normal();
    }

    @Override
    void career(String name) {
        System.out.println("I am going to "+ name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("I love "+name+" she is"+age);
    }
}
