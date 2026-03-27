package L24_List_In_Array;

import java.util.ArrayList;

public class L03_MyArrayList {
    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<>(16);


        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");


        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }
}
