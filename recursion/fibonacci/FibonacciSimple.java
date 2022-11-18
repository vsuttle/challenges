/**
 * A simple naive implementation of the Fibonacci sequence using recursion that works but is not very efficient.
*/
public class FibonacciSimple {

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
    // check if we have reached the end of the recursion
    if (n < END_VALUE) {
      return n;
    }
    return fibSequence(n -1) + fibSequence(n -2);
  }

}


