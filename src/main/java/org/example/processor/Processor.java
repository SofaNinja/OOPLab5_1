package org.example.processor;

public class Processor implements ProcessArray {
    public int calculate(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i += 2) {
                if(array[i] > max) max = array[i];
        }
        return max;
    }
}