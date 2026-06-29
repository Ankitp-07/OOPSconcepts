package lec03.properties.inheritance;

public class boxWeight extends box {
    double weight;

    boxWeight(){
        this.weight= 1;
    }
    boxWeight(double l, double h, double w, double weight) {
        super(l, h, w); // calling the parent class constructor with arguments  // used to intialiazie values present in parent class
        //why this super with aruguments  intialised first ,
        //becoz child class do care about the what parent class contain , so they intialise the parent class first
        this.weight = weight; //if we used this before super(l,b,h), it give error

        //if we dont write or use the super(l,b,h) here , the default one with zero paramters constructor will called
    }

        boxWeight(boxWeight other) {
            super(other);           //here it become the box5 case , ki argument boxweight ke form me paas hoga par waha par parameter box rahega , acccessbile only those itemthat are present in parent class cnstructor
            weight = other.weight;
        }



            //types of inheritance
             boxWeight(double side , double weight){
               super(side);
               this.weight=weight;
    }
}
