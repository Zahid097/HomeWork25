package com.company;

import java.util.HashSet;

public class Main {

    private static HashSet<Integer> set1;
    private static HashSet<Integer> set2;

    public static void main(String[] args) {

        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(0);
        set2.add(1);
        set2.add(2);

        symmetricDifference(set1, set2);
    }

    public static void symmetricDifference(HashSet<Integer> set1, HashSet<Integer> set2) {
        HashSet<Integer> newSet = new HashSet<Integer>(set1);
        newSet.removeAll(set2);
        set2.removeAll(set1);
        newSet.addAll(set2);
        System.out.println(newSet);
    }
}
