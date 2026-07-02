package lec06.ComparableExample;

public class student implements Comparable<student> {
    int rollno;
    float marks;     //there as two parameters which one to compare , java is confused herre , so Implemetns comparable here

    public student(int rollno , float marks) {
        this.rollno = rollno;
        this.marks=marks;
    }

    @Override
    public String toString() {
        return
                "rollno=" + rollno
                ;
    }

    @Override
    public int compareTo(student o) {
      int diff= (int)(this.marks -o.marks);

      //if diff==0 means both are equal
        //if diff<0 means o is bigger else o is smaller

      return diff;
    }
}
