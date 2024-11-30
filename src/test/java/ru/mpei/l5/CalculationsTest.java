package ru.mpei.l5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.mpei.l2.Student;

import static org.junit.jupiter.api.Assertions.*;
class CalculationsTest {

    private long startTs;

    @Test
    void testSum1(){
        double sum = Calculations.sum(2.0, 3.5);
        Assertions.assertEquals(5.5, sum);
    }

    @Test
    void testSum2(){
        double sum = Calculations.sum(1.34, 2.48);
        Assertions.assertEquals(3.82, sum, 0.001);
    }

    @Test
    void factorialTest1(){
        long factorial = Calculations.factorial(3);
        Assertions.assertEquals(6, factorial);
    }

    @Test
    void factorialTest2(){
        long factorial = Calculations.factorial(10);
        Assertions.assertEquals(3_628_800, factorial);
    }

    @Test
    void factorialTest3(){
        long factorial = Calculations.factorial(13);
        Assertions.assertEquals(6_227_020_800L, factorial);
    }

    @Test
    void showtimeTest(){
       Student s = new Student("Ivan", "Ivanov", 20, false);
        String name = s.getName();
        Assertions.assertNotNull(name);
    }

    @Test
    public void sinTest1(){
        double sin = Calculations.sin(30);
        System.out.println(sin);
        Assertions.assertEquals(0.5, sin, 0.01);
    }

    @BeforeEach
    public void beforeEach(){
        startTs = System.currentTimeMillis();
    }

    @AfterEach
    public void afterEach(){
        long finalTs = System.currentTimeMillis();
        System.err.println("Time of calculation: "+ (finalTs - startTs));
    }

}