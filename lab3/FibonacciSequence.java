package lab3;

public class FibonacciSequence extends BasicSequence {

	private long prev;

	public FibonacciSequence(long first, long second) {
		// Current will be the first
		super(first);
		// Initialize prev with the fictitious value preceding the first
		prev = second - first;
		
	}

	// Override the method for updating current.
	protected long nextValue() {
		long answer = current;
		current = prev + current;
		prev = answer;
		return answer;
	}
}
