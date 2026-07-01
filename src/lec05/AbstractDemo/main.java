package lec05.AbstractDemo;

public class main {
    public static void main(String[] args) {
        son son= new son(23);
        son.career("ankit");
        son.partner("Ayra",20);

        daughter daughter = new daughter(21);
        daughter.career("arya");
        daughter.partner("nikhil",23);

       // parent mom= new parent(); we cannot create object like this . it give suggestion to use abstract methods matlab oveerride karne ko bolega
      parent.hello();   //for static method in abstrract class


        parent daughter4 = new daughter(21);
    }

}
