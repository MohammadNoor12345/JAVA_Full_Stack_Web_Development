package L24_Lists;

import java.util.ArrayList;

public class L01_MyArrayList {
    static void main(String[] args) {
        /*
         * ArrayList is backed by array
         * it maintains insertion order (Insertion order is preserved)
         * Array List is dynamic
         * it allows duplicate
         * it allows heterogenous type of data
         * it allows null values
         */

        ArrayList al = new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);

        System.out.println(al);
        al.add(40);
        al.add(50);
        System.out.println(al);

        al.add("Rooman");
        al.add(30);
        al.add(40);
        al.add(null);
        al.add(null);
        System.out.println(al);
        System.out.println();
        System.out.println("Iterating over list using for");
        for(int i = 0; i < al.size(); i++){
            System.out.println(al.get(i));
        }
    }
}
