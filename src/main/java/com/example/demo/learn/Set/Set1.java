package com.example.demo.learn.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set1 {
    private static void main(String args[]){
        HashSet set = new HashSet();
        set.add(1);

        LinkedHashSet set1 = new LinkedHashSet();
        set1.add(1);

        TreeSet treeSet = new TreeSet();
        treeSet.add(1);
    }
}
