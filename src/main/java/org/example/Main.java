package org.example;
import org.example.io.ArrayReader;
import org.example.io.IO;
import org.example.processor.ProcessArray;
import org.example.processor.Processor;
public class Main {
    public static void main(String[] args) {
        ArrayReader reader = new IO();
        ProcessArray processor = new Processor();
        int[] array = reader.readTwoDimensionalArray("lab51.txt");
        int max = processor.calculate(array);
        System.out.println("Max = " + max);
    }
}