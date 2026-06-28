package lec02.staticExample;

//class test{
//    static String name;
//    public test(String name){
//        test.name = name;
//    }
//}
public class innerzclassess {
    static class test{      //so this does not depend on innerzclasess objects , but internally depedent on a and b
         String name;
        public test(String name){
            this.name = name;
        }
    }

    // test and main has instances each other internally 
    public static void main(String[] args) {
        test a = new test("annit");
        test b = new test("ankit ");
        System.out.println(a.name);
        System.out.println(b.name);
    }
}
