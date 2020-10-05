package com.NuclearNode.CoffeeGrinder;

import org.junit.*;

public class JUnit_test_BC {

    private Calculator_A6 calc;

    @Before
    public void setup(){
        System.out.println("Before testing...");
        calc = new Calculator_A6();
    }

    @After
    public void cleanup(){
        System.out.println("Finishing and cleaning up test");
    }

    @Test
    public void testAdd() {
        int answer = calc.add(10, 101);
        Assert.assertEquals(111, answer);
    }

    public void testAdd2(){
        int answer = calc.add(-5, 6);
        Assert.assertEquals(1, answer);
    }

    public void testAdd3(){
        int answer = calc.add(-5, 6);
        Assert.assertEquals(1, answer);
    }
}