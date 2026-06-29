package lec03.properties.polymorphismm;

//multiple methods with same name with differnet parameters , return types , ordering etc  is method overloading

public class methodoverloading {
    double sum( double a , int b){    // java impicitly convert int to double
        return a+b;

    }
    int sum(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
         methodoverloading obj = new methodoverloading();
          obj.sum(3,4);
        //  obj.sum(5,2,6,2)  // not possible , checking at compile time, no method exist with four arguments
        System.out.println( obj.sum(4,5,3));
    }
}
