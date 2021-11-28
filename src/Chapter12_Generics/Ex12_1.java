package Chapter12_Generics;

import java.util.*;

class Product {}
class Tv extends Product {}
class Audio extends Product {}

public class Ex12_1 {
    public static void main(String[] args) {
        ArrayList<Product> productList = new ArrayList<Product>();
        ArrayList<Tv> tvList = new ArrayList<Tv>();

        productList.add(new Tv());
        productList.add(new Audio());

        printAll(productList);

        tvList.add(new Tv());
        tvList.add(new Tv());
        System.out.println(tvList);

    }

    public static void printAll(ArrayList<Product> list) {
        for (Product p: list)
            System.out.println(p);
    }
}
