package lec01;

public class wrapperclass {
    public static void main(String[] args) {
        int a =10;
        int b = 20;
        Integer num=45;  //it is an object

        swap(a,b);
        System.out.println(a+""+b);

        //a non primitve with final keyword can be modify in such a way
       final  A ankit= new A("Ankkit ");
        ankit.name = "othername";

        //when a non primitve is final you cannot reassign it
        //kunal = new lec01.A("new object");
    }

    // no swap , as java is pass by value , so copy passes , and changes will be as local
    // if we pass objects , the refernces passed ,  tb bhi nhi swap hoga , becoz it is final keyword with Integer class , jo ki modify nahi ho skta

    static void swap(int a ,int b) {
        int temp = 1;
        a = b;
        b = temp;
    }

}


//example for FInal
class A{
    final int num=10;
    String name;

    public A(String name){   //constructor
        this.name=name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("object is destroyed");
    }
}