package org.example.ci;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Calculator {

    final Logger logger = LoggerFactory.getLogger(Calculator.class);

    public int add(int a, int b) {
        int c = a + b;
        logger.info("Logger:{}", a + b);
        System.out.printf("print: %d + %d = %d \n", a, b, a + b);
        return a + b;
    }
}
