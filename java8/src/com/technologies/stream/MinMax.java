package com.technologies.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {

    public static  void main(String[] args){

        // Trouver le min et le max des éléments d'une liste
        // min et max retournent un Optional

        List<Integer> nombreList = Arrays.asList(55,22,1,48,101,77);

        // Natural Order
        Integer minValeur = nombreList.stream().min(Comparator.naturalOrder()).get();
        Integer maxValeur = nombreList.stream().max(Comparator.naturalOrder()).get();
        System.out.println("Min Value: "+minValeur+" , "+"Max Value: "+maxValeur);

        // directement
        minValeur = nombreList.stream().min((a,b)->{ return a.compareTo(b); }).get();
        maxValeur = nombreList.stream().max((a,b)->{ return a.compareTo(b); }).get();
        System.out.println("Min Value: "+minValeur+" , "+"Max Value: "+maxValeur);

        // avec methode de référence
        minValeur = nombreList.stream().min(Integer::compareTo).get();
        maxValeur = nombreList.stream().max(Integer::compareTo).get();
        System.out.println("Min Value: "+minValeur+" , "+"Max Value: "+maxValeur);

        // avec une méthode customisé
        minValeur = nombreList.stream().min(MinMax::sortElements).get();
        maxValeur = nombreList.stream().max(MinMax::sortElements).get();
        System.out.println("Min Value: "+minValeur+" , "+"Max Value: "+maxValeur);
    }

    public static Integer sortElements(Integer a, Integer b){
        return a.compareTo(b);
    }
}
