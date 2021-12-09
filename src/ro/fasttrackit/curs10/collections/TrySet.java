package ro.fasttrackit.curs10.collections;

import java.util.*;

public class TrySet {
    public static void main(String[] args) {
        Set<String> shopping = new LinkedHashSet<>();
        shopping.add("lapte");
        shopping.add("paine");
        shopping.add("lapte");

        System.out.println(shopping);

        for(String item : shopping) { //for-ul e doar un layer peste iterator; si for-ul deschide un iterator
            System.out.println(item);
        }

        Iterator<String> iterator = shopping.iterator(); //ne zice daca sunt elm si ne da elm urmator
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
            iterator.remove(); //iteratorul poate face remove
            //iteratorul decide el ordinea prin care parcurge toate elm-e din set
        }

        shopping.remove("lapte");
        System.out.println(shopping);

    }
}
