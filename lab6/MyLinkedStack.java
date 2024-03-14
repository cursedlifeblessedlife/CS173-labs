package lab6;

public class MyLinkedStack<E> implements Stack<E> {
    private DoublyLinkedList<E> list = new DoublyLinkedList<>();

    public MyLinkedStack() {}

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void push(E e) {
        list.addLast(e);
    }

    public E top() {
        return list.last();
    }

    public E pop() {
        return list.removeLast();
    }
}