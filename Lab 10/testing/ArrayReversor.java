package org.example.testing;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayReversor {

    public ArrayFlattenerService arrayFlattenerService;
    public ArrayReversor(ArrayFlattenerService arrayFlattenerService){
        this.arrayFlattenerService = arrayFlattenerService;
    }

    public Object [] reverseArray(Object [][] array){
        if(array.length == 0)
            return null;
        Object[] flattenArray = arrayFlattenerService.flattenArray(array);
        List<Object> list = Arrays.asList(flattenArray);
        Collections.reverse(list);
        return list.toArray(flattenArray);
    }
}

