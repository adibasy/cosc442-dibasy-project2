package edu.towson.cis.cosc442.project2.vendingmachine;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class VendingMachineItemTest.
 */
public class VendingMachineItemTest {
	
	/** The item. */
	VendingMachineItem item;
	
	
	/**
	 * Sets the up.
	 *
	 * @throws Exception the exception
	 */
	@Before
	public void setUp() throws Exception {
	
		item = new VendingMachineItem("bread", 3.75);
			
	}

	/**
	 * Tear down.
	 *
	 * @throws Exception the exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test vending machine item.
	 */
	@Test
	public void testVendingMachineItem() {
		
		assertEquals("bread", item.getName());
		assertEquals(3.75, item.getPrice(), 0.01);	
		
	}

	/**
	 * Test get name.
	 */
	@Test
	public void testGetName() {
		
		
		assertEquals("bread", item.getName());
	}

	/**
	 * Test get price.
	 */
	@Test
	public void testGetPrice() {
		
		
		assertEquals(3.75, item.getPrice(), 0.01);
	}

}
