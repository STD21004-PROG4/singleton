package com.singleton.singleton;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ClassSingletonTests {
    @Test
    void test(){
    ClassSingleton classSingleton1 = ClassSingleton.getInstance();
    ClassSingleton classSingleton2 = ClassSingleton.getInstance();
    classSingleton2.setDescription("hello world");
    assertEquals("hello world",classSingleton1.getDescription());
    assertEquals("hello world",classSingleton2.getDescription());

    assertEquals(classSingleton1.getDescription(),classSingleton2.getDescription());

    }
    
}
