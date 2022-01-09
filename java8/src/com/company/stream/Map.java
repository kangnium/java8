package com.company.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class Map {
    public static void main(String[] args) {
        List<Integer> entiers = asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        /*A partir d'un liste de nombre,
         * créer et afficher une liste/collection
         * contenant le multiple par 3 de chaque nombre  */

        List<Integer> output = entiers.stream()
                .map(i -> i * 3)
                .collect(Collectors.toList());
        System.out.print(output);

        /* map
        entrée : strean
        sortie : stream
        il applique une fonction sur chaque élément de la collection
        ---il faut en suite une focnction de terminaison pour soir collecter et retourner une collection
        soit faire une action comme affichier directement le résiultat "forEach"

        /* A partir d'un liste de nombre,
         * afficher (sans créer une nouvelle liste) une liste/collection
         * contenant le multiple par 3 de chaque nombre  */



        ArrayList<Integer> nombreEntiers = new ArrayList<>();
        nombreEntiers.add(1);
        nombreEntiers.add(2);
        nombreEntiers.add(3);
        nombreEntiers.add(4);
        nombreEntiers.add(5);
        nombreEntiers.add(6);
        nombreEntiers.add(7);

        nombreEntiers.stream()
                .map(i -> i * 3)
                .forEach(System.out::println);
    }
}
