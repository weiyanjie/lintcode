package top.androidman.lintcode;

public class LintCode_75 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] nums = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,90,89,88,87,86,85,84,83,82,81,80,79,78,77,76,75,74,73,72,71,70,69,68,67,66,65,64,63,62,61,60,59,58,57,56,55,54,53,52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0};
		System.out.println(findPeak(nums));
	}

	public static int findPeak(int[] nums) {
		// write your code here
		int left = 0;
		int right = nums.length - 1;
		while (left <= right) {
			int mid = (right + left) / 2;
			if (mid == 0) {
				return 1;
			}
			if (mid == nums.length -1) {
				return mid - 1;
			}
			if (nums[mid - 1] < nums[mid] && nums[mid] > nums[mid + 1]) {
				return mid;
			}else if (nums[mid] < nums[mid -1]) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
			System.out.println("left=" + left + ",mid=" + mid + ",right=" + right);
		}
		return -1;
	}

}
