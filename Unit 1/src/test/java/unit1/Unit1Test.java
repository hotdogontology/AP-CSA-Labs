package unit1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Unit1Test {

 // Test for addIntegers method
 @Test
 void testAddIntegers() {
     assertEquals(5, Unit1.addIntegers(2, 3));
     assertEquals(0, Unit1.addIntegers(0, 0));
     assertEquals(-5, Unit1.addIntegers(-2, -3));
     assertEquals(1, Unit1.addIntegers(-2, 3));
 }

 // Test for castDoubleToInt method
 @Test
 void testCastDoubleToInt() {
     assertEquals(3, Unit1.castDoubleToInt(3.99));
     assertEquals(0, Unit1.castDoubleToInt(0.49));
     assertEquals(-3, Unit1.castDoubleToInt(-3.99));
     assertEquals(4, Unit1.castDoubleToInt(4.0));
 }

 // Test for isTrue method
 @Test
 void testIsTrue() {
     assertTrue(Unit1.isTrue(true));
     assertFalse(Unit1.isTrue(false));
 }

 // Test for maxValueMinusOne method
 @Test
 void testMaxValueMinusOne() {
     assertEquals(Integer.MAX_VALUE - 1, Unit1.maxValueMinusOne());
 }

 // Test for multiplyIntAndDouble method
 @Test
 void testMultiplyIntAndDouble() {
     assertEquals(6.0, Unit1.multiplyIntAndDouble(2, 3.0), 0.001);
     assertEquals(-6.0, Unit1.multiplyIntAndDouble(-2, 3.0), 0.001);
     assertEquals(0.0, Unit1.multiplyIntAndDouble(0, 3.0), 0.001);
     assertEquals(7.5, Unit1.multiplyIntAndDouble(3, 2.5), 0.001);
 }
}
