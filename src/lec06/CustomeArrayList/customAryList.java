package lec06.CustomeArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class customAryList<T>    //T is for type
{
//private int[] data ;     //arraylist is also uses the object type
private Object[] data;
private static int Default_Size =10;
private int size=0;


public customAryList(){
   // this.data = new int[Default_Size];   // cannot be intiatiated like this <T>
  data = new Object[Default_Size];
}

public  void add(T num){
    if(this.isFull()) resize();
    data[size++]=num;
}

    private void resize() {
     Object[] temp=new Object[data.length*2];
     //copying current data array data to naya array
        for(int i=0;i<data.length;i++){
            temp[i]=data[i];
        }
        data =temp;
    }

    public T remove(){
    T removed = (T)(data[--size]);   //in the smallerOne we adding a biggerOne thatswhy casting rrequired
    return removed;
    }

    public T  getData(int index) {
        return (T)data[index];
    }

    public void set(int index, T value) {
        data[index] = value;  //casting not required as adding smaller one to biggerone
    }


    private boolean isFull() {
     return size==data.length;
    }

    @Override
    public String toString(){
    return "customArrayList{"+"data"+ Arrays.toString(data)+",size="+size + '}';
    }



    public static void main(String[] args) {
        customAryList list=new customAryList();
        list.add(3);
        list.add(5);
        list.add(7);
        //when the element excedded with its deafult size , size get doubled
//         for(int i=0;i<14;i++){
//             list.add(i);
//         }

        // System.out.println(list);   //it goes to the object class as list.toaString() , and it will override witho= our overrided toString() method


        customAryList<Integer> list3= new customAryList<>();
        list3.add(45);
        System.out.println(list3);

        customAryList<String>list4= new customAryList<>();
        list4.add("ankit");
    }

}

