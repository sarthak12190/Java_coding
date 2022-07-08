package com.company;

import java.util.ArrayList;

public class Array_list {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(1);
        list.add(67);
        list.add(53);
        list.add(45);
        System.out.println(list);
        list.set(0,77);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
    }
}
