package Linkedlist;

import java.util.LinkedList;

public class main {
    public static void main(String[] args) {
        // create linkedlist
        LinkedList<Integer> list = new LinkedList<>();
        list.add(72);                           // default add at last
        list.addFirst(80);                      // add firsrt
        list.addLast(80);                      // add lastt
        list.add(1,39);               // add middle
        System.out.println(list);
        list.remove();                          // default remove at first
        System.out.println(list);
        list.removeLast();                      // remove last
        System.out.println(list);
        list.remove(1);                   // remove at index
        System.out.println(list);
        // System.out.println(list.get(0));
    }
}
