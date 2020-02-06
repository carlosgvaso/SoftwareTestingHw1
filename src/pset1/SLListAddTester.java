package pset1;

import static org.junit.Assert.*;
import org.junit.Test;

public class SLListAddTester {
	@Test
	public void test0() {
		SLList l = new SLList();
		assertTrue(l.repOk());
		l.add(true);

		// write a sequence of assertTrue method invocations that
		// perform checks on the values for all the declared fields
		// of list and node objects reachable from l

		assertTrue(l.header != null);
		// your code goes here

		// Check the new node elem is set to true
		assertTrue(l.header.elem);

		// Check the new node next object does not point to any other node (is null)
		assertTrue(l.header.next == null);

		// TODO: Might need to test the obj/var types.
	}

	@Test
	public void test1() {
		SLList l = new SLList();
		assertTrue(l.repOk());
		l.add(true);
		assertTrue(l.repOk());
		l.add(false);
		assertTrue(l.repOk());

		// write a sequence of assertTrue method invocations that
		// perform checks on the values for all the declared fields
		// of list and node objects reachable from l

		assertTrue(l.header != null);
		// your code goes here

		// Check the second added node elem is set to false
		assertTrue(!l.header.elem);

		// Check the second added node next object points to the first added node
		assertTrue(l.header.next != null);

		// Check the first added node elem is set to true
		assertTrue(l.header.next.elem);

		// Check the first added node next object does not point to any other node (is null)
		assertTrue(l.header.next.next == null);

		// TODO: Might need to test the obj/var types.
	}
}
