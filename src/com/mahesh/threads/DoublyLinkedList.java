package com.mahesh.threads;

public class DoublyLinkedList {
	
	NodeT head;
	NodeT tail;
	
	public void add(int item){
		NodeT l = tail;
		NodeT node = new NodeT(l, item, null);
		tail = node;
		if(l == null){
			head = node;
			tail = node;
		}else{
			l.next = node;
		}
		
	}
	
	public void addBefore(int item, int before){
		NodeT node = head;
		NodeT refNode = null;
		while(node!=null){
			if(node.item == before){
				refNode = node;
				break;
			}
			node = node.next;
		}
		if(refNode != null){
			NodeT prev = refNode.getPrev();
			NodeT currentNode = new NodeT(prev,item,refNode);
			if(prev==null){
	
				head = currentNode;
			}
			refNode.setPrev(currentNode);
		}else{
			System.out.println("Unable to find the given element...");
		}
		
	}
	
	public void traverse(){
		NodeT node = head;
		while(node != null){
			System.out.println("Content is "+node.item);
			node = node.getNext();
		}
	}
	public static void main(String[] args) {
		DoublyLinkedList linkedList = new DoublyLinkedList();
		
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);
		linkedList.add(5);
		linkedList.traverse();
		linkedList.addAfter(7, 3);
		linkedList.addBefore(8,1);
		linkedList.traverse();
		
	}
	
	public void addAfter(int item, int after){
		NodeT node = head;
		NodeT refNode = null;
		while(node!=null){
			if(node.item == after){
				refNode = node;
				break;
			}
			node = node.next;
		}
		if(refNode != null){
			NodeT next = refNode.getNext();
			NodeT currentNode = new NodeT(refNode,item,next);
			if(next==null){
				tail = currentNode;
			}
			refNode.setNext(currentNode);
		}else{
			System.out.println("Unable to find the given element...");
		}
	}
	

}

class NodeT{
	int item;
	NodeT prev;
	NodeT next;
	NodeT(NodeT prev, int item, NodeT next){
		this.prev=prev;
		this.item=item;
		this.next=next;
	}
	public int getItem() {
		return item;
	}
	public void setItem(int item) {
		this.item = item;
	}
	public NodeT getPrev() {
		return prev;
	}
	public void setPrev(NodeT prev) {
		this.prev = prev;
	}
	public NodeT getNext() {
		return next;
	}
	public void setNext(NodeT next) {
		this.next = next;
	}
	public String toString(){
		return item+ "next item is "+next.item;
	}
}
