package Day1;

import java.util.Arrays;

public class BurstBallone452 {
    public static void main(String[] args) {
        int[][] points = {{10,16},{2,8},{1,6},{7,12}};
    System.out.println(findMinArrowShots(points));
    }
     public static int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1])); // avoid overflow
        int c=1;
        int end = points[0][1];
        for(int i=1;i<points.length;i++){
            if(end>=points[i][0]){
                // end=points[i][1];end is already the smallest possible right boundary (since array sorted by end). update kara to bo bada ho jayega which is useless
                continue;
            }
            else{
                c++;
                end=points[i][1];
            }
        }
        return c;
    }
}
