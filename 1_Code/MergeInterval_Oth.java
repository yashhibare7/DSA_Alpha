/*
 Print other than merge interval
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Interval {
    int start;
    int end;

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

public class MergeInterval_Oth {
    public static List<Interval> merge(List<Interval> intervals) {
        List<Interval> mergedIntervals = new ArrayList<>();
        List<Interval> remainingIntervals = new ArrayList<>();
        if (intervals == null || intervals.size() == 0) {
            return mergedIntervals;
        }

        // Sort intervals based on their start time
        Collections.sort(intervals, (a, b) -> Integer.compare(a.start, b.start));

        Interval currentInterval = intervals.get(0);
        for (int i = 1; i < intervals.size(); i++) {
            Interval nextInterval = intervals.get(i);

            if (currentInterval.end >= nextInterval.start) {
                // Merge intervals
                currentInterval.end = Math.max(currentInterval.end, nextInterval.end);
            } else {
                // Add current merged interval to the result list
                mergedIntervals.add(currentInterval);
                currentInterval = nextInterval;
            }
        }

        // Add the last merged interval
        mergedIntervals.add(currentInterval);

        // Remove merged intervals from the original list and print remaining intervals
        for (Interval interval : intervals) {
            if (!mergedIntervals.contains(interval)) {
                remainingIntervals.add(interval);
                System.out.println("[" + interval.start + ", " + interval.end + "]");
            }
        }

        return remainingIntervals;
    }

    public static void main(String[] args) {
        List<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(6, 8));
        intervals.add(new Interval(1, 9));
        intervals.add(new Interval(2, 4));
        intervals.add(new Interval(4, 7));

        List<Interval> remainingIntervals = merge(intervals);
    }
}
