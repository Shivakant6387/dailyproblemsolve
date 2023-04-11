package org.example.problem;
class Person{
    static class Child{
       static void  print(){
           System.out.println("Hell");
       }
    }
}
public class InnerClass {
    public static void main(String[] args) {
        Person.Child obj=new Person.Child();
        obj.print();
    }
}
