package lec03.properties.polymorphismm;


//ACT of representing similiar thing in multiple ways
public class main {
    public static void main(String[] args) {
        shapes shape =new shapes();
        circleMethodOverriding circle =new circleMethodOverriding();
        square sq = new square();
        circle.area();
        sq.area();
        shape.area();
    }
}
