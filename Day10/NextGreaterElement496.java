import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement496 {
    class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // Map to store next greater for each element in nums2
        Map<Integer, Integer> nextGreater = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        
        // Process nums2 from left to right
        for (int num : nums2) {
            // If current num is greater than stack top → it's the "next greater" for stack top
            while (!stack.isEmpty() && num > stack.peek()) {
                nextGreater.put(stack.pop(), num);
            }
            // Push current num into stack
            stack.push(num);
        }
        
        // Remaining elements in stack have no greater element
        while (!stack.isEmpty()) {
            nextGreater.put(stack.pop(), -1);
        }
        
        // Build result for nums1
        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = nextGreater.get(nums1[i]);
        }
        
        return ans;
    }
}

}
