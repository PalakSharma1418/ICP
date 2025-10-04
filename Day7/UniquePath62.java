public class UniquePath62 {
    public static void main(String[] args) {
        System.out.println(uniquePaths(3, 3));
    }
    public static int uniquePaths(int m, int n) {
        int dp[][]= new int[m][n];
        return pp(0,0,m,n,dp);
    }
    public static int pp(int cr,int cc, int r, int c,int[][] dp){
        if(cr>=r || cc >=c){
            return 0;
        }
        if(cr==r-1 || cc==c-1){
            return 1;
        }
        if(dp[cr][cc]!=0){
            return dp[cr][cc];
        }
        int a = pp(cr+1,cc,r,c,dp);
        int b= pp(cr,cc+1,r,c,dp);
        return dp[cr][cc]= a+b; 
    }
}
