package Day9;

import java.util.Stack;

public class xy {
    public static void main(String[] args) {
        String s ="xxxyxxxyyyy";
        String g ="yxxyxyyyy";
        System.out.println(fun(s));
        System.out.println(fun(g));
    }
    public static int fun(String s){
        Stack<Character> st = new Stack<>();
        int move=0;
        for(char c:s.toCharArray()){
            if(c == 'x'){
                if(!st.isEmpty() && st.peek() == 'y'){
                    move++;
                    st.push('x'); 
                } else {
                    st.push('x'); 
                }
            } else { // c == 'y'
                st.push('y'); 
            }
        }

        return move;
    }
      public static int fun2(String s) {
        int move = 0;
        boolean seenY = false;  // becomes true once we start seeing 'y'

        for (char c : s.toCharArray()) {
            if (c == 'y') {
                seenY = true;   // mark that we have entered y-block
            } else if (c == 'x' && seenY) {
                // 'x' comes after 'y' → misplaced block
                move++;
                seenY = false;  // reset to avoid double counting continuous x's
            }
        }

        return move;
    }
}
