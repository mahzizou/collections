package com.afaqy;

import java.util.*;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<Integer>();

        al.add(1021);
        al.add(21231);
        al.add(5000);
        al.add(152);
        al.add(6000);
        al.add(154);
        al.add(2000);
        al.add(2,10000);

        System.out.println(al);
        System.out.println("First NO.: " + al.get(0));
        System.out.println("Last No.: " + al.get((al.size())-1) + "\n");


        // Collections.binarySearch
        int i1 = Collections.binarySearch(al, 152);
        System.out.println("Index Of No. 152: " + (i1));

        int i2 = Collections.binarySearch(al, 2000);
        System.out.println("Index Of No. 2000: " + (i2) + "\n");

        // Collections.max && Collections.max
        System.out.println("MAX No.: " + Collections.max(al));
        System.out.println("MIN No.: " + Collections.min(al) + "\n");

        ArrayList<Integer> al1 = new ArrayList<Integer>();
        al1.add(1000);
        al1.add(2000);
        al1.add(3000);
        al1.add(4000);
        al1.add(5000);
        al1.add(6000);

        // addALl
        al.addAll(al1);
        System.out.println("al: " + al + "\n");

        // ListIterator<E> listIterator(int index)
        ListIterator listIterator = al.listIterator(5);
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
        System.out.println();

        // int indexOf(Object o)
        System.out.println("The First Index of 5000: " + al.indexOf(5000) + "\n");

        // int lastIndexOf(Object o)
        System.out.println("The Last Index of 5000: " + al.lastIndexOf(5000) + "\n");

        ArrayList<Integer> al2 = new ArrayList<Integer>();
        al2.add(6000);
        al2.add(2000);
        al2.add(5000);
        al2.add(4500);
        al2.add(9000);
        al2.add(10000);

        // Iterator<E> Iterator()
        Iterator iterator = al2.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();

        System.out.println("ll before retainAll with ll2: " + al + "\n");

        // Intersection
        al.retainAll(al2);
        System.out.println("ll after retainAll with ll2: " + al + "\n");

    }

}

