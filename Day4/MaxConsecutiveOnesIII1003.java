public class MaxConsecutiveOnesIII1003 {
    public static void main(String[] args) {
        int[] nums1 = {1,1,1,0,0,0,1,1,1,1,0};
        int k1 = 2;

        int[] nums2 = {0,0,1,1,1,0,0};
        int k2 = 0;

        System.out.println("Example 1: " + longestOnes(nums1, k1)); 
        System.out.println("Example 2: " + longestOnes(nums2, k2)); 
    }

    public static int longestOnes(int[] nums, int k) {
        int si = 0, ei = 0, flip = 0, ans = 0;

        while (ei < nums.length) {
            // grow
            if (nums[ei] == 0) {
                flip++;
            }

            // shrink
            while (flip > k && si <= ei) {
                if (nums[si] == 0) {
                    flip--;
                }
                si++;
            }

            // update answer
            ans = Math.max(ans, ei - si + 1);
            ei++;
        }
        return ans;
    }
}
