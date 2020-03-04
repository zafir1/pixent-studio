package com.zafir.crudapp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSort implements SortingAlgorithm{
    public QuickSort() {
        System.out.println("Quick Sort class..");
    }

    @Override
    public int[] sort(int[] numbers) {
        return numbers;
    }
}
