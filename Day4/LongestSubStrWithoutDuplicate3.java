import java.util.HashSet;
import java.util.Set;

public class LongestSubStrWithoutDuplicate3 {
    public static void main(String[] args) {
        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";
        String s4 = "au";

        System.out.println("Using HashSet approach:");
        System.out.println("Input: " + s1 + " → " + lengthOfLongestSubstring2(s1));
        System.out.println("Input: " + s2 + " → " + lengthOfLongestSubstring2(s2));
        System.out.println("Input: " + s3 + " → " + lengthOfLongestSubstring2(s3));
        System.out.println("Input: " + s4 + " → " + lengthOfLongestSubstring2(s4));

        System.out.println("\nUsing Frequency Array approach:");
        System.out.println("Input: " + s1 + " → " + lengthOfLongestSubstring(s1));
        System.out.println("Input: " + s2 + " → " + lengthOfLongestSubstring(s2));
        System.out.println("Input: " + s3 + " → " + lengthOfLongestSubstring(s3));
        System.out.println("Input: " + s4 + " → " + lengthOfLongestSubstring(s4));
    }

    public static int lengthOfLongestSubstring2(String s) {
        int n = s.length();
        int l = 0, r = 0, max = 0;
        Set<Character> set = new HashSet<>();

        while (r < n) {
            char ch = s.charAt(r);

            // If duplicate, shrink from left
            while (set.contains(ch)) {
                set.remove(s.charAt(l));
                l++;
            }

            set.add(ch);
            max = Math.max(max, r - l + 1);
            r++;
        }
        return max;
    }

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n == 1) return 1;
        if (n == 2) return s.charAt(0) != s.charAt(1) ? 2 : 1;

        int l = 0, r = 0;
        int max = 0;
        int[] fr = new int[128]; // ASCII frequency array

        while (l <= r && r < n) {
            char ch = s.charAt(r);
            fr[ch]++;

            // Shrink window if duplicate
            while (fr[ch] > 1) {
                fr[s.charAt(l)]--;
                l++;
            }

            max = Math.max(max, r - l + 1);
            r++;
        }

        return max;
    }
}
