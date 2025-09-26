package Day1;

import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowMax239 {
    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int an[]= maxSlidingWindow1(nums, k);
        for(int n:an){
            System.out.println(n);
        }
    }
    
    public static int[] maxSlidingWindow1(int[] nums, int k) {
// optimise
            Deque<Integer> deque=new ArrayDeque<>();
            int []ans=new int[nums.length-k+1];
            for(int i=0;i<k;i++){
                while(deque.size() > 0 && nums[deque.getLast()]<=nums[i]){
                    deque.removeLast();
                }
                deque.addLast(i);
            }
            int start=0;
            for(int i=k;i<nums.length;i++){
                ans[start]=nums[deque.getFirst()];
                start++;
                // remove element which is not in a window
                while(deque.size() > 0 && deque.getFirst()<=i-k){
                        deque.removeFirst();
                }
                // remove element which is smaller
                 while(deque.size() > 0 && nums[deque.getLast()]<=nums[i]){
                        deque.removeLast();
                }

                deque.addLast(i);
            }
            ans[nums.length-k]=nums[deque.getFirst()];

            return ans;
    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        if(k==1){
            return nums;
        }
        int n= nums.length;
        int l=0,r=k;
        int [] result=new int[n-k+1];
        int in=0;
        result[in++]=max(nums,l,r);
        int ma=max(nums,l,r);
        while(r<n){
            l++;
            r++;
            if(nums[r-1]>ma){
                result[in++]=ma;
            }
        }
        return result;
    }
    public int max(int [] arr,int si,int ei){
        int ma=arr[si];
        for(int i=si;i<ei;i++){
            if(arr[i] > ma){
                ma=arr[i];
            }
        }
        return ma;
    }
    

}
