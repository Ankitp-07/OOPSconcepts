package lec03.properties.polymorphismm;

public class overrrideExample {      //internally it is  extending object class , by default in java every class extending object class
    int num;
    public  overrrideExample(int num){
        this.num= num;
    }

    //pahle random values default case me toString method se hi de rha tha ,aab hmne khud toString method daaal diya toh aan default class i.e object classs ke toString method ko override kar dega
    @Override
    public String toString(){
        return "overrideexamlpe{"+ "num="+num+'}';
    }


    public static void main(String[] args) {
         overrrideExample obj = new overrrideExample(64);
        System.out.println(obj);  // print default values as object obj may have differrnt multiple frields , her we cant specify which one to print so it give random vlue
    }

}
