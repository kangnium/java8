package com.technologies.interfaceenhancement.defaultmethod;

public interface VehicleJava8 {
    // Avec Java 8, je peux créer des méthodes avec corps dans l'interface.
    // Il faut juste les déclarer avec le mot clé "default"
    // meme si j'ajoute de nouvelle méthodes, les classe qui implementent l'interface n'auront pas besoin
    default void details(){// by default gets availabel to all implementing classes
        System.out.println("I am Java 8 default method");
    }
    default void mileage(){

    }
}
