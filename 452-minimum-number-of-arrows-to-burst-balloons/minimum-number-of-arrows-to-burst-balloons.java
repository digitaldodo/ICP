import java.util.*;

class Solution {
    public int findMinArrowShots(int[][] points) {
       Arrays.sort(points, Comparator.comparingInt(p -> p[1]));
        long arrows = 0;
        long last = Long.MIN_VALUE;
        
        for (int[] p : points) {
            if (last < p[0]) {
                last = p[1];
                arrows++;
            }
        }
        
        return (int) arrows;
    }
}
