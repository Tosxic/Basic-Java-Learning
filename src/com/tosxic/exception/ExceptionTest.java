package com.tosxic.exception;

public class ExceptionTest {

    public static void pop() throws NegativeArraySizeException{
        int[] arr = new int[-3];
    }

    public static int div(int x, int y) throws MyException, ArithmeticException{
        if(y < 0) {
            throw new MyException("y < 0");
        }
        return x / y;
    }

    public static void main(String[] args) {
//        try {
//            pop();
//        } catch (NegativeArraySizeException e) {
//            System.out.println("pop() throws a exception");
//        } finally {
//            System.out.println("--finally--");
//        }

        try {
            div(4, -4);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("y == 0");
        } catch (Exception e) {
            System.out.println("other exception");
        } finally {
            System.out.println("--finally--");
        }
    }
}
