package Practice.Calculator;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class CalculatorOpsTest {
 

  @Test
  public void addTest() {
    assertEquals(CalculatorOps.add(5, 27),32,"Failed addition");
    assertEquals(CalculatorOps.add(84, -17),67,"Failed addition");
    assertEquals(CalculatorOps.add(0, 27),27,"Failed addition");
    assertEquals(CalculatorOps.add(-5, -7),-12,"Failed addition");
  }

  @Test
  public void divideTest() {
	assertEquals(CalculatorOps.divide(5, 25),1/5,"Failed division");
    assertEquals(CalculatorOps.divide(64, -16),-4,"Failed division");
    assertEquals(CalculatorOps.divide(0, 27),0,"Failed division");
    assertEquals(CalculatorOps.divide(-25, -5),5,"Failed division");
  }

  @Test
  public void multiplyTest() {
		assertEquals(CalculatorOps.multiply(5, 25),125,"Failed multiplication");
	    assertEquals(CalculatorOps.multiply(64, -10),-640,"Failed multiplication");
	    assertEquals(CalculatorOps.multiply(0, 27),0,"Failed multiplication");
	    assertEquals(CalculatorOps.multiply(-25, -5),125,"Failed multiplication");
  }

  @Test
  public void subtractTest() {
		assertEquals(CalculatorOps.subtract(5, 25),-20,"Failed substraction");
	    assertEquals(CalculatorOps.subtract(64, -16),80,"Failed substraction");
	    assertEquals(CalculatorOps.subtract(0, 27),-27,"Failed substraction");
	    assertEquals(CalculatorOps.subtract(25, 8),17,"Failed substraction");
  }
}
