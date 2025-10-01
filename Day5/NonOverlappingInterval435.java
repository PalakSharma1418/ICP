package Day5;

import java.util.Arrays;

public class NonOverlappingInterval435 {
    public static void main(String[] args) {
        
        int[][] intervals1 = {{1,2},{2,3},{3,4},{1,3}};
        System.out.println(eraseOverlapIntervals(intervals1));
    }
    public static int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) {
            return 0;
        }
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1],b[1]));
        int end = intervals[0][1];
        int count = 0;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < end) {
                count++; 
            } else {
                end = intervals[i][1];
            }
        }
        return count;
    }
}
