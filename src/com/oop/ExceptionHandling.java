package com.oop;

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class ExceptionHandling {

    public static int divide(int a, int b) throws ArithmeticException {
        if(b == 0) {
            throw new ArithmeticException("Div by Zero");
        }
        return a/b;
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        try {
            int c = a/b;
            //divide(a, b);
            if(a != b) {
                throw new CustomException("Not Equal");
            }
        }
//        catch(Exception e) {
//            System.out.println(e.getMessage());
//        }
        catch(CustomException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("This will always excute");
        }
    }
}
