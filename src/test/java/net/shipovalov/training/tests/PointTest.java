package net.shipovalov.training.tests;

import net.shipovalov.training.MyFirstProgram;
import net.shipovalov.training.Point;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class PointTest {
    public void testPointDistancePositive(){
        Point p1 = new Point(2,3);
        Point p2 = new Point(4,5);
        Assert.assertEquals(2.8284271247461903, p1.distance(p2));
    }
    public void testPointDistanceGreatThenZero(){
        Point p1 = new Point(2,3);
        Point p2 = new Point(4,5);
        Assert.assertTrue(0 <= p1.distance(p2));
    }
    public void testPointDistanceNegative(){
        Point p1 = new Point(2,3);
        Point p2 = new Point(4,5);
        Assert.assertTrue(3 > p1.distance(p2));
    }
    public void testPointSelfDistance(){
        Point p1 = new Point(2,3);
        Assert.assertTrue(0.0 == p1.distance(p1));
    }
    public void testPointsDistance(){
        Point p1 = new Point(2,3);
        Point p2 = new Point(4,5);
        Assert.assertEquals(2.8284271247461903, MyFirstProgram.distance(p1,p2));
    }
}
