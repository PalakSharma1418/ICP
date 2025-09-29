package Day3;

public class matrix_trasversal {
    public static void main(String[] args) {
        int [][] arr ={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("row wise");
        rowwise(arr);
        System.out.println("column wise");
        columnwise(arr);
        System.out.println("Primary diagonal row==col index");
        diagonal_primary(arr);
        System.out.println("Secondary diagonal row+col = n-1 index");
        diagonal_secondary(arr);
        
    }
    
    public static void rowwise(int[][]arr){
        int row = arr.length;
        int col=arr[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void columnwise(int[][]arr){
        int row = arr.length;
        int col=arr[0].length;
        for(int j=0;j<col;j++){
            for(int i=0;i<row;i++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void diagonal_primary(int[][]arr){
        int r=arr.length;
        // int c=arr[0].length;
        for(int i=0;i<r;i++){
            System.out.print(arr[i][i]+" ");
        }
    }
    public static void diagonal_secondary(int[][]arr){
        int r=arr.length;
        int c=arr[0].length;
        for(int i=0;i<r;i++){
            for(int j=c-1;j>=0;j--){
                if(i+j== arr.length-1)
                    System.out.print(arr[i][j]+" ");
            }
        }
    }
    
        
}

// no of diagonal in a matrix if r/c is even 4*4 =2n if odd then 2n-1
