package com.technologies.stream;

import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

import static java.util.Arrays.asList;

public class Reduce {

    public static void main(String[] args){
        //Calculate sum of 10 numbers
        OptionalInt optionalIntSum = IntStream.rangeClosed(1,10).reduce((a, b)->a+b);

        System.out.println(optionalIntSum.getAsInt());
        List<Integer> entiers = asList(1, 2, 3, 4, 5, 6, 7, 8, 9);


        System.out.println(entiers); //[1, 2, 3, 4, 5, 6, 7]

        System.out.println(entiers.stream().reduce((a, b)->a+b).get());
    }
}
