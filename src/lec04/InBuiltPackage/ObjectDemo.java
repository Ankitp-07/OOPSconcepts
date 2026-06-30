package lec04.InBuiltPackage;

import java.util.Objects;

public class ObjectDemo {
    int number;
    float val ;

    public ObjectDemo(int number, float val) {
        this.number = number;
        this.val=val;
    }

    @Override
    public int hashCode() {
        return super.hashCode();  //hashcode is the unique represntation of the object value , gives different hashcode for the same input number ,it depend on object whole
    }                             //object wise hashcode dega

    @Override
    public boolean equals(Object obj) {
       // return super.equals(obj);
        return this.number==((ObjectDemo)obj).number;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    //already covered

//    @Override                  //gives string represntation
//    public String toString() {
//       return super.toString();
//   }
//
//    @Override            //finalize hit in garbaage collection
//    protected void finalize() throws Throwable {
//        super.finalize();


    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(34,56.8f);
        ObjectDemo obj2 = obj;
        ObjectDemo obj3 =new ObjectDemo(45,78.96f);


        //giving the same hashcode means the object is same
        System.out.println(obj.hashCode());
        System.out.println(obj2.hashCode());

       // if(obj<obj3) System.out.println("obj is less then obj2");  //java is confused how toh compaare so error occured , at ehich parameter it compare num  ya fir float walepe

        //instead of == , we can use .equals
        if(obj.equals(obj3)) System.out.println("obj is eqaul to obj2");  //checking the content of both object

        if(obj==obj2) System.out.println("obj is eqaul to obj2");     //this will print , == checking that same pointer is pointing the both object aor not , means addres is same



        //to cheking something is  instance of what
        System.out.println(obj instanceof ObjectDemo);  //always turre


        //get the class of an Instance
        System.out.println(obj.getClass());

    }
}
