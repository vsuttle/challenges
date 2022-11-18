/**
 * Instead of using recursion use a traditional for loop to iterate over the sequence.
 *
 */
public class FibonacciIteration {

  private static final int END_VALUE = 2;

  public static void main(String[] args) {
    calculateFibSequence(3);
    calculateFibSequence(5);
    calculateFibSequence(10);
  }

  private static void calculateFibSequence(int n) {
    int value = fibSequence(n);
    System.out.println("Fibonacci value for n: " + n + "  is: " + value);
  }
  private static int fibSequence(int n) {
    // Set values for the first two numbers in the sequence
    int previous = 0, next = 1;
    for (int i = 0; i < n; i++) {
      // use a temporary variable to assist swapping the values over.
      int temp = previous;
      previous = next;
      next += temp;
    }
    return previous;
  }

}
