/*
 Print merge intervel
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

public class MergeIntervals {
    public static List<Interval> merge(List<Interval> intervals) {
        List<Interval> mergedIntervals = new ArrayList<>();
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

        return mergedIntervals;
    }

    public static void main(String[] args) {
        List<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(6, 8));
        intervals.add(new Interval(1, 9));
        intervals.add(new Interval(2, 4));
        intervals.add(new Interval(4, 7));

        List<Interval> mergedIntervals = merge(intervals);
        for (Interval interval : mergedIntervals) {
            System.out.println("[" + interval.start + ", " + interval.end + "]");
        }
    }
}

