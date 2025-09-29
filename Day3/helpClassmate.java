package Day3;

import java.util.Stack;

public class helpClassmate {
    public static int[] help_classmate(int arr[], int n) {
        // Your code goes here
        // nextsmaller
        int ans[]= new int[arr.length];
        Stack<Integer> st = new Stack<Integer>();
        for(int i=0;i<arr.length;i++){
            
            while(!st.isEmpty() && arr[i]<arr[st.peek()]){
                ans[st.pop()] = arr[i];
            }
            
            st.push(i);
        }
        while(!st.isEmpty()){
            ans[st.pop()]=-1;
        }
        return ans;
    }
}
// https://www.geeksforgeeks.org/problems/help-classmates--141631/1