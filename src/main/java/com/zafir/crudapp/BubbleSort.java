package com.zafir.crudapp;

import org.springframework.stereotype.Component;

@Component
public class BubbleSort implements SortingAlgorithm{

    public BubbleSort(){
        System.out.println("Bubble sort class..");
    }

    @Override
    public int[] sort(int[] numbers) {
        return numbers;
    }
}
