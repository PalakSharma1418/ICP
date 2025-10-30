

import java.util.ArrayList;
import java.util.List;

public class MinStack155 {
    class MinStack {
        public List<Integer> min ;
        public List<Integer> stack ;
        public MinStack() {
            min = new ArrayList<>();
            stack = new ArrayList<>();
        }
        
        public void push(int val) {
            stack.add(val);
            if(min.isEmpty() || min.get(min.size()-1) >= val) {
                min.add(val);
            }

        }
        
        public void pop() {
            int popEle = stack.remove(stack.size()-1);
            if(!min.isEmpty() && popEle == min.get(min.size()-1)) {
                min.remove(min.size()-1);
            }
        }
        
        public int top() {
            return stack.get(stack.size()-1);
        }
        
        public int getMin() {
            return min.get(min.size()-1);
        }
    }

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
}
