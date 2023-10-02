package org.example.testing;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ArrayFlattenerTest {

    @Test
    public void testFlattenArray(){
        Object[][] inputArray = {{1, 3}, {0}, {4, 5, 9}};
        Object[] expectedOutput = {1, 3, 0, 4, 5, 9};

        Object [] result = ArrayFlattener.flattenArray(inputArray);
        assertArrayEquals(expectedOutput,result);
    }

    @Test
    public void testNullArray(){
        Object[][] inputArray = null;

        Object [] result = ArrayFlattener.flattenArray(inputArray);

        assertArrayEquals(null,result);
    }

}
