/**
 * You are given an integer array nums consisting of n elements, and an integer k.
 *
 * <p>Find a contiguous subarray whose length is equal to k that has the maximum average value and
 * return this value. Any answer with a calculation error less than 10-5 will be accepted.
 *
 * @author zhaoxiaoping
 * @date 2026-01-19
 */
public class MaximumAverageInSubarray {
  public double findMaxAverage(int[] nums, int k) {
    int max = Integer.MIN_VALUE;
    int count = 0;
    for (int r = 0; r < nums.length; r++) {
      count += nums[r];
      if (r - k + 1 < 0) {
        continue;
      }
      max = Math.max(max, count);
      count -= nums[r - k + 1];
    }
    return (double) max / k;
  }

  public static void main(String[] args) {
    MaximumAverageInSubarray client = new MaximumAverageInSubarray();
    System.out.println(client.findMaxAverage(new int[] {1, 12, -5, -6, 50, 3}, 4));
  }
}
