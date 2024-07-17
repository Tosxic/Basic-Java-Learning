package com.tosxic.log4j;

import org.apache.log4j.Logger;

public class Log4jTest {

    private static final Logger LOG = Logger.getLogger(Log4jTest.class);

    public static void main(String[] args) {
        try {
            int x = 1;
            int y = 0;
            System.out.println(x / y);
        } catch (ArithmeticException e) {
            LOG.error("y == 0");
        } finally {
            LOG.info("finally");
        }

    }
}
