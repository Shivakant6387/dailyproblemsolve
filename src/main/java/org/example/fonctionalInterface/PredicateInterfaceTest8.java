package org.example.fonctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class User2{
    String name,role;
    User2(String a,String b){
        name=a;
        role=b;
    }
    public String getName(){
        return name;
    }
    public String getRole(){
        return role;
    }
    public String toString(){
        return "User Name :"+name+",Role"+role;
    }
}
public class PredicateInterfaceTest8 {
    public static void main(String[] args) {
        List<User> users = new ArrayList<User>();
        users.add(new User("John", "admin"));
        users.add(new User("Peter", "member"));
        List admins = users.stream()
                .filter((user) -> user.getRole().equals("admin"))
                .collect(Collectors.toList());

        System.out.println(admins);
    }
}
