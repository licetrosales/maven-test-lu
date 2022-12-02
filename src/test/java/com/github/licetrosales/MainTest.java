package com.github.licetrosales;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void when_1_add_1_then_return_2(){
        //GIVEN
        int a = 1;
        int b = 3;

        //WHEN
        int result = Main.sum(a, b);

        //THEN
        int expected = 2;

        assertEquals(expected, result);
    }


}