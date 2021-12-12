package ro.fasttrackit.curs10.ex1;

import java.util.*;


public class Basket {
    private List<String> fruits;
    
    public Basket() {
        fruits = new ArrayList<String>();
    }


    public boolean find (String specialFruit) {
        return fruits.contains(specialFruit);
    }

    public boolean remove (String specialFruit) {
        ListIterator<String> iter = fruits.listIterator();
        int initialSize = fruits.size();
        while (iter.hasNext()) {//cat timp mai e un elm in lista
            if (iter.next().equals(specialFruit)) {
                iter.remove();
            }
        }
        return fruits.size() < initialSize;
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
        return new HashSet<>(fruits);
    }

    public boolean add (String newFruit) {
        if (newFruit != null) {
            fruits.add(newFruit);
            return true;
        }
        return false;
    }

    public void addAll (List<String> fruitsList) {
            if (fruitsList != null) {
                for (String element : fruitsList) {
                    if (element != null) {
                        fruits.add(element);
                    }
                }
            }
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
