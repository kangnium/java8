package com.company.stream;

import java.util.HashSet;
import java.util.IntSummaryStatistics;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsAvgSummarizing {

    public static void main(String[] args){
        // :: donne la moyenne en Double de la collection
        // Collectors.averagingInt
        // Collectors.averagingLong
        // Collectors.averagingDouble

        // :: donne une stats{count, sum, min, average, max} des cellules du tableau, sous la forme IntSummaryStatistics
        // Collectors.summarizingInt
        // Collectors.summarizingLong
        // Collectors.summarizingDouble

        // Collectors.summingInt(x->x) donne la somme des cellules du tableau
        // Collectors.summingLong
        // Collectors.summingDouble

        Set<Integer> numSet = new HashSet<>();
        numSet.add(11);
        numSet.add(12);
        numSet.add(13);
        numSet.add(224);
        numSet.add(15);
        numSet.add(105);

        Double avg = numSet.stream().collect(Collectors.averagingInt(x -> x));
        System.out.println(avg);

        IntSummaryStatistics summary = numSet.stream().collect(Collectors.summarizingInt(x->x));
        System.out.println(summary);
        System.out.println(summary.getMax());

        Set<Integer> numSet2 = new HashSet<>();
        numSet2.add(11);
        numSet2.add(12);
        numSet2.add(13);
        numSet2.add(224);
        numSet2.add(15);
        numSet2.add(105);

        IntSummaryStatistics summary2 = numSet2.stream().collect(Collectors.summarizingInt(x->x));

        summary.combine(summary2);//this should combine both the summary

        System.out.println(summary);//output of combined summary

        System.out.println(summary2);//output of combined summary


        Integer summary3 = numSet.stream().mapToInt(x -> x).sum();
        System.out.println(summary3);
        // System.out.println(summary3.  .getMax());
    }
}
