package ro.fasttrackit.temacurs10.homework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> f = new ArrayList<>();
        Basket fruits = new Basket("");
        f.add("pear");
        f.add("apple");
        f.add("banana");
        f.add("orange");
        System.out.println(f);
        boolean find = f.contains("apple");
        System.out.println(f.contains("apple"));
        boolean removeAnFruit = f.remove("apple");
        System.out.println(f.remove("apple"));
        //System.out.println(f.equals(new Basket()));
        System.out.println(fruits.toString());
        System.out.println(fruits.getClass());


    }
}


class Basket{
    private String fruits;

    public Basket(String fruits) {
         this.fruits = fruits;
    }

    public boolean contains(Object f) {
        if (f == this) {
            return true;
        }
        if (!f.getClass().equals(this.getClass())) {
            return false;
        }
        Basket otherBasket = (Basket) f;
        return otherBasket.fruits.equals(fruits);

    }
}



