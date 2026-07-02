package lec06.ComparableExample;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class main {
    public static void main(String[] args) {


        student kunal = new student(12, 89.5f);
        student rahul = new student(42, 64.3f);

//        if (kunal < rahul)   //camparison not possible , we have to impleents comparable
        if (kunal.compareTo(rahul)<0)  System.out.println("rahul has more marks ");



        student mani = new student(12, 89.5f);
        student mishra = new student(42, 64.3f);
        student ankit= new student( 45,56f );
        student vishal = new student(324,34f);

        student[] list = { kunal,rahul,ankit,vishal};
        System.out.println(Arrays.toString(list));
        //Arrays.sort(list);   //method -1  =>> compareTo method in external file or in class
        //method - 2   compare method in same file
        Arrays.sort(list, new Comparator<student>() {
            @Override
            public int compare(student o1, student o2) {
                return (int)(o1.marks - o2.marks);
            }
        });
        //method -3   //by using lambda functions
Arrays.sort(list,(o1,o2)->-(int)(o1.marks - o2.marks));



        System.out.println(Arrays.toString(list));





    }
}
