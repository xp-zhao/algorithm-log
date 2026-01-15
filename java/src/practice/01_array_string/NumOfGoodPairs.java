/**
 * Given an array of integers nums, return the number of good pairs.
 *
 * <p>A pair (i, j) is called good if nums[i] == nums[j] and i < j.
 *
 * @author zhaoxiaoping
 * @date 2026-01-15
 */
public class NumOfGoodPairs {
  public int numIdenticalPairs(int[] nums) {
    int count = 0;
    int[] arr = new int[101];
    for (int num : nums) {
      count += arr[num];
      arr[num]++;
    }
    return count;
  }

  public static void main(String[] args) {
    NumOfGoodPairs numOfGoodPairs = new NumOfGoodPairs();
    System.out.println(numOfGoodPairs.numIdenticalPairs(new int[] {1, 2, 3, 1, 1, 3}));
    System.out.println(numOfGoodPairs.numIdenticalPairs(new int[] {1, 1, 1, 1}));
  }
}
