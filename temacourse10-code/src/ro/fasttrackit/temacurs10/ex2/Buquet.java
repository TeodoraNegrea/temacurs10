package ro.fasttrackit.temacurs10.ex2;


import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Buquet {
    public static void main(String[] args) {
        Set<String> flowers = new LinkedHashSet<>();
        flowers.add("rose");
        flowers.add("tulip");
        flowers.add("sunflower");
        flowers.add("white lily");

        System.out.println(flowers);
        for (String item : flowers) {
            System.out.println(item);
        }

        flowers.add("water lily");
        Iterator<String> iterator = flowers.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);

        }
        flowers.remove("sunflower");
        System.out.println(flowers);
    }
}
