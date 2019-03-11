package com.step.assignment.QuickSort;

public class QuickSort {
    private int[] numbers;

    public QuickSort(int[] numbers) {
        this.numbers = numbers;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public int partition(int low, int high){
        int pivot = this.numbers[high];
        int i = low -1;
        for(int j = low; j<= high-1; j++){
            if(this.numbers[j] <= pivot){
                i++;
                int temp = this.numbers[i];
                this.numbers[i] = this.numbers[j];
                this.numbers[j] = temp;
            }
        }
        i++;
        int temp = this.numbers[i];
        this.numbers[i] = this.numbers[high];
        this.numbers[high] = temp;
        return i;

    }

    public void sort(int low,int high){
        if(low<high){
            int pi = partition(low,high);
            sort(low,pi-1);
            sort(pi+1,high);
        }
    }
}
