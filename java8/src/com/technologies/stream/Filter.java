package com.technologies.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class Filter {

    public static void main(String[] a) {
        List<Integer> lesNombres = asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        System.out.println(lesNombres);//[1, 2, 3, 4, 5, 6, 7]
        //Until Java 7 - Odd numbers

        List<Integer> nombreImpairs = new ArrayList<>();
        for (Integer num : lesNombres) {
            if (num % 2 != 0) {
                nombreImpairs.add(num);
            }
        }
        System.out.println(nombreImpairs);//[1, 3, 5, 7]

        //Java 8 - streams
        //Stream<Integer> stream = numbers.stream();
        //oddNumbers = numbers.stream().filter(num -> num%2 != 0).collect(Collectors.toList());

        /* Utiliser un predicate d'entier */
        Predicate<Integer> impairPredicate = num -> num % 2 != 0;
        nombreImpairs = lesNombres.stream().filter(impairPredicate).collect(Collectors.toList());
        System.out.println("Nombre impairs (Odd numbers) using Java-8 Stream: " + nombreImpairs);

        // nombre pairs
        Predicate<Integer> pairPredicate = num -> num % 2 == 0;
        List<Integer> nombrePairs = lesNombres.stream().filter(pairPredicate).collect(Collectors.toList());
        System.out.println("Nombre pairs (Odd numbers) using Java-8 Stream: " + nombrePairs);

    }
}
