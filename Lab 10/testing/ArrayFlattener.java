package org.example.testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ArrayFlattener {
//    public static void main(String[] args) {
//        Object[][] inputArray = {{1, 3}, {0}, {4, 5, 9}};
//        Object[] expectedOutput = {1, 3, 0, 4, 5, 9};
//
//        Object[] result = flattenArray(inputArray);
//
//        Arrays.stream(result).forEach(System.out::print);
//
//    }

    public static Object[] flattenArray(Object[][] array) {

        if (array == null)
            return null;
        int totalElement = 0;

        for (Object[] arr : array) {
            totalElement += arr.length;
        }
        int index = 0;
        Object[] result = new Object[totalElement];
        for (Object[] arr : array) {
            for (Object element : arr) {
                result[index++] = element;
            }
        }

        return result;

    }
}
