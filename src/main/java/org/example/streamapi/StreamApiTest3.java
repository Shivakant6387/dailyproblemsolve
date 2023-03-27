package org.example.streamapi;

import java.util.ArrayList;
import java.util.List;

public class StreamApiTest3 {
    public static void main(String[] args) {
        List<Product>productList=new ArrayList<>();
        productList.add(new Product(1,"HP laptop",300000f));
        productList.add(new Product(2,"Dell laptop",400000f));
        productList.add(new Product(3,"Lenevo laptop",500000f));
        productList.add(new Product(4,"Sony laptop",3100000f));
        productList.add(new Product(5,"Apple laptop",3200000f));
        productList.stream().filter(product -> product.price==300000).forEach(product -> System.out.println(product.name));
    }
}
