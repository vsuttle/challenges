import java.util.stream.IntStream;

/**
 * This time we generate all the fibonacci sequence numbers instead of just the nth one.
 * This time we will make use of the streams library.
 */
public class FibonacciStream {

  // The first two values in the sequence.
  // Local variables must be final in a lambda expression
  private static int previous = 0, next = 1, temp = 0;

  public static void main(String[] args) {
    generateFibSequence(3);
    generateFibSequence(5);
    generateFibSequence(10);
  }

  private static void generateFibSequence(int n) {
    System.out.println("\nn: " + n);
    streamSequence().limit(n).forEachOrdered(System.out::println);
    reset();
  }

  private static void reset() {
    previous = 0;
    next = 1;
    temp = 0;
  }

  private static IntStream streamSequence() {
    return IntStream.generate(() -> {
      temp = previous;
      previous = next;
      next += temp;
      return temp;
    });
  }

}
