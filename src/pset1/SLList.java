package pset1;

import java.util.HashSet;
import java.util.Set;

public class SLList {
	Node header;

	static class Node {
		boolean elem;
		Node next;
	}

	boolean repOk() {
		// postcondition: returns true iff <this> is an acyclic list, i.e.,
		// there is no path from a node to itself

		Set<Node> visited = new HashSet<Node>();
		Node n = header;
		while (n != null) {
			if (!visited.add(n)) {
				return false;
			}
			n = n.next;
		}
		return true;
	}

	void add(boolean e) {
		// precondition: this.repOk()
		// postcondition: adds <e> in a new node at the beginning of the
		// list; the rest of the list is unmodified

		// your code goes here

		// Check for cycles (precondition), and do nothing if list is cyclical
		if (!this.repOk()) {
			return;
		}

		// Create new node instance
		Node new_node = new Node();

		// Add elem value to new node
		new_node.elem = e;

		// Point next object of new node we are adding to the first node on the list
		new_node.next = this.header;

		// Point the beginning of the list to the new node we are adding
		this.header = new_node;
	}
}
