/**
 * 
 */
package repair_app;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

/**
 * @author holub
 *
 */
public class CarTest {

	Car testCar;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUpGetTime() throws Exception {
		testCar = new Car("Ferrari");
	}

	/**
	 * Test method for {@link repair_app.Car#getTime()}.
	 */
	@Test
	public void testGetTime() {
		assertEquals(0, testCar.getTime());
	}

	/**
	 * Test method for {@link repair_app.Car#setTime(int)}.
	 */
	@Before
	public void setUpSetTime() throws Exception {
		testCar = new Car("Ferrari");
	}
	
	@Test
	public void testSetTime() {
		testCar.setTime(5487);
		assertEquals(5487, testCar.getTime());
	}

	
	@Test(expected = NullPointerException.class)
	public void testNullExc() {
		testCar = new Car(null);
		testCar.getType();
	}
	
	@Before
	public void setUpIntval() throws Exception {
		testCar = new Car("Ferrari");
		testCar.setTime(5000);
		
	}
	
	@Test
	public void testIntval() {
		assertTrue(testCar.getTime()>50 && testCar.getTime()<10000);
	}
	
}
