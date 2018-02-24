package edu.towson.cis.cosc442.project2.vendingmachine;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class VendingMachineTest.
 */
public class VendingMachineTest {
	
	/** The item. */
	VendingMachineItem item;
	
	/** The vm. */
	VendingMachine vm;
	

	/**
	 * Sets the up.
	 *
	 * @throws Exception the exception
	 */
	@Before
	public void setUp() throws Exception {
		item = new VendingMachineItem("bread", 3.25);
		
		vm = new VendingMachine();
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
	 * Test add item.
	 */
	@Test
	public void testAddItem() {
		
		vm.addItem(item, "A");
		
		assertEquals("bread", vm.getItem("A"), item);
	}

	/**
	 * Test remove item.
	 */
	@Test
	public void testRemoveItem() {
		
		vm.addItem(item, "A");
		
		assertEquals("Remove the Item", vm.removeItem("A"), item);
	}

	/**
	 * Test insert money.
	 */
	@Test
	public void testInsertMoney() {
		
		vm.insertMoney(3.50);
		
		assertEquals(3.50, vm.getBalance(), 0.01);
	}

	/**
	 * Test get balance.
	 */
	@Test
	public void testGetBalance() {
		
		vm.insertMoney(3.50);
		
		assertEquals(3.50, vm.getBalance(), 0.01);
	}

	/**
	 * Test make purchase.
	 */
	@Test
	public void testMakePurchase() {
		
		vm.makePurchase("A");
		
		assertEquals("bread", item.getName());
			
	}

	/**
	 * Test return change.
	 */
	@Test
	public void testReturnChange() {
		
		vm.insertMoney(3.50);
		
		assertEquals(2.50, 3.50, vm.getBalance());
	}

}
