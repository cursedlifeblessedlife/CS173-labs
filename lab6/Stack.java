package lab6;

public interface Stack<E> {
	/* Returns the number of elements in the stack. */
	int size( );
	
	/* Returns true if the stack is empty, false otherwise. */	
	boolean isEmpty( );
	
	/* Returns the element at the top of the stack or null if empty. */	
	E top( );
	
	/* Inserts an element at the top of the stack. */
	void push(E e);

	/* Removes and returns the top element from the stack or null if empty */
	E pop( );
}

