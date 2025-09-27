

public class upperbound {
public static void main(String[] args) {
        int [] arr ={1,2,4,4,4,7,9};
        System.out.println(ub(arr,0));
        System.out.println(ub(arr,1));
        System.out.println(ub(arr,2));
        System.out.println(ub(arr,3));
        System.out.println(ub(arr,4));
        System.out.println(ub(arr,5));
        System.out.println(ub(arr,6));
        System.out.println(ub(arr,7));
        System.out.println(ub(arr,8));
        System.out.println(ub(arr,9));
        System.out.println(ub(arr,10));
    
    }
    public static int ub(int[]arr,int k){
        int l=0;
        int r=arr.length;
        while(l<r){
            int mid=(l+r)/2;
            if(arr[mid] <= k){
                l=mid+1;
            }
            else if(arr[mid]<k){
                r=mid;
            }
        }
        return l;
    }
    
}
