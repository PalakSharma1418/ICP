package Day5;

import java.util.Arrays;

public class BurstBallons452 {
    public static void main(String[] args) {
        
        int[][] points1 = {{10,16},{2,8},{1,6},{7,12}};
        System.out.println(findMinArrowShots(points1));
    }
    public static int findMinArrowShots(int[][] points){
        Arrays.sort(points , (a,b) -> Integer.compare(a[1] , b[1]));
        int count=1;
        int end=points[0][1];
        for(int i=1;i<points.length;i++){
            if(end<points[i][0]){
                count++;
                end=points[i][1];
            }
        }
        return count;
    }
}
