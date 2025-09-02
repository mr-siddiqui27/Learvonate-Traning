package Lecture_8;
import java.util.ArrayList;
import java.util.Arrays;

public class MergeIntervals {
    public static ArrayList<int[]> merge(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        ArrayList<int[]> list = new ArrayList<>();
        int[] current = intervals[0];
        for(int i=1; i<n; i++){
            if(current[1]>=intervals[i][0]) current[1]=Math.max(current[1], intervals[i][1]);
            else{
                list.add(current);
                current = intervals[i];
            }
        }

        list.add(current);
        return list;
     }

    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        ArrayList<int[]> list = merge(intervals);
        for(int[] arr: list){
            System.out.println(Arrays.toString(arr));
        }
    }
}
