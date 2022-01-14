package ro.fasttrackit.curs10.ex2;

import java.util.*;

public class Bouquet {
    private Set<String> flowers;

    public Bouquet() {
       flowers = new HashSet<String>();
    }

    public Collection<String> getAll() {
        return flowers;
    }

    public boolean addFlower (String newFlower) {
        if (newFlower != null) {
            flowers.add(newFlower);
            return true;
        }
        return false; //comment
    }

    public void addAllFlowers (List<String> allFlowers) {
        if (allFlowers != null) {
            for (String element : allFlowers){
                if (element != null) {
                    flowers.add(element);
                }
            }
        }
    }

    public void removeFlower (String oldFlower) {
        flowers.remove(oldFlower);
    }

    @Override
    public String toString() {
        return "Bouquet{" +
                "flowers=" + flowers +
                '}';
    }
}
