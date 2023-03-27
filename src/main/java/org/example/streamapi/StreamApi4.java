package org.example.streamapi;

import java.util.ArrayList;
import java.util.List;

public class StreamApi4 {
    public static void main(String[] args) {
        List<Product>productList=new ArrayList<>();
        productList.add(new Product(1,"HP Laptop",25000f));
        productList.add(new Product(2,"Dell Laptop",30000f));
        productList.add(new Product(3,"Lenevo Laptop",28000f));
        productList.add(new Product(4,"Sony Laptop",28000f));
        productList.add(new Product(5,"Apple Laptop",90000f));
        Float totalPrice=productList.stream().map(product->product.price)
                .reduce(0.0f,(sum, price)->sum+price);
        System.out.println(totalPrice);
        float totalPrice2 = productList.stream()
                .map(product->product.price)
                .reduce(0.0f,Float::sum);   // accumulating price, by referring method of Float class
        System.out.println(totalPrice2);
    }
}
