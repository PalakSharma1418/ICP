package Day1;

public class FirstLast34 {
    public static void main(String[] args) {
        int nums[]={5,7,7,8,8,10};
        int [] a=searchRange(nums, 8);
        System.out.println(a[0]+" "+a[1]);
    }
    public static int[] searchRange1(int[] nums, int target) { //O(n)
        int f=-1,s=-1;
        int [] h= new int[2];
        for(int i=0;i<nums.length;i++){
            if(f==-1 && nums[i]==target){
                f=i;
            }
            else if(nums[i]==target){
                s=i;
            }
        }
        if(s==-1){
             h[0]=f;
             h[1]=f;
        }
        else{    
            h[0]=f;
            h[1]=s;
        }
        return h;
    }
    public static int[] searchRange(int[] nums, int target) {
        int first = binarySearch(nums, target, true);   // search for first position
        int last = binarySearch(nums, target, false);   // search for last position
        return new int[]{first, last};
    }

    private static int binarySearch(int[] nums, int target, boolean isLeft) {
        int low = 0, high = nums.length - 1, ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                ans = mid;
                if (isLeft) {
                    high = mid - 1; // keep searching left side
                } else {
                    low = mid + 1; // keep searching right side
                }
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

}
