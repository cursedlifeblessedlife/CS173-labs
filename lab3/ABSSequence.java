package lab3;

public class ABSSequence extends BasicSequence {

	private long prev;

	public ABSSequence(long first, long second) {
		// Current will be the first
		super(first);
		// Initialize prev with the fictitious value preceding the first
		prev = second + first;
		
		
	}

	protected long nextValue() {
		long answer = current;
        current = Math.abs(prev - current);
        prev = answer;
        return answer;
    }
}