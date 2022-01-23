package com.technologies.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstAndFindAny {

    public static void main(String[] args) throws RuntimeException {

        /*
        Returns an Optional describing the first element of this stream, or an empty Optional if the stream is empty.
        If the stream has no encounter order, then any element may be returned. This is a short-circuiting terminal operation.
        Returns:
            an Optional describing the first element of this stream, or an empty Optional if the stream is empty
         */

        /*         Trouver le premier element de la liste commençant par la lettre "Y"          */
        List<String> flats = Arrays.asList("B01", "B08", "B11", "T01", "B01", "B05", "B01", "B05", "T07");
        Optional<String> result = flats.stream()
                .filter(flat -> flat.startsWith("T"))
                .findFirst();

        /*if(result.isPresent()){
            System.out.println(result.get());
        }else {
            System.out.println("no result found");
        }*/

        //result.ifPresent(data->System.out.println(data));
        result.ifPresent(System.out::println);
        System.out.println(result.orElse("no data found in orElse"));

        /*
        Returns an Optional describing some element of the stream, or an empty Optional if the stream is empty.
        This is a short-circuiting terminal operation.
        The behavior of this operation is explicitly nondeterministic; it is free to select any element in the stream
        */
        Optional<String> result2 = flats.stream()
                .filter(flat -> flat.startsWith("B"))
                .findAny();
        result2.ifPresent(System.out::println);
    }
}
