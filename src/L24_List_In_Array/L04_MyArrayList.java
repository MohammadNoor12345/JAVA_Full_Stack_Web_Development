package L24_List_In_Array;

import java.util.LinkedList;

public class L04_MyArrayList {
    static void main(String[] args) {
        LinkedList<Integer> li = new LinkedList<>();
        li.add(10);
        li.add(20);
        li.add(30);
        li.add(40);
        li.add(50);
        li.add(1000);
        li.add(2000);
        System.out.println(li);
        li.remove(new Integer(20));// This is depricated
        li.remove(Integer.valueOf(20));
        li.remove(2);
        li.addFirst(5000);
        li.addLast(45000);
        System.out.println(li);

        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(1000);
        l2.add(2000);
        l2.add(3000);
        li.addAll(2,l2);
        li.retainAll(l2);


    }
}
