import java.util.Arrays;

public class PermutationInString567 {
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        System.out.println(checkInclusion(s1, s2)); 

        String s3 = "ab";
        String s4 = "eidboaoo";
        System.out.println( checkInclusion(s3, s4)); 
    }

    public static boolean checkInclusion(String s1, String s2) {
        int n = s1.length(), m = s2.length();
        if (n > m) return false; // s1 can't fit into s2

        int[] need = new int[26]; // frequency of s1
        for (char c : s1.toCharArray()) {
            need[c - 'a']++;
        }

        int[] window = new int[26]; // frequency of sliding window
        int l = 0;

        for (int r = 0; r < m; r++) {
            window[s2.charAt(r) - 'a']++;

            // maintain window size = n
            if (r - l + 1 == n) {
                if (Arrays.equals(window, need)) {
                    return true;
                }
                // shrink window
                window[s2.charAt(l) - 'a']--;
                l++;
            }
        }

        return false;
    }
}
