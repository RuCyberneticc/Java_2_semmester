import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[][] intervals = {{1, 5}, {6, 10}, {11, 15}};
        int count = calculateIntervals(intervals);
        System.out.println(count);
    }
    public static int calculateIntervals(int[][] intervals) {
        int count = 0;
        for (int i = 0; i < intervals.length; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];
            count += end - start - 1;
        }
        return count;
    }
}
