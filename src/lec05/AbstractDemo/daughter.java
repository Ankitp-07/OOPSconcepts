package lec05.AbstractDemo;

public class daughter extends parent  {


    public daughter(int age){
    //this.age =age;
        super(age);

}


    @Override
    void career(String name) {
        System.out.println(" i am a girl named "+name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("my brother name is "+name +"he is "+age+"oldder");
    }
}
