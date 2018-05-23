/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasem02;

import org.junit.Test;
//import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author s4_sausse_j
 */
public class JavaSem02Test {
    JavaSem02TeacherTest teacher = new JavaSem02TeacherTest();
    public JavaSem02Test() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @Test
    public void testMain() {
        teacher.testMain();
    }

    @Test
    public void testPositionCalc() {
        teacher.testPositionCalc();
    }

    @Test
    public void testfactorialForLoop() {
        teacher.testFactorialForLoop();
    }

    @Test
    public void testFactorialRecursive() {
        teacher.testFactorialRecursive();
    }

    @Test
    public void testGenerateArray() {
        teacher.testGenerateArray();
    }

    @Test
    public void testGetMean() {
        teacher.testGetMean();
    }

    @Test
    public void testGetMin() {
        teacher.testGetMin();
    }

    @Test
    public void testGetMax() {
        teacher.testGetMax();
    }

    @Test
    public void testArraySort() {
        teacher.testArraySort();
    }

    @Test
    public void testGenerateMatrix() {
        teacher.testGenerateMatrix();
    }

    @Test
    public void testGetProduct() {
        teacher.testGetProduct();
    }

    @Test
    public void testCoinFlip() {
        teacher.testCoinFlip();
    }

    @Test
    public void testRollDice() {
        teacher.testRollDice();
    }

    @Test
    public void testRoll2Dices() {
        teacher.testRoll2Dices();
    }

    @Test
    public void testGetTextFromBytes() {
        teacher.testGetTextFromBytes();
    }

    @Test
    public void testPascalsTriangle() {
        teacher.testPascalsTriangle();
    }

    /*@Test
    public void testExecuteStringEquation() {
        teacher.testExecuteStringEquation();
    }*/

    /**
     * Test of factorialForLoop method, of class JavaSem02.
     */
    @Test
    public void testFactorialForLoop() {
        teacher.testFactorialForLoop();
    }
    
}
