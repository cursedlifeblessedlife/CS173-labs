package lab3;

public class TestSequences {
  public static void main(String[] args) {
    BasicSequence a = new BasicSequence(0);
    a.printSequence(10);

    FibonacciSequence b = new FibonacciSequence(0,1);
    b.printSequence(10);

    ABSSequence c = new ABSSequence(2, 200);
    c.printSequence(10);

  }
}
