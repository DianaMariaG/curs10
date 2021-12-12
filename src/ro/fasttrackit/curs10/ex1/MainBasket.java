package ro.fasttrackit.curs10.ex1;

import java.util.Arrays;
import java.util.List;

public class MainBasket {
    public static void main(String[] args) {
        Basket basket1 = new Basket();
        Basket basket2 = new Basket();

        basket1.add("apple");
        basket1.add("peach");
        basket1.add("plum");
        basket1.add("peach");
        basket1.add("melon");
        basket1.add("fig");

//        System.out.println(basket1.find("lime"));
//        System.out.println(basket1);
//
//        System.out.println(basket1.count());
        System.out.println(basket1.remove("plum"));
        System.out.println(basket1);

        System.out.println(basket1.distinct());
        System.out.println(basket1.position("fig"));
        System.out.println(basket1.customCount());

        basket2.addAll(Arrays.asList("pineapple",null,"cherries","dates","raisins","dragon fruit","tangerines","passion fruit"));
        System.out.println(basket2);
        System.out.println(basket2.position("dates"));
    }
}
