package com.qa.ims.persistence.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import nl.jqno.equalsverifier.EqualsVerifier;

public class OrdersTest {

	@Test
	public void testEquals() {
		EqualsVerifier.simple().forClass(Orders.class).verify();
	}

	@Test
	public void testOrderConstructor1() {
		Orders test = new Orders(1L, 1L, 2L, 15L);
		assertEquals(Long.valueOf(1), test.getOrderID());
		assertEquals(Long.valueOf(1), test.getFk_id());
		assertEquals(Long.valueOf(2), test.getFk_itemID());
		assertEquals(Long.valueOf(15), test.getQuantity());

	}

	@Test
	public void testOrderConstructor2() {
		Orders test = new Orders(1L, 2L, 15L);
		assertEquals(Long.valueOf(1), test.getFk_id());
		assertEquals(Long.valueOf(2), test.getFk_itemID());
		assertEquals(Long.valueOf(15), test.getQuantity());

	}

	@Test
	public void testToString() {
		Orders test = new Orders(2L, 5L, 8L, 100L);
		String expected = "OrderID=" + test.getOrderID() + ", fk_id=" + test.getFk_id() + ", fk_itemID="
				+ test.getFk_itemID() + ", quantity=" + test.getQuantity();
		assertEquals(expected, test.toString());

	}

	@Test
	public void testHashCode() {
		Orders test1 = new Orders(1L, 4L, 1L, 2L);
		Orders test2 = new Orders(1L, 4L, 1L, 2L);
		assertEquals(test1, test2);
		assertTrue(test1.hashCode() == test2.hashCode());

	}

}
