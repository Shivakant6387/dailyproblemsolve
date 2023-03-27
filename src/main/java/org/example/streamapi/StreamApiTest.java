package org.example.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
    int id;
    String name;
    float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
public class StreamApiTest {
    public static void main(String[] args) {
        List<Product>productList=new ArrayList<>();
        productList.add(new Product(1,"HP Laptop",25000f));
        productList.add(new Product(2,"Dell Laptop",25000f));
        productList.add(new Product(3,"Lenevo Laptop",125000f));
        productList.add(new Product(4,"Sony Laptop",90000f));
        productList.add(new Product(5,"Apple Laptop",95000f));
        List<Float>product=productList.stream().filter(p->p.price>30000).map(p->p.price).collect(Collectors.toList());
        System.out.println(product);

    }
}
