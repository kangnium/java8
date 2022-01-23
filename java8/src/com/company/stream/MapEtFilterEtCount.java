package com.company.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapEtFilterEtCount {

    public static void main(String[] args){

        // A partir de la liste des fruits suivants
        // count() : nombre d'elements résultats

        List<String> fruits = Arrays.asList("Mangue","Ananas","Banane","Kiwi","Papaye","Raisin");

        // Afficher la longeur de chaque fruit (print length of every fruit)
        System.out.println(fruits.stream()
                .map(f -> f.length())  // ou .map(String::length)
                .collect(Collectors.toList()));

        // Trouver uniquement les fruits dont la longueur est > 5
        System.out.println(fruits.stream()
                .filter(f -> f.length() > 5) // ou MapEtFilterEtCount::test
                .collect(Collectors.toList()));

        // Trouver et afficher les fruits dont la longueur est > 5
        System.out.println(fruits.stream()
                .filter(f -> f.length() > 5)
                .map(f->f.length())   // ou .map(String::length)
                .collect(Collectors.toList()));

        // Combien de fruits existent et qui ont une longueur > 5
        System.out.println(fruits.stream()
                .filter(f->f.length()>5)
                .count());
    }

    private static boolean test(String f) {
        return f.length() > 5;
    }
}
