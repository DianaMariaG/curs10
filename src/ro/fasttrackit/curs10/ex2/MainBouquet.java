package ro.fasttrackit.curs10.ex2;

import java.util.Arrays;

public class MainBouquet {
    public static void main(String[] args) {
        Bouquet bouquet1 = new Bouquet();
        Bouquet bouquet2 = new Bouquet();

        bouquet1.addFlower("hyacinth");
        bouquet1.addFlower("rose");
        bouquet1.addFlower("water lily");
        bouquet1.addFlower("snowdrop");
        bouquet1.addFlower("rose");

        System.out.println(bouquet1);
        System.out.println(bouquet1.getAll());

        bouquet1.removeFlower("snowdrop");
        System.out.println(bouquet1.getAll());

        bouquet2.addAllFlowers(Arrays.asList("chrysanthemum", "goldenrod",null, "daffodil"));
        System.out.println(bouquet2.getAll());
    }
}
