package com.singleton.singleton;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
@SpringBootTest
public class ClassUniqueInstanceTests {
    @Test
    void test (){
        ClassUniqueInstance enumSingleton1 = ClassUniqueInstance.INSTANCE.getInstance();
        ClassUniqueInstance enumSingleton2 = ClassUniqueInstance.INSTANCE.getInstance();
        enumSingleton2.setClick(1);

        assertEquals(1, enumSingleton1.getClick());
        assertEquals(1, enumSingleton2.getClick());
        assertEquals(enumSingleton1.getClick(), enumSingleton2.getClick());

    }
}
