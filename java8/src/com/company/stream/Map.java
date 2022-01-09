package com.company.stream;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;
import static jdk.nashorn.internal.objects.NativeArray.map;

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

         */
        entiers.stream()
                .map(i -> i * 3)
                .forEach(System.out::println);
    }
}
