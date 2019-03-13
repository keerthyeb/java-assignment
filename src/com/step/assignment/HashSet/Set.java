package com.step.assignment.HashSet;

import java.util.HashSet;

public class Set {
    private HashSet<Integer> set;

    public Set() {
        this.set = new HashSet<>();
    }

    public void addNumbers(Integer number) {
        set.add(number);
    }

    public HashSet<Integer> union(HashSet<Integer> set2) {
        HashSet<Integer> unionedSet = new HashSet<>();
        unionedSet.addAll(set);
        unionedSet.addAll(set2);
        return unionedSet;
    }

    public HashSet<Integer> interSection(HashSet<Integer> set2) {
        HashSet<Integer> intersectionedSet = new HashSet<>();
        intersectionedSet.addAll(set);
        intersectionedSet.retainAll(set2);
//        Iterator<Integer> i = set2.iterator();
//        while(i.hasNext()) {
//            Integer value = i.next();
//            if(set.contains(value)){
//                intersectionedSet.add(value);
//            }
//        }
        return intersectionedSet;
    }

    public HashSet<Integer> difference(HashSet<Integer> set2){
        HashSet<Integer> differenceSet = new HashSet<>();
        differenceSet.addAll(set);
        differenceSet.removeAll(set2);
        return differenceSet;

    }


    public HashSet<Integer> getSet() {
        return set;
    }
}
