import java.util.List;

public class recursion {
    public static void main(String[] args) {
        
    }

    public static void display(List<Integer> s){
        System.out.println(s);
        for(int i=0;i<s.size();i++){
            s.remove(i);
            display(s);
        }
    }
}
