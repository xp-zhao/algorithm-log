/**
 * Given an array of integers arr and two integers k and threshold, return the number of sub-arrays
 * of size k and average greater than or equal to threshold.
 *
 * @author zhaoxiaoping
 * @date 2026-01-19
 */
public class LeetCode1343 {
  public int numOfSubarrays(int[] arr, int k, int threshold) {
    int result = 0;
    int count = 0;
    for (int r = 0; r < arr.length; r++) {
      count += arr[r];
      if (r - k + 1 < 0) {
        continue;
      }
      if (count / k >= threshold) {
        result++;
      }
      count -= arr[r - k + 1];
    }
    return result;
  }

  public static void main(String[] args) {
    LeetCode1343 client = new LeetCode1343();
    System.out.println(client.numOfSubarrays(new int[] {2, 2, 2, 2, 5, 5, 5, 8}, 3, 4));
  }
}
