import java.util.*;

class Linkedlist {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add("CPP");
        ll.add("Java");
        ll.add("Python");
        ll.add("PHP");
        Iterator i = ll.iterator();
        System.out.println("\ncontents of the List using an Iterator:\n");
        while (i.hasNext()) {
            String s = (String) i.next();
            System.out.println(s);
        }

        ListIterator li = ll.listIterator();
        while (li.hasNext()) {
            // String elt = (String)
            li.next();
        }
        System.out.println("\ncontents of the List in reverse order using a ListIterator : ");
        while (li.hasPrevious()) {
            System.out.println(li.previous());
        }
    }
}