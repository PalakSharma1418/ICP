package Day3;

public class Search_in_2d_74 {
    public static void main(String[] args) {
        
        int [][] arr ={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Search(arr, 8));
    }
    public static boolean Search(int[][] arr,int item){
        int row=0; int col=arr[0].length-1;
        while(row<arr.length && col>=0){
            if(arr[row][col]==item){
                return true;
            }
            else if(arr[row][col]>item){
               col--;
            }
            else{
                row++;
            }
        }
        return false;
    }
}
