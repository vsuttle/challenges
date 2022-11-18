import java.util.HashMap;
import java.util.Map;

/**
 * A more efficient version that stores the result of previous calculations
 * to avoid repeatedly calculating them.
 * I have not worried about a high value of "n" resulting in integer overflow!
 */
public class FibonacciMemoize {
  private static final int END_VALUE = 2;
  // Create an initial map with the first two values of the sequence
  // already calculated, i.e. 0 -> 0 and 1 -> 1.
  private static final Map<Integer, Integer> map =
    new HashMap<>(Map.of(0, 0, 1, 1));

  public static void main(String[] args) {
    calculateFibSequence(5);
    calculateFibSequence(10);
    // n = 40 should not take too long with the memoization optimisation.
    calculateFibSequence(40);
  }

  private static void calculateFibSequence(int n) {
    int value = fibSequence(n);
    System.out.println("Fibonacci value for n: " + n + "  is: " + value);
  }
  private static int fibSequence(int n) {
    if (!map.containsKey(n)) {
      // value not yet calculated
      int value = fibSequence(n -1) + fibSequence(n - 2);
      map.put(n, value);
    }

    // All values calculated so return the sequence number
    return map.get(n);
  }
}
