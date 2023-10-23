import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed1() {
    int[] input1 = {3,4,5};
    assertArrayEquals(new int[]{5,4,3}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversedInPlace() {
    int[] input1 = {3,4,5};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{5,4,3}, input1);
  }

  @Test
  public void testaverageWithoutLowest() {
    double[] input1 = {3.0};
    
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(input1),0.000001);
  }

  @Test
  public void testaverageWithoutLowest1() {
    double[] input1 = {};
    
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(input1),0.000001);
  }

  @Test
  public void testaverageWithoutLowest2() {
    double[] input1 = {3.0,4.0};
    
    assertEquals(4.0, ArrayExamples.averageWithoutLowest(input1),0.000001);
  }

  @Test
  public void testaverageWithoutLowest3() {
    double[] input1 = {3.0,3.0,4.0,5.0};
    
    assertEquals(4.5, ArrayExamples.averageWithoutLowest(input1),0.000001);
  }
}
