package org.example.bitmanipulation;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MergeOverlInt {
    public static void main(String args[]){
        ArrayList<Interval> intervals = new ArrayList<>();
        /*intervals.add(new Interval(1,3));
        intervals.add(new Interval(2,6));
        intervals.add(new Interval(8,10));
        intervals.add(new Interval(15,18));*/
        intervals.add(new Interval(1,3));
        intervals.add(new Interval(2,6));
        intervals.add(new Interval(8,10));
        intervals.add(new Interval(15,6));
        merge(intervals).stream().forEach((v)->{
            System.out.println(v.toString());
        });
    }

    public static ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        int N = intervals.size();
        ArrayList<Interval> ans = new ArrayList<>();
        Interval prevInterval = intervals.get(0);//[2,6]
        for(int i = 1; i < N; i++){
            Interval newInterval = intervals.get(i);//[1,3]
            if(prevInterval.end < newInterval.start){
                //ans.add(prevInterval);
                //prevInterval = prevInterval;
                ans.add(newInterval);
                prevInterval = newInterval;
            }else if(newInterval.end < prevInterval.start){
                ans.add(prevInterval);
                prevInterval = prevInterval;
            }else{
                newInterval.start = min(newInterval.start, prevInterval.start);//1
                newInterval.end = max(newInterval.end, prevInterval.end);//6
                ans.add(newInterval);//[1,6]
                prevInterval = newInterval;//[1,6]
            }
        }

        return ans;
    }

    private static int min(int i1, int i2){
        return i1 < i2 ? i1 : i2;
    }
    private static int max(int i1, int i2){
        return i1 > i2 ? i1 : i2;
    }
}
