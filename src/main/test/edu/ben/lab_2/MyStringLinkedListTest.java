package edu.ben.lab_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class MyStringLinkedListTest {

    @ParameterizedTest
    @ValueSource( ints = {1,2,3,4,5})
    void testRemove (int size) {
        MyStringLinkedList objects  = new MyStringLinkedList();
        for (int i =1; i <= size ; i++)
            objects.add(new  String(String.valueOf(i)));
    }


    @ParameterizedTest
    @ValueSource( ints = {1,2,3,4,5})
    void testSize (int size) {
        MyStringLinkedList objects  = new MyStringLinkedList();
        for (int i =0; i <= size ; i++)
            objects.add(new  String("bird"));
        Assertions.assertEquals(size, objects.size());
    }



}
