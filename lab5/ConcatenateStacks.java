package lab5;

public class ConcatenateStacks {
    public static <E> void concatenate(Stack<E> S1, Stack<E> S2, Stack<E> T) {
        Stack<E> auxStack = new ArrayStack<>();

        while (!S1.isEmpty()) {
            auxStack.push(S1.pop());
        }

        while (!auxStack.isEmpty()) {
            T.push(auxStack.pop());
        }

        while (!S2.isEmpty()) {
            auxStack.push(S2.pop());
        }

        while (!auxStack.isEmpty()) {
            T.push(auxStack.pop());
        }
    }
    public static void main(String args[]) {
        Integer[] a = {4, 8, 15};  // autoboxing allows this
        Integer[] b = {16, 23, 42, 50};  // autoboxing allows this

        Stack<Integer> s1 = new ArrayStack<>(a.length);
        for (int i = 0; i < a.length; ++i) {
            s1.push(a[i]);
        }

        Stack<Integer> s2 = new ArrayStack<>(b.length);
        for (int i = 0; i < b.length; ++i) {
            s2.push(b[i]);
        }

        Stack<Integer> t = new ArrayStack<>(s1.size() + s2.size());
        concatenate(s1, s2, t);

        System.out.println("Popping T:");
        while (!t.isEmpty()) {
            System.out.print(t.pop() + " ");
        }
    }
}

