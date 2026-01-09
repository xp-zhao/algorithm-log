/**
 * 计算数组区间内的元素和
 *
 * <p>思路： 1. 初始化时，计算数组前缀和 2. 查询时，返回前缀和的差值
 *
 * @author zhaoxiaoping
 * @date 2026-01-07
 */
public class NumArray {
  private int[] nums;

  /** 前缀和数组 */
  private int[] preSum;

  public NumArray(int[] nums) {
    this.nums = nums;
    // 初始化前缀和数组
    preSum = new int[nums.length + 1];
    for (int i = 0; i < nums.length; i++) {
      preSum[i + 1] = preSum[i] + nums[i];
    }
  }

  public int sumRange(int left, int right) {
    // 常见思路是循环遍历求和，但是时间复杂度是O(n)
    //    int sum = 0;
    //    for (int i = left; i <= right; i++) {
    //      sum += nums[i];
    //    }
    //    return sum;
    // 通过前缀和数组，计算区间和的时间复杂度是O(1)
    return preSum[right + 1] - preSum[left];
  }

  public static void main(String[] args) {
    NumArray numArray = new NumArray(new int[] {-2, 0, 3, -5, 2, -1});
    System.out.println(numArray.sumRange(0, 2)); // 1
    System.out.println(numArray.sumRange(2, 5)); // -1
    System.out.println(numArray.sumRange(0, 5)); // -3
  }
}
