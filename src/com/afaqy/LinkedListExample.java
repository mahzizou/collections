package com.afaqy;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {

    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<String>();

        ll.add("Hello");
        ll.add("Afaqy");
        ll.add("Java");
        ll.add(2,"From");
        ll.add("Team");
        ll.addFirst("Welcome");

        System.out.println(ll);
        System.out.println("First Word: " + ll.getFirst());
        System.out.println("Last Word: " + ll.getLast() + "\n");

        // Collections.binarySearch
        int iJava = Collections.binarySearch(ll, "Java");
        System.out.println("Java No. " + (iJava+1));

        int iTeam = Collections.binarySearch(ll, "Team");
        System.out.println("Team No. " + (iTeam+1) + "\n");

        // Collections.max && Collections.max
        System.out.println("MAX: " + Collections.max(ll));
        System.out.println("MIN: " + Collections.min(ll) + "\n");

        LinkedList<String> ll1 = new LinkedList<String>();
        ll1.add("From");
        ll1.add("HI");
        ll1.add("Linked");
        ll1.add("List");
        ll1.add("Team");
        ll1.add("Java");

        // addALl
        ll.addAll(ll1);
        System.out.println("ll: " + ll + "\n");

        // ListIterator<E> listIterator(int index)
        ListIterator listIterator = ll.listIterator(5);
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
        System.out.println();

        // int indexOf(Object o)
        System.out.println("The First Index of Java: " + ll.indexOf("Java") + "\n");

        // int lastIndexOf(Object o)
        System.out.println("The Last Index of Java: " + ll.lastIndexOf("Java") + "\n");

        LinkedList<String> ll2 = new LinkedList<String>();
        ll2.add("This");
        ll2.add("Is");
        ll2.add("New");
        ll2.add("List");
        ll2.add("Team");
        ll2.add("Java");

        // Iterator<E> descendingIterator()
        System.out.println("ll2");
        Iterator descendingIterator = ll2.descendingIterator();
        while (descendingIterator.hasNext()) {
            System.out.println(descendingIterator.next());
        }
        System.out.println();

        System.out.println("ll before retainAll with ll2: " + ll + "\n");

        // Intersection
        ll.retainAll(ll2);
        System.out.println("ll after retainAll with ll2 : " + ll + "\n");

    }

}
