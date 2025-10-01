package Day5;

import java.util.Arrays;

public class boat881 {
    public static void main(String[] args) {
        
        int[] people1 = {3, 2, 2, 1};
        int limit1 = 3;
        System.out.println("Minimum boats needed: " + numRescueBoats(people1, limit1));
    }
     public static int numRescueBoats(int[] people, int limit) {
        int boatCount = 0;
        Arrays.sort(people);
        
        int left = 0;
        int right = people.length - 1;
        
        while(left <= right){
            int sum = people[left] + people[right];
            if(sum <= limit){
                boatCount++;
                left++;
                right--;
            }
            else{
                boatCount++;
                right--;
            }
        }
        return boatCount;
    }
}
