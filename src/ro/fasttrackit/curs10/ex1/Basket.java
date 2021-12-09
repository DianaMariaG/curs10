package ro.fasttrackit.curs10.ex1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Basket {
    private List<String> fruits;
    
    public Basket() {
        fruits = new ArrayList<String>();
    }


    public boolean find (String specialFruit) {
            if (fruits.contains(specialFruit)) {
                return true;
            }
        return false;
    }

    public boolean remove (String specialFruit) {
        for (String fruit : fruits) {
            if (fruit.equals(specialFruit)) {
                fruits.remove(fruit);
                return true;
            }
        }
        return false;
    }

    public int position (String specialFruit) {
        int pos = -1;
        for (int i = 0; i < fruits.size(); i++) {
            if (fruits.get(i).equals(specialFruit)) {
                pos = i + 1;
            }
        }
        return pos;
    }

    public Collection<String> distinct() {
        Collection<String> uniqueBasket = new HashSet<>();
        uniqueBasket.addAll(fruits);
        return uniqueBasket;
    }

    public void add (String newFruit) {
        fruits.add(newFruit);
    }

    public void addAll (List<String> fruitsList) {
            fruits.addAll(fruitsList);
        }


    public int count() {
        return fruits.size();
    }

    public int customCount() {
        int count = 0;
        for (String fruit : fruits) {
            count++;
        }
        return count;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "fruits=" + fruits +
                '}';
    }
}
