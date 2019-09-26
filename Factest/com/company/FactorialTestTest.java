package com.company;

import junit.framework.Assert;
import junit.framework.TestCase;


public class FactorialTestTest extends TestCase {
    public void TestFactorial () {
        FactorialTest resultat;

        //tester for 0
        //input 0
        //forventet output 0

        resultat = new FactorialTest(0);
        Assert.assertEquals(0, resultat);

        //tester for kommatal
        //input 3.5
        //forventet output 17.5
        resultat = new FactorialTest(3.5);
        Assert.assertEquals(17.5, resultat);

        //tester for negative tal
        //input -3
        //forventet output

        resultat = new FactorialTest(-3);
        Assert.assertEquals(-15, resultat);








    }



}