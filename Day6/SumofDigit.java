public class SumofDigit {
    public static void main(String[] args) {
        int n =124;
        System.out.println(sod(n));
        System.out.println(bi(31));
    }
    public static int sod(int n){
        
        if (n == 0) return 0; // base case
        return (n % 10) + sod(n / 10); 
    }
    public static int bi(int n){
        if(n==1) return 1;
        int c=0;
        if(n%2!=0){
            c+=1;
        }
        return c+bi(n/2);
    }
}
