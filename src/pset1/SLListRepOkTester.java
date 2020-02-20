package pset1;

import static org.junit.Assert.*;
import org.junit.Test;
import pset1.SLList.Node;

public class SLListRepOkTester {
	@Test
	public void t0() {
		SLList l = new SLList();
		assertTrue(l.repOk());
	}

	@Test
	public void t1() {
		SLList l = new SLList();
		Node n = new Node();
		// your code goes here

		/*
		Create a list with 1 node as shown below, and check repOk() returns true:

		l.header -> n.next ->
		 */
		n.elem = true;
		l.header = n;
		assertTrue(l.repOk());
	}

	// your code goes here

	@Test
	public void t2() {
		SLList l = new SLList();
		Node n = new Node();

		/*
		Create a list with 1 node as shown below, and check repOk() returns	false:

		l.header -> n.next -|
		     ^--------------|
		 */
		n.elem = true;
		l.header = n;
		n.next = l.header;
		assertFalse(l.repOk());
	}

	@Test
	public void t3() {
		SLList l = new SLList();
		Node n = new Node();

		/*
		Create a list with 1 node as shown below, and check repOk() returns	false:

		l.header -> n.next -|
		               ^----|
		 */
		n.elem = true;
		l.header = n;
		n.next = n;
		assertFalse(l.repOk());
	}

	@Test
	public void t4() {
		SLList l = new SLList();
		Node n1 = new Node();
		Node n2 = new Node();

		/*
		Create a list with 2 nodes as shown below, and check repOk() returns true:

		l.header -> n1.next -> n2.next ->
		 */
		n1.elem = true;
		n2.elem = true;
		l.header = n1;
		n1.next = n2;
		assertTrue(l.repOk());
	}

	@Test
	public void t5() {
		SLList l = new SLList();
		Node n1 = new Node();
		Node n2 = new Node();

		/*
		Create a list with 2 nodes as shown below, and check repOk() returns false:

		l.header -> n1.next -> n2.next -|
		     ^--------------------------|
		 */
		n1.elem = true;
		n2.elem = true;
		l.header = n1;
		n1.next = n2;
		n2.next = l.header;
		assertFalse(l.repOk());
	}

	@Test
	public void t6() {
		SLList l = new SLList();
		Node n1 = new Node();
		Node n2 = new Node();

		/*
		Create a list with 2 nodes as shown below, and check repOk() returns false:

		l.header -> n1.next -> n2.next -|
		                ^---------------|
		 */
		n1.elem = true;
		n2.elem = true;
		l.header = n1;
		n1.next = n2;
		n2.next = n1;
		assertFalse(l.repOk());
	}

	@Test
	public void t7() {
		SLList l = new SLList();
		Node n1 = new Node();
		Node n2 = new Node();

		/*
		Create a list with 2 nodes as shown below, and check repOk() returns false:

		l.header -> n1.next -> n2.next -|
		                           ^----|
		 */
		n1.elem = true;
		n2.elem = true;
		l.header = n1;
		n1.next = n2;
		n2.next = n2;
		assertFalse(l.repOk());
	}
}
