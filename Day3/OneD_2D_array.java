package Day3;

public class OneD_2D_array {
    // we have given oneD array and row and column we need to make 2d array out  of it
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,6,7,8,9,0,7};
        int r=3;
        int c=4;

        // now answer
        int ind=0;
        int mat[][] = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j]=arr[ind++];
            }
        }

        display(mat);
    }
    public static void display(int[][]arr){
        int row = arr.length;
        int col=arr[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}



// jagged array 
        // int [][] arr = new int[2][];
        // arr[0] = new int[3];
        // arr[1] = new int[5];