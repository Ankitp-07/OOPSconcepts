package lec03.properties.inheritance;
   public class boxPrice extends boxWeight {
        double cost;

        boxPrice(){
        super();
        this.cost =-1;
     }

    boxPrice(boxPrice other){
            super(other);
            this.cost= other.cost;

    }

    boxPrice(double l , double h, double w, double  weight , double cost){
        super(l,h,w,weight);
        this.cost=cost;
        }

        boxPrice(double side, double weight , double cost){
            super(side,weight);
            this.cost=cost;
        }
    }

