/*
    Locascio, D. (2026). CIS 505 Intermediate Java Programming. Bellevue University.
*/

import java.util.LinkedList;

public class GenericQueue<E> {
    //Create generic linked list to store queue elements.
    private LinkedList<E> list = new LinkedList<E>();

    //Adds an item to the front of the queue.
    public void enqueue(E item) {
        list.addFirst(item);
    }

    //Removes and returns the item at the front of the queue and if empty, return null.
    public E dequeue() {
        if (!list.isEmpty()) {
            return list.removeFirst();
        } else {
            return null;
        }
    }

    //Returns the number of items currently in the queue.
    public int size() {
        return list.size();
    }

}