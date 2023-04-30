package org.example.problem;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveZeroANdCountLength {
    public static void main(String[] args) {
        Integer[] numbers = {0,7,6,5,3,0,7,9,0};
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(numbers));
        list.removeAll(Arrays.asList(Integer.valueOf(0)));
        System.out.println(list);
        System.out.println(list.size());

    }
}
