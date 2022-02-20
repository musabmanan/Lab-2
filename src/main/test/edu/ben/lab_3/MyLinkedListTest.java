package edu.ben.lab_3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class MyLinkedListTest {
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5})
    void testRemove(int size) {
        MyLinkedList objects = new MyLinkedList();
        for (int i = 1; i <= size; i++)
            objects.add(String.valueOf(i));
    }


    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5})
    void testSize(int size) {
        MyLinkedList objects = new MyLinkedList();
        for (int i = 0; i <= size; i++)
            objects.add("bird");
        Assertions.assertEquals(size, objects.size());
    }


}


