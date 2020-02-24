package pset1;

import static org.junit.Assert.*;

import org.junit.Test;

public class EqualsTester {
	/*
	 * P1: For any non-null reference value x, x.equals(null) should return false.
	 */

	@Test
	public void t0() {
		assertFalse(new Object().equals(null));
	}

	// your test methods for P1 go here

	/*
	 * Test that for any non-null C object c, c.equals(null) is false.
	 */
	@Test
	public void t1() {
		assertFalse(new C(0).equals(null));
	}

	/*
	 * Test that for any non-null D object d, d.equals(null) is false.
	 */
	@Test
	public void t2() {
		assertFalse(new D(0, 0).equals(null));
	}

	/*
	 * P2: It is reflexive: for any non-null reference value x, x.equals(x)
	 * should return true.
	 */

	// your test methods for P2 go here

	/*
	 * Test that for any Object object o declared as Object(), o.equals(o) is true.
	 */
	@Test
	public void t3() {
		Object o = new Object();
		assertTrue(o.equals(o));
	}

	/*
	 * Test that for any C object c declared as C(), c.equals(c) is true.
	 */
	@Test
	public void t4() {
		C c = new C(0);
		assertTrue(c.equals(c));
	}

	/*
	 * Test that for any D object d declared as D(), d.equals(d) is true.
	 */
	@Test
	public void t5() {
		D d = new D(0, 0);
		assertTrue(d.equals(d));
	}

	/*
	 * P3: It is symmetric: for any non-null reference values x and y, x.equals(y)
	 * should return true if and only if y.equals(x) returns true.
	 */

	// your test methods for P3 go here

	/*
	 * Test that for any 2 equal Object objects o1 and o2 o1.equals(o2) and o2.equals(o1) are both true.
	 *
	 * This checks if one is true the other must be true part of o1.equals(o2) => o2.equals(o1), and
	 * o2.equals(o1) => o1.equals(o2).
	 */
	@Test
	public void t6() {
		Object o1 = new Object();
		Object o2 = o1; // TODO: o2 should be a clone of o1
		assertTrue(o1.equals(o2) && o2.equals(o1));
	}

	/*
	 * Test that for any 2 different Object objects o1 and o2 o1.equals(o2) and o2.equals(o1) are both false.
	 *
	 * This checks if one is false the other must be false part of o1.equals(o2) => o2.equals(o1), and
	 * o2.equals(o1) => o1.equals(o2).
	 */
	@Test
	public void t7() {
		Object o1 = new Object();
		Object o2 = new Object();
		assertFalse(o1.equals(o2) || o2.equals(o1));
	}

	/*
	 * Test that for any 2 equal C objects o1 and o2 o1.equals(o2) and o2.equals(o1) are both true.
	 *
	 * This checks if one is true the other must be true part of o1.equals(o2) => o2.equals(o1), and
	 * o2.equals(o1) => o1.equals(o2).
	 */
	@Test
	public void t8() {
		Object o1 = new C(0);
		Object o2 = new C(0);
		assertTrue(o1.equals(o2) && o2.equals(o1));
	}

	/*
	 * Test that for any 2 different C objects o1 and o2 o1.equals(o2) and o2.equals(o1) are both false.
	 *
	 * This checks if one is false the other must be false part of o1.equals(o2) => o2.equals(o1), and
	 * o2.equals(o1) => o1.equals(o2).
	 */
	@Test
	public void t9() {
		C o1 = new C(0);
		C o2 = new C(1);
		assertFalse(o1.equals(o2) || o2.equals(o1));
	}

	/*
	 * Test that for any 2 equal D objects o1 and o2 o1.equals(o2) and o2.equals(o1) are both true.
	 *
	 * This checks if one is true the other must be true part of o1.equals(o2) => o2.equals(o1), and
	 * o2.equals(o1) => o1.equals(o2).
	 */
	@Test
	public void t10() {
		Object o1 = new D(0, 0);
		Object o2 = new D(0, 0);
		assertTrue(o1.equals(o2) && o2.equals(o1));
	}

	/*
	 * Test that for any 2 different D objects o1 and o2 o1.equals(o2) and o2.equals(o1) are both false.
	 *
	 * This checks if one is false the other must be false part of o1.equals(o2) => o2.equals(o1), and
	 * o2.equals(o1) => o1.equals(o2).
	 */
	@Test
	public void t11() {
		D o1 = new D(0, 0);
		D o2 = new D(1, 1);
		assertFalse(o1.equals(o2) || o2.equals(o1));
	}

	/*
	 * Test that for any 2 different objects o1 (class Object) and o2 (class C) o1.equals(o2) and o2.equals(o1) are
	 * both false.
	 *
	 * This checks if one is false the other must be false part of o1.equals(o2) => o2.equals(o1), and
	 * o2.equals(o1) => o1.equals(o2).
	 */
	@Test
	public void t12() {
		Object o1 = new Object();
		C o2 = new C(0);
		assertFalse(o1.equals(o2) || o2.equals(o1));
	}

	/*
	 * Test that for any 2 different objects o1 (class Object) and o2 (class D) o1.equals(o2) and o2.equals(o1) are
	 * both false.
	 *
	 * This checks if one is false the other must be false part of o1.equals(o2) => o2.equals(o1), and
	 * o2.equals(o1) => o1.equals(o2).
	 */
	@Test
	public void t13() {
		Object o1 = new Object();
		D o2 = new D(0, 0);
		assertFalse(o1.equals(o2) || o2.equals(o1));
	}

	/*
	 * Test that for any 2 different objects o1 (class C) and o2 (class D), o1.equals(o2) and o2.equals(o1) are
	 * both false.
	 *
	 * This checks if one is false the other must be false part of o1.equals(o2) => o2.equals(o1), and
	 * o2.equals(o1) => o1.equals(o2)
	 */
	@Test
	public void t14() {
		C c1 = new C(0);
		C c2 = new D(0, 0);
		assertFalse(c1.equals(c2) || c2.equals(c1));
	}

	/*
	 * P4: It is transitive: for any non-null reference values x, y, and z,
	 * if x.equals(y) returns true and y.equals(z) returns true, then
	 * x.equals(z) should return true.
	 */

	// you do not need to write tests for P4

}
