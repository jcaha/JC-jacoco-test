package com.test.jacoco.test;

import static org.junit.Assert.assertEquals;

/**
 * Created by superZh on 2019/10/1.
 */

import org.junit.Test;
import com.test.jacoco.HelloWorld;

public class HelloWorldTest {
    @Test
    public void testMethod1() {
        HelloWorld hw = new HelloWorld();
        String a = hw.Method1();
        assertEquals("Hello World", a);
    }

    @Test
    public void testMethod2() {
        HelloWorld hw = new HelloWorld();
        int a = hw.Method2(2, 1);
        assertEquals(3, a);
    }
    
    @Test
    public void testMethod3() {
    	/**
    	 * TODO：finish the test function
    	 */
    	HelloWorld hw = new HelloWorld();
    	int a1 = hw.Method3(6, -1, 1);
        int a2 = hw.Method3(6, 1, 1);

        int b = hw.Method3(4,0,-1);
        int d = hw.Method3(5,0,-1);
        int c = hw.Method3(4,0,-3);

    }
    /**
     * TODO: add the test function of other methods in HelloWorld.java
     */
    @Test
    public void testMethod4() {
    	/**
    	 * TODO：finish the test function
    	 */
    	HelloWorld hw = new HelloWorld();
    	int a = hw.Method4(0, 0, 0, 0, 0);
        int b1 = hw.Method4(1,1,0,1,0);
        // int b2 = hw.Method4(5,0,1,2,1);
        int b3 = hw.Method4(5,0,1,1,0);
    }

    @Test
    public void testbug() {
        HelloWorld hw = new HelloWorld();
        boolean a = hw.bug(5);
        boolean b = hw.bug(1);
    }

    @Test
    public void testisTriangle() {
        HelloWorld hw = new HelloWorld();
        boolean a1 = hw.isTriangle(-1, 0, 0);
        boolean a2 = hw.isTriangle(1, 0, 0);
        boolean a3 = hw.isTriangle(1, 1, 0);
        boolean b = hw.isTriangle(1,1,3);
        boolean c = hw.isTriangle(1,3,1);
        boolean d = hw.isTriangle(3,1,1);
        boolean e = hw.isTriangle(1,1,1);
    }

    @Test
    public void testisBirthday() {
        HelloWorld hw = new HelloWorld();
        boolean a1 = hw.isBirthday(0,0,0);
        boolean a2 = hw.isBirthday(2020,0,0);
        boolean a3 = hw.isBirthday(2019,0,0);
        boolean a4 = hw.isBirthday(2019,13,0);
        boolean a5 = hw.isBirthday(2019,12,0);
        boolean a6 = hw.isBirthday(2019,12,32);

        boolean b1 = hw.isBirthday(2019,12,1);
        boolean b2 = hw.isBirthday(2019,8,1);
        boolean b3 = hw.isBirthday(2018,8,1);
    
        boolean c1 = hw.isBirthday(2019,10,1);
        boolean c2 = hw.isBirthday(2019,9,1);

        boolean d1 = hw.isBirthday(2019,10,2);

        boolean e1 = hw.isBirthday(2018,1,1);
        boolean e2 = hw.isBirthday(2018,3,1);
        boolean e3 = hw.isBirthday(2018,5,1);
        boolean e4 = hw.isBirthday(2018,7,1);
        // boolean e5 = hw.isBirthday(2018,8,1);
        boolean e6 = hw.isBirthday(2018,10,1);
        boolean e7 = hw.isBirthday(2018,12,1);

        boolean f1 = hw.isBirthday(2018,2,1);
        boolean f2 = hw.isBirthday(2018,2,29);
        boolean f3 = hw.isBirthday(2016,2,29);
        boolean f4 = hw.isBirthday(2018,2,30);

        boolean g1 = hw.isBirthday(2018,4,1);
        boolean g2 = hw.isBirthday(2018,4,31);
    }

    @Test
    public void testminiCalculator() {
        HelloWorld hw = new HelloWorld();
        Double a = hw.miniCalculator(1,1,'+');
        Double b = hw.miniCalculator(1,1,'-');
        Double c = hw.miniCalculator(1,1,'*');
        Double d1 = hw.miniCalculator(1,1,'/');
        Double d2 = hw.miniCalculator(1,-1,'/');
        Double d3 = hw.miniCalculator(1,0,'/');
        Double f = hw.miniCalculator(1,1,'c');
    }
}
