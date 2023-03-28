package org.example.io;
import java.io.*;
public class IO implements ArrayReader {
    @Override
    public int[] readTwoDimensionalArray(String fileName) {
        try (BufferedReader in = new BufferedReader(new
                FileReader(fileName))) {
            in.readLine();
            String[] line = in.readLine().trim().split(" +");
            int[] array = new int[line.length];
            for (int j = 0; j < line.length; j++) {
                array[j] = Integer.parseInt(line[j]);
            }
            return array;
        } catch (IOException e) {
            return new int[0];
        }
    }
}