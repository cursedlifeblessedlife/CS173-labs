package lab6;

public class ConcatenateQueues {
    /* Concatenate queue Q1 and Q2 into T. */
    public static <E> void concatenate(Queue<E> Q1, Queue<E> Q2, Queue<E> T) {
        while (!Q1.isEmpty()) {
            T.enqueue(Q1.dequeue());
        }
        while (!Q2.isEmpty()) {
            T.enqueue(Q2.dequeue());
        }
    }

    public static void main(String args[ ]) {
        Integer[] a = {4, 8, 15};  // autoboxing allows this
        Integer[] b = {16, 23, 42, 50};  // autoboxing allows this

        Queue<Integer> s1 = new ArrayQueue<>(a.length);
        for (int i=0; i<a.length; ++i) {
            s1.enqueue(a[i]);
        }

        Queue<Integer> s2 = new ArrayQueue<>(b.length);
        for (int i=0; i<b.length; ++i) {
            s2.enqueue(b[i]);
        }

        Queue<Integer> t = new ArrayQueue<>(s1.size()+s2.size());
        concatenate(s1, s2, t);

        System.out.println("Dequeuing T:");
        while (!t.isEmpty()) {
            System.out.print(t.dequeue() + " ");
        }
    }
}


