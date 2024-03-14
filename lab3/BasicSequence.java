package lab3;

public class BasicSequence {
	// Fields
	protected long current;

	// Constructors
	public BasicSequence(long start) {
		current = start;
	}

	// Methods
	protected long nextValue() {
		long answer = current;
		current = current + 1;
		return answer;
	}

	public void printSequence(int n) {
		for (int j = 0; j < n; j++)
			System.out.print(nextValue() + " ");
		System.out.println(); // end the line
	}
}
