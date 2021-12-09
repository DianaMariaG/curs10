package ro.fasttrackit.curs10.collections;
import java.util.ArrayList;
import java.util.List;

public class TryList {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ana");
        names.add("Bogdan");
        System.out.println(names);
        names.remove("Ana");
        System.out.println(names);
        names.addAll(List.of("Marcel","Mirela","Daria", "Paul", "Raluca"));

        System.out.println(names);
        System.out.println(names.get(3));
        System.out.println(names.contains("Bogdan")); //zice daca lista contine un elm
        System.out.println(names.contains("Ana"));
        names.remove(3);
        System.out.println(names);
        System.out.println(names.size());

        for(String name : names) {
            System.out.println(name);
        }
        for(int i =0; i<names.size(); i++) {
            System.out.println(names.get(i));
        }

        names.set(3,"Monica"); //modificare elm: names[3] = "Monica"
        System.out.println(names);
        names.add(3,"Paul"); //aici Paul apare pe pozitia 3 si Monica va fi pusa pe 4
        System.out.println(names);

    }
}
