package pset1;

import static org.junit.Assert.*;
import org.junit.Test;

public class HashCodeTester {
	/*
	 * P5: If two objects are equal according to the equals(Object)
	 * method, then calling the hashCode method on each of
	 * the two objects must produce the same integer result.
	 */

	// your test methods go here

	/*
	 * Test that for any 2 equal Object objects o1 and o2 (where o1.equals(o2) and o2.equals(o1) are both true)
	 * hashCode() yields the same result.
	 */
	@Test
	public void t0() {
		Object o1 = new Object();
		Object o2 = o1;   // TODO: o2 should be a clone of o1
		assertTrue(o1.equals(o2) && o2.equals(o1) && o1.hashCode() == o2.hashCode());
	}

	/*
	 * Test that for any 2 different Object objects o1 and o2 (where o1.equals(o2) and o2.equals(o1) are both false)
	 * hashCode() yields a different result.
	 */
	@Test
	public void t1() {
		Object o1 = new Object();
		Object o2 = new Object();
		assertFalse(o1.equals(o2) || o2.equals(o1) || o1.hashCode() == o2.hashCode());
	}

	/*
	 * Test that for any 2 equal class C objects o1 and o2 (where o1.equals(o2) and o2.equals(o1) are both true) yield
	 * the same hashCode() result.
	 */
	@Test
	public void t2() {
		C o1 = new C(0);
		C o2 = new C(0);
		assertTrue(o1.equals(o2) && o2.equals(o1) && o1.hashCode() == o2.hashCode());
	}

	/*
	 * Test that for any 2 different class C objects o1 and o2 (where o1.equals(o2) and o2.equals(o1) are both false)
	 * yield a different hashCode() result.
	 */
	@Test
	public void t3() {
		C o1 = new C(0);
		C o2 = new C(1);
		assertFalse(o1.equals(o2) || o2.equals(o1) || o1.hashCode() == o2.hashCode());
	}

	/*
	 * Test that for any 2 equal class D objects o1 and o2 (where o1.equals(o2) and o2.equals(o1) are both true) yield
	 * the same hashCode() result.
	 */
	@Test
	public void t4() {
		D o1 = new D(0, 0);
		D o2 = new D(0, 0);
		assertTrue(o1.equals(o2) && o2.equals(o1) && o1.hashCode() == o2.hashCode());
	}

	/*
	 * Test that for any 2 different class D objects o1 and o2 (where o1.equals(o2) and o2.equals(o1) are both false)
	 * yield a different hashCode() result.
	 */
	@Test
	public void t5() {
		D o1 = new D(0, 0);
		D o2 = new D(1, 1);
		assertFalse(o1.equals(o2) || o2.equals(o1) || o1.hashCode() == o2.hashCode());
	}

	/*
	 * Test that for any 2 different class Object and C objects o1 and o2 (where o1.equals(o2) and o2.equals(o1) are
	 * both false) yield a different hashCode() result.
	 */
	@Test
	public void t6() {
		Object o1 = new Object();
		C o2 = new C(0);
		assertFalse(o1.equals(o2) || o2.equals(o1) || o1.hashCode() == o2.hashCode());
	}

	/*
	 * Test that for any 2 different class Object and D objects o1 and o2 (where o1.equals(o2) and o2.equals(o1) are
	 * both false) yield a different hashCode() result.
	 */
	@Test
	public void t7() {
		Object o1 = new Object();
		D o2 = new D(0, 0);
		assertFalse(o1.equals(o2) || o2.equals(o1) || o1.hashCode() == o2.hashCode());
	}

	/*
	 * Test that for any 2 class C and D objects o1 and o2 (where o1.equals(o2) and o2.equals(o1) are
	 * both true) yield the same hashCode() result.
	 */
	@Test
	public void t8() {
		C o1 = new C(0);
		D o2 = new D(0, 0);
		assertTrue(o1.equals(o2) && o2.equals(o1) && o1.hashCode() == o2.hashCode());
	}

	/*
	 * Test that for any 2 different class C and D objects o1 and o2 (where o1.equals(o2) and o2.equals(o1) are
	 * both false) yield a different hashCode() result.
	 */
	@Test
	public void t9() {
		C o1 = new C(0);
		D o2 = new D(1, 1);
		assertFalse(o1.equals(o2) || o2.equals(o1) || o1.hashCode() == o2.hashCode());
	}
}
