package lec01;

public class intro {


    public  static void main(String[] args) {
        int[] rno= new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];


        Student ankit;  // declaring an object of lec01.Student class type
        ankit = new Student( 14,"ankit",45);

//        ankit.rno=16;
//        ankit.name="Ankit Patel";
//        ankit.marks=94.6f;
        ankit.changeName("player");
        ankit.greeting();


         System.out.println(ankit.rno);
        System.out.println(ankit.name);
        System.out.println(ankit.marks);

        Student random = new Student(ankit);

        System.out.println("roll for random"+random.rno);
        System.out.println("name for random"+random.name);
        System.out.println("marks for random"+random.marks);

        //System.out.println(ankit.salary);   salary is not declared as an instance variable in the lec01.Student class, so it cannot be accessed using ankit.salary
        //System.out.println(Arrays.toString(students));

        Student random2= new Student();

    }

}

//created a class for the student , as lec01.Student data type
class Student{
    int rno;
    String name;
    float marks;

//    lec01.Student (){
//        this.rno=16;   //this keyword means jo bbhi object bann ke aaya usi ko apna lega , usi pe ye value daal dega
//        this.name="Ankit Patel";
//        this.marks=94.6f;
//    }
    Student (Student other){
        this.rno=other.rno;
        this.name=other.name;
        this.marks= other.marks;

    }
    void greeting(){
        System.out.println("hello ! my name is "+ this.name);
    }

    void changeName(String newName ){
        name=newName;
    }

    //calling one constructor  from another constrcutor i.e. constrcutor chaining
    Student(){
        this(14,"ankit",45);
    }

    //variable name of parmater same hi daalna chayiye , so we need this keywrod . but we use another variable name then this keyword doesnot requrird
    Student (int roll,String naam, float mark){   //parameter me same variable name nhi chayiye class ka aur iska , agar same hai toh *this* keyword ka use karenge
        rno=roll;
        name=naam;
        marks=mark;
    }

}
