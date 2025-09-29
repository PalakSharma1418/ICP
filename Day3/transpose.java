package Day3;

public class transpose {
    public static void main(String[] args) {
        
        int [][] arr ={{1,2,3},{4,5,6},{7,8,9}};
        transposem(arr);
    }
        public static void transposem(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(i<j){
                    int t=arr[i][j];
                    arr[i][j]=arr[j][i];
                    arr[j][i]=t;
                }
            }
        }
}
}
