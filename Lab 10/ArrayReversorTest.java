package org.example.testing;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class ArrayReversorTest {

    private ArrayReversor arrayReversor;
    private ArrayFlattenerService arrayFlattenerService;

    @Before
    public void setup(){
        arrayFlattenerService = mock(ArrayFlattenerService.class);
        arrayReversor = new ArrayReversor(arrayFlattenerService);
    }

    @Test
    public void arrayReversor(){
        Object[][] inputArray = {{1, 3}, {0}, {4, 5, 9}};
        Object[] expectedOutput = {9,5,4,0,3,1};

        when(arrayFlattenerService.flattenArray(inputArray)).thenReturn(new Object[]{1,3,0,4,5,9});
        Object [] result = arrayReversor.reverseArray(inputArray);
        Assert.assertArrayEquals(expectedOutput, result);
        verify(arrayFlattenerService,times(1)).flattenArray(inputArray);
    }
    @Test
    public void arrayReversorNull(){
        Object[][] inputArray = {};
        Object[] expectedOutput = null;

        when(arrayFlattenerService.flattenArray(inputArray)).thenReturn(null);

        Object [] result = arrayReversor.reverseArray(inputArray);
        Assert.assertArrayEquals(expectedOutput, result);
//        verify(arrayFlattenerService,times(1)).flattenArray(inputArray);

    }
}
