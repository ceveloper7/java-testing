package com.ceva.testing.ch01;

public class CalculatorTest {
    private static int NB_ERRORS = 0;

    private void testAdd(){
        Calculator calc = new Calculator();
        double sum = calc.add(10,50);
        sum = 50;

        if(sum != 60){
            throw new IllegalStateException("Bad result " + sum);
        }
    }

    public static void main(String[] args) {
        CalculatorTest calc = new CalculatorTest();
        try {
            calc.testAdd();
        }
        catch (IllegalStateException e){
            NB_ERRORS++;
            e.printStackTrace();
        }

        if (calc.NB_ERRORS > 0) {
            throw new IllegalStateException("There were " + calc.NB_ERRORS  + " error(s)");
        }
    }
}
