package lec02.staticExample;


//Demo to show the intialisation of statci vsriables
public class staticIntialisation {
    static int a=4;  //simple intialisation
    static int b;

    //this kind of intialisation is required to do complex intialisation
                    // 2. exception handling during intialisation
                    // 3. multiple intialisation at once
    static {   //excuted at exactly once , when class loaded
        System.out.println("I am int static block ");
        b=a*5;

    }

    public static void main(String[] args) {
        staticIntialisation obj =  new staticIntialisation();
        System.out.println(staticIntialisation.a + " " +staticIntialisation.b);

        staticIntialisation.b+=3;  //

        staticIntialisation obj2 =  new staticIntialisation();
        System.out.println(staticIntialisation.a + " " +staticIntialisation.b);
    }
}
