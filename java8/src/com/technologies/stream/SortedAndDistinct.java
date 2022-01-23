package com.technologies.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class SortedAndDistinct {

    public static void main(String[] a) {
        /*
        stream.sorted() :   permet de TRIER les éléments d'un tableau /une collection par ordre croissant ou décroissant
                            retourne un Stream
        stream.distinct() : distinct unique que des elements uniques
                            retourne un Stream
        */

        List<Integer> nombresList = asList(1, 22, 22, 3, 41, 5, 63);
        nombresList.add(7); // ajouter un dernier chiffre

        //Cet affichage va être donné selon l'ordre d'insertion des nombresList
        System.out.println(nombresList);

        /* ORDRE CROISSANT*/
        //Cet affichage va être fait selon l'ordre croissant (ascending sort)
        System.out.println(nombresList.stream()
                .sorted()
                .collect(Collectors.toList()));

        /* ORDRE DECROISSANT*/
        //Cet affichage va être fait selon l'ordre décroissant [customisé] (descending sort sorting)
        System.out.println(nombresList.stream()
                .sorted(SortedAndDistinct::compare)
                .collect(Collectors.toList()));

        //Cet affichage va être fait selon l'ordre décroissant [customisé] (descending sort sorting)
        System.out.println(nombresList.stream()
                .sorted((elem1, elem2) -> elem2.compareTo(elem1))
                .collect(Collectors.toList()));

        //Cet affichage va être fait selon l'ordre décroissant [customisé] (descending sort sorting)
        System.out.println(nombresList.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList()));

        //custom descending sort sorting
        System.out.println(nombresList.stream()
                .sorted((elem1, elem2) -> -elem1.compareTo(elem2))
                .collect(Collectors.toList()));

        // DISTINCT
        List<Integer> dupSortedList = nombresList.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("dupSortedList: " + dupSortedList);

        List<Integer> distictSortedList = nombresList.stream()
                .sorted()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("distictSortedList: " + distictSortedList);
    }

    private static int compare(Integer elem1, Integer elem2) {
        return elem2.compareTo(elem1);
    }
}
