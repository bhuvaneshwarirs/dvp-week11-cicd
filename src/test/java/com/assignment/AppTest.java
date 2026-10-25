package com.assignment;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testApplicationMessage() {
        String message = "Hello World!";
        assertEquals("Hello World!", message);
    }
}
