import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram438 {
    public static void main(String[] args) {
        String s1 = "cbaebabacd";
        String p1 = "abc";

        String s2 = "abab";
        String p2 = "ab";

        System.out.println("Example 1: " + findAnagrams(s1, p1)); 
        System.out.println("Example 2: " + findAnagrams(s2, p2)); 
    }

    public static List<Integer> findAnagrams(String s, String p) {
        int n = s.length(), m = p.length();
        List<Integer> ll = new ArrayList<>();
        if (n < m) return ll; // early exit

        int[] qu = new int[26]; // frequency of p
        for (char ch : p.toCharArray()) {
            qu[ch - 'a']++;
        }

        int[] fr = new int[26]; // frequency of sliding window
        int l = 0;

        for (int r = 0; r < n; r++) {
            fr[s.charAt(r) - 'a']++; // add current char to window

            // maintain window size = p.length()
            if (r - l + 1 == m) {
                if (Arrays.equals(fr, qu)) {
                    ll.add(l);
                }
                // shrink window
                fr[s.charAt(l) - 'a']--;
                l++;
            }
        }
        return ll;
    }
}
