package Day5;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Queue406 {
    public static void main(String[] args) {
        int[][] people1 = {{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
        int[][] result1 = reconstructQueue(people1);
        System.out.println(Arrays.deepToString(result1));
    }
    public static int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (a,b) -> a[0] == b[0] ? a[1] - b[1] : b[0] - a[0]);

        List<int[]> ordered = new LinkedList<>();
        for (int[] p: people) ordered.add(p[1], p);

        return ordered.toArray(new int[people.length][2]);
    }
}
