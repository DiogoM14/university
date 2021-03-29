/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ex03;

/**
 *
 * @author rjs
 */
public class LinkedList<T> {

    private int count;
    private LinearNode<T> head, tail;

    /**
     * Creates an empty list.
     */
    public LinkedList() {
        count = 0;
        head = tail = null;
    }

    public void add(T element) {

        LinearNode<T> newNode = new LinearNode<T>(element);
        LinearNode<T> oldHead = head;

        if (head == null) {
            head = newNode;
            newNode.setNext(tail);
        } else {
            head = newNode;
            newNode.setNext(oldHead);
        }

        count++;
    }

    public T remove(T element) throws EmptyCollectionException,
            ElementNotFoundException {
        if (head == null) {
            throw new EmptyCollectionException("List");
        }
        boolean found = false;
        LinearNode<T> previous = null;
        LinearNode<T> current = head;

        while (current != null && !found) {
            if (element.equals(current.getElement())) {
                found = true;
            } else {
                previous = current;
                current = current.getNext();
            }
        }

        if (!found) {
            throw new ElementNotFoundException("List");
        }

        if (this.count == 1) {
            head = tail = null;
        } else if (current.equals(head)) {
            head = current.getNext();
        } else if (current.equals(tail)) {
            tail = previous;
            tail.setNext(null);
        } else {
            previous.setNext(current.getNext());
        }

        count--;

        return current.getElement();
    }

    /**
     * Returns a string representation of this list.
     *
     * @return a string representation of this list
     */
    @Override
    public String toString() {
        LinearNode<T> current = head;
        String result = "";

        while (current != null) {

            result = result + (current.getElement()).toString() + "\n";
            current = current.getNext();
        }

        return result;
    }
}
