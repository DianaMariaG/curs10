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

    public void addFlower (String newFlower) {
        flowers.add(newFlower);
    }

    public void addAllFlowers (List<String> allFlowers) {
        if (allFlowers.size() > 0) {
            flowers.addAll(allFlowers);
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
