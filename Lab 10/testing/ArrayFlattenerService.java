package org.example.testing;

    public class ArrayFlattenerService{
       public  Object[] flattenArray(Object[][] array) {

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
