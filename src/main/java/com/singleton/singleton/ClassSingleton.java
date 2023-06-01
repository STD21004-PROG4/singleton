package com.singleton.singleton;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ClassSingleton {
    private static ClassSingleton INSTANCE;
    private String description = "Initial description class";

    private ClassSingleton() {
    }

    public static ClassSingleton getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new ClassSingleton();
        }

        return INSTANCE;
    }

}
