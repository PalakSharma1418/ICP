package Day11;

public class NGE503 {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int result[]= new int[n];
        for(int i=0;i<n;i++){
            int k=i+1;
            boolean flag=false;
            while(i!=(k%n)){
                if(nums[k%n]>nums[i]){
                    result[i]=nums[k%n];
                    flag=true;
                    break;
                }
                k++;
                // k%=n;
            }
            if(!flag){
                result[i]=-1;
            }
        }
        return result;
    }
}
