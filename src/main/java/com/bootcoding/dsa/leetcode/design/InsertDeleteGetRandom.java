package com.bootcoding.dsa.leetcode.design;

import java.util.*;
public class InsertDeleteGetRandom {

    private Map<Integer, Integer> map;
    private List<Integer> listOfNumbers;
    private Random rn;

    public RandomizedSet() {
        this.map = new HashMap<Integer, Integer>();
        this.listOfNumbers = new ArrayList<Integer>();
        this.rn = new Random();
    }

    public boolean insert(int val) {
        if (!map.containsKey(val)) {
            listOfNumbers.add(val);
            map.put(val, listOfNumbers.size() - 1);
            return true;
        }
        return false;
    }

    public boolean remove(int val) {
        if (map.containsKey(val)) {
            int index = map.remove(val);
            int lastVal = listOfNumbers.remove(listOfNumbers.size() - 1);
            if (lastVal != val) {
                listOfNumbers.set(index, lastVal);
                map.put(lastVal, index);
            }
            return true;
        }
        return false;
    }

    public int getRandom() {
        int random = rn.nextInt(listOfNumbers.size());
        return listOfNumbers.get(random);
    }
}
