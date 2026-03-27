package L24_List_In_Array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class L02_MyArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();

        al.add(10);
        al.add(20);
        al.add(30);
        // al.add("Odisha"); // ❌ Not allowed (Integer list)

        al.add(40);
        al.add(50);
        al.add(60);
        al.add(70);
        al.add(80);
        al.add(90);
        al.add(100);

        System.out.println(al);

        System.out.println();
        System.out.println("Looping using foreach loop");

        for (Integer a : al) {
            System.out.println(a);
        }

        System.out.println();
        System.out.println("Using iterator");

        Iterator<Integer> itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println();
        System.out.println("Using List Iterator");
        ListIterator<Integer> litr = al.listIterator();
        while (litr.hasNext()) {
            System.out.println(litr.next());
        }

        System.out.println();
        System.out.println("Using List Iterator in reverse order");
        while (litr.hasPrevious()) {
            System.out.println(litr.previous());
        }
    }
}