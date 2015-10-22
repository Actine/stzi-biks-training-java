package com.uzhnu.training.lab3;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

/**
 * Code for lecture ${LECTURE_NUMBER}
 *
 * @author Paul Danyliuk
 * @date 10:17 @ 22.10.2015.
 */
public class QuadraticEquationTest {

//    double[] result1 = solveQuadraticEquation(1, 5, 4);
//    System.out.println(Arrays.toString(result1));
//
//    double[] result2 = solveQuadraticEquation(2, 0, -8);
//    System.out.println(Arrays.toString(result2));
//
//    double[] result3 = solveQuadraticEquation(1, -2, 1);
//    System.out.println(Arrays.toString(result3));
//
//    double[] result4 = solveQuadraticEquation(1, 0, 1);
//    System.out.println(Arrays.toString(result4));

//    [-4.0, -1.0]
//    [-2.0, 2.0]
//    [1.0]
//    []

    @Test
    public void testQuadraticEquationSolvedCorrectly() {
        double[] result;

        result = MyMath.solve(1, 5, 4);
        Assert.assertEquals(result.length, 2);
        Assert.assertEquals(result[0], -4.0);
        Assert.assertEquals(result[1], -1.0);

        result = MyMath.solve(2, 0, -8);
        Assert.assertEquals(result.length, 2);
        Assert.assertEquals(result[0], -2.0);
        Assert.assertEquals(result[1], 2.0);
    }

    @Test
    public void testQuadraticEquationWithSingleRoot() {
        double[] result;

        result = MyMath.solve(1, -2, 1);
        Assert.assertEquals(result.length, 1);
        Assert.assertEquals(result[0], 1.0);
    }

    @Test
    public void testQuadraticEquationWithNoRoots() {
        double[] result;

        result = MyMath.solve(1, 0, 1);
        Assert.assertEquals(result.length, 0);

        result = MyMath.solve(2, 0, 2);
        Assert.assertEquals(result.length, 0);
    }

}
