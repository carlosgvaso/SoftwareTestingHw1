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

		// Check the header points to a Node object
		assertTrue(l.header instanceof SLList.Node);

		// TODO: Do I need this?
		//assertTrue(l.header.elem instanceof boolean);

		// Check the new node elem value is true
		assertTrue(l.header.elem);

		// Check the new node next attribute does not point to any other node (is null)
		assertTrue(l.header.next == null);

		// Check there are no cycles introduced by the new node
		assertTrue(l.repOk());
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

		// Check the header points to a Node object
		assertTrue(l.header instanceof SLList.Node);

		// Check the second added node (first on the list) elem value is false
		assertTrue(!l.header.elem);

		// Check the second added node (first on the list) next attribute points to a Node object
		assertTrue(l.header.next instanceof SLList.Node);

		// Check the second added node (first on the list) next object points to another node (not null)
		assertTrue(l.header.next != null);

		// Check the first added node (second on the list) elem value is true
		assertTrue(l.header.next.elem);

		// Check the first added node (second on the list) next object does not point to any other node (null)
		assertTrue(l.header.next.next == null);
	}
}
