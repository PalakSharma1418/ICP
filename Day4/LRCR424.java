public class LRCR424 {
    public static void main(String[] args) {
        String s1 = "ABAB";
        int k1 = 2;
        System.out.println(characterReplacement(s1, k1));
    }
    public static int characterReplacement(String s, int k) {
        int ans = 0;
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            ans = Math.max(ans, help(s, k, ch));
        }
        return ans;
    }
    public static int help(String s , int k,char ch){
        int l=0,r=0;
        int swap=0;
        int an=0;
        while(r<s.length() && l<=r){
            int a = s.charAt(r);
            if(a!=ch){
                swap++;
            }
            while(swap>k){
                if(s.charAt(l)!=ch){
                    swap--;
                }
                l++;
            }
            an = Math.max(an, r - l + 1);
            r++;
        }
        return an;
    }
}
