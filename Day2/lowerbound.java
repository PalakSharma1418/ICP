public class lowerbound {
    public static void main(String[] args) {
        int [] arr ={1,2,4,4,4,7,9};
        System.out.println(lb(arr,0));
        System.out.println(lb(arr,1));
        System.out.println(lb(arr,2));
        System.out.println(lb(arr,3));
        System.out.println(lb(arr,4));
        System.out.println(lb(arr,5));
        System.out.println(lb(arr,6));
        System.out.println(lb(arr,7));
        System.out.println(lb(arr,8));
        System.out.println(lb(arr,9));
        System.out.println(lb(arr,10));
    
    }
    public static int lb(int[]arr,int k){
        int l=0;
        int r=arr.length-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(arr[mid] >= k){
                r=mid;
            }
            else if(arr[mid]<k){
                l=mid+1;
            }
        }
        return l;

        // return -1;
    }
}
