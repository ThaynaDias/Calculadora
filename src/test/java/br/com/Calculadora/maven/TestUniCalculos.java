package br.com.Calculadora.maven;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestUniCalculos {

    @Test
    public void sumTest() {
        Operations op = new Operations();
        op.setNumber1(9);
        op.setNumber2(8);
        double sum = op.add();

        assertEquals(17, sum, "The sum of the numbers is 17");
    }

    @Test
    public void subtractTest() {
        Operations op = new Operations();
        op.setNumber1(9);
        op.setNumber2(8);
        double result = op.subtract();

        assertEquals(1, result, "The calculation of the numbers is 1");
    }

    @Test
    public void multiplyTest() {
        Operations op = new Operations();
        op.setNumber1(10);
        op.setNumber2(2);
        double result = op.multiply();

        assertEquals(20, result, "The calculation of the numbers is 20");
    }

    @Test
    public void divideTest() {
        Operations op = new Operations();
        op.setNumber1(10);
        op.setNumber2(2);
        double result = op.divide();

        assertEquals(5, result, "The division of the numbers is 5");
    }
}
