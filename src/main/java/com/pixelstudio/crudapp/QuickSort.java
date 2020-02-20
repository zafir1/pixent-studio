package com.pixelstudio.crudapp;

import org.springframework.stereotype.Component;

@Component
public class QuickSort implements SortingAlgorithm{
    public QuickSort() {
        System.out.println("Quick Sort class..");
    }

    @Override
    public int[] sort(int[] numbers) {
        return numbers;
    }
}
