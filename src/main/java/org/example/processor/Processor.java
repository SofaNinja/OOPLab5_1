package org.example.processor;
public class Processor implements ProcessArray{
    @Override
    public int calculate(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] % 2 != 0){
                if(array[i] > max) max = array[i];
            }
        }
        return max;
    }
}