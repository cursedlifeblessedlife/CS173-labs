package lab5;

public class MySinglyLinkedList<E> extends SinglyLinkedList<E> {
    // Returns the element at index k
    public E getElementAt (int k) {
        Node<E> walk = head;
        int counter = 0;
        while (walk != null) {
            if (counter != k) {
                counter += 1;
                walk = walk.getNext();
            }
            else {
                return walk.getElement();
            }
        }
        return null;
    }

    // The main method
    public static void main(String[] args) {
        MySinglyLinkedList<String> mylist = new MySinglyLinkedList<>();
        mylist.addLast("Rob");
        mylist.addLast("Mike");
        mylist.addLast("Rose");
        mylist.printList();

        System.out.println("Element at index " + 0 + " is " + mylist.getElementAt(0));
        System.out.println("Element at index " + 10 + " is " + mylist.getElementAt(10));

        mylist.addFirst("Leo");
        mylist.addLast("Alice");
        mylist.printList();
        System.out.println("Element at index " + 0 + " is " + mylist.getElementAt(0));
        System.out.println("Element at index " + 3 + " is " + mylist.getElementAt(3));
        int k = mylist.size();
        System.out.println("Element at index " + k + " is " + mylist.getElementAt(k));

        mylist.removeFirst();
        mylist.printList();
        System.out.println("Element at index " + 0 + " is " + mylist.getElementAt(0));
        k = mylist.size()-1;
        System.out.println("Element at index " + k + " is " + mylist.getElementAt(k));
    }
}

