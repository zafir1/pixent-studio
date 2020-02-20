package com.pixelstudio.crudapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearch {

    @Autowired
    private SortingAlgorithm sortingAlgorithm;

    public BinarySearch(SortingAlgorithm sortingAlgorithm) {
        this.sortingAlgorithm = sortingAlgorithm;
    }

    public int SearchNumber(int[] numbers,int target){
        System.out.println(this.sortingAlgorithm);
        numbers = this.sortingAlgorithm.sort(numbers);

        // logic for binary search over sorted numbers.

        int res = 5;
        return res;
    }
}
