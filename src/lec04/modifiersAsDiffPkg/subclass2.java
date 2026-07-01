package lec04.modifiersAsDiffPkg;

import lec04.Access.A;

public class subclass2 extends A {
    public subclass2(int num, String name) {
        super(num, name);
    }


    public static void main(String[] args) {
        subclass obj = new subclass(45,"ankkitffdf");
      //  int n = obj.num; //not accessbile 




    }
}
