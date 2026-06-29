package lec03.properties.inheritance;

public class main {
    public static void main(String[] args) {
        box box = new box();
//        System.out.println(box.l+" "+box.w+" "+ box.h);

        boxWeight box3 = new boxWeight();
        System.out.println(box3.h+" "+ box3.weight);

        //why box type object as parent cannnot access its child class
        box box4 = new box(box);
        System.out.println(box3.h);

        box box5 = new boxWeight(4,23 ,3,3);

        //System.out.println(box5.weight);  //box5.weight is inaccessible  the child (object type)  can only access those ehich are present in parent (refernce type)



        //there are many variables in both parents and child classes
        // you are given access to variables that are in the reference type i.e. BoxWeight
        // here you should have access to weight variable
        //this also means that you are trying to access should be initialized
        // but here , when the object itself is of type parent classes , how will you call the constructor
        //this is why  error
        //so the below one is inaccessible

        //boxWeight box6 = new box(4,23 ,3); //and we cannot do it





        //types of inheritance
        boxPrice box7 = new boxPrice(5,8,200);



    }
}
