package com.liam191.videoshare.stompserver;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class TestVideoActionMessage {

    @Test
    void testGetName(){
        //TODO: replace null return value with something more appropriate
        HelloMessage helloMessage = new HelloMessage();
        assertEquals(helloMessage.getName(),null);
    }
}
