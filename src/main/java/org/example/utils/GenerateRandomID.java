package org.example.utils;

import java.util.UUID;

public class GenerateRandomID {
    public static String  generateRandomID() {
        return UUID.randomUUID().toString();
    }
}
