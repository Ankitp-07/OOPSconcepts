package lec02.staticExample;

public class human {
    int age;
    String name;
    int salary;
   static int population;
    human(int age,String name, int salary){
        this.age=age;
        this.name=name;
       this.salary=salary;
       human.population+=1;
       //this.population +=1; // bbut this is baseless for the static
    }

}
