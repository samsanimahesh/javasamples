package com.mahesh.threads;

public class SinglyLinkedList {

	Node head;
	Node tail;

	public void add(int item) {
		Node node = new Node(item, null);
		if (head == null) {
			head = node;
			tail = node;
		} else {
			tail.setNextRef(node);
			tail = node;
		}
	}

	public void addAfter(int item, int after) {
		Node node = head;

		Node refNode = null;
		while (true) {
			if (node == null) {
				break;
			}
			if (node.getItem() == after) {
				// found the target node, add after this node
				refNode = node;
				break;
			}
			node = node.getNextRef();
		}
		if (refNode != null) {
			// add element after the target node
			Node nd = new Node(item, node.getNextRef());
			if (node == tail) {
				tail = nd;
			}
			node.setNextRef(nd);

		} else {
			System.out.println("Unable to find the given element...");
		}
	}

	public void deleteFront() {
		if (head == null) {
			System.out.println("Cannot delete front element");
		}
		Node temp = head.getNextRef();
		if (temp != null) {
			head = temp;
		} else {
			head = null;
			tail = null;
		}
		System.out.println("Deleted head element");

	}

	public void deleteAfter(int item) {
		Node temp = head;
		Node refNode = null;

		while (true) {
			if (temp == null) {
				break;
			}

			if (temp.getItem() == item) {
				refNode = temp;
				break;
			}
			temp = temp.getNextRef();
		}
		if (refNode != null) {
			Node toBeDelted = refNode.getNextRef();
			refNode.setNextRef(toBeDelted.getNextRef());
			if (refNode.getNextRef() == null) {
				tail = refNode;
			}
			System.out.println("Deleted : " + refNode.getItem());
		} else {
			System.out.println("Unable to find the given element...");
		}
	}

	public void traverse() {

		Node tmp = head;
		while (true) {
			if (tmp == null) {
				break;
			}
			System.out.println(tmp.getItem());
			tmp = tmp.getNextRef();
		}
	}

	public static void main(String[] args) {
		SinglyLinkedList linkedList = new SinglyLinkedList();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);
		linkedList.add(5);
//		linkedList.add(8);
		linkedList.traverse();

//		linkedList.addAfter(78, 7);
//		linkedList.deleteAfter(5);
//		linkedList.traverse();
		linkedList.reverse();
		linkedList.traverse();
	}

	private void reverse() {
		Node currNode = head;
		Node nextNode = null;
		Node prevNode = null;

		while (currNode != null) {
			nextNode = currNode.getNextRef();
			currNode.nextRef = prevNode;
			prevNode = currNode;
			currNode = nextNode;
		}
		head = prevNode;
		System.out.println("\n Reverse Through Iteration");

	}

}

class Node {

	int item;
	Node nextRef;

	Node(int item, Node nextRef) {
		this.item = item;
		this.nextRef = nextRef;
	}

	public void setNextRef(Node node) {
		this.nextRef = node;
	}

	public Node getNextRef() {
		return nextRef;
	}

	public void setItem(int item) {
		this.item = item;
	}

	public int getItem() {
		return item;
	}

}