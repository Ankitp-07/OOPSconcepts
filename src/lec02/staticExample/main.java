package lec02.staticExample;

public class main {
    public static void main(String[] args) {

        //human classs is directly accessbile by just putting the class name , as lie in the same package

//       human ankit = new human(22,"ankit", 3000);
//       human rahul = new human(34,"rahul",45466);

        //population is the statict variable so , independent of objects , class level things , so either declare object or nnot it will work
        System.out.println(human.population);

        //greeting();
        fun();

        //object created as refernced with static context
        main obj2 = new main();
        obj2.fun2();
    }

//    //we know that something which is not static , belongs to an object
//    static void greeting() {
//        System.out.println("hello world");
//    }

    static void fun(){   //this is not dependent on objects
        //greetings();  //you cannot use this because it requires an instance
        //but the functioon yoou are using it in does not depend on instances

        //you cannot access non static stuff without referncing their instances in a static context

        main obj = new main();
        obj.greeting();   //hence we are referencing it

    }
    void fun2(){
        greeting();  //it uses the fun2 object
        System.out.println("non static called with object creation");
    }
    ///we know that something which is not static , belongs to an object
    void greeting(){
        System.out.println("helllooooo bacchomm");
    }
}


