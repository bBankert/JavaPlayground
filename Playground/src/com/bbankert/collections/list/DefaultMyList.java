package com.bbankert.collections.list;


public class DefaultMyList implements MyList {
	
	private Node head;
	
	private Node tail;
	
	{
		head = null;
		tail = null;
	}
	
	
	class Node {
		Object value;
		Node previous;
		Node next;
		
		public Node(Object value) {
			this.value = value;
		}
	}

	@Override
	public void add(Object e) {
		Node node = new Node(e);
		
		if(head == null) {
			head = node;
			tail = node;
			
			// given that this is the first node, this node is currently the first and last node
			head.previous = null;
			tail.next = null;
		}
		else {
			//current tail will now point to newly inserted node
			tail.next = node;
			node.previous = tail;
			
			//this will now be the "new" last node
			tail = node;
			tail.next = null;
		}

	}

	@Override
	public void clear() {
		if(head == null) {
			return;
		}
		
		head = null;
		tail = null;
	}
	
	private void removeAtBeginning() {
		if(head == null) {
			return;
		}
		
		if(head == tail) {
			head = null;
			tail = null;
		}
		
		head = head.next;
		head.previous = null;
	}
	
	private void removeAtEnd() {
		if(tail == null) {
			return;
		}
		
		if(head == tail) {
			head = null;
			tail = null;
		}
		
		tail = tail.previous;
		tail.next = null;
	}

	@Override
	public boolean remove(Object o) {
		
		if(o == null) {
			throw new NullPointerException("object must not be null");
		}
		
		if(this.size() == 0) {
			return false;
		}
		else {
			Node current = head;
			while(current != null) {
				//validate value
				if(current.value.equals(o)) {
					if(current == head) {
						removeAtBeginning();
					}
					else if(current == tail) {
						removeAtEnd();
					}
					else {
						current.previous.next = current.next;
						current.next.previous = current.previous;
					}
					return true;
				}
			}
		}
		return false;
	}
	
	@Override
	public int size() {	
		int size = 0;
		Node current = head;
		while(current != null) {
			current = current.next;
			size++;
		}
		
		return size;
	}
	

	@Override
	public Object[] toArray() {
		
		if(head == null) {
			return new Object[0];
		}
		
		int currentIndex = 0;
		Object[] output = new Object[this.size()];
		Node current = head;
		while(current != null){
			output[currentIndex] = current.value;
			current = current.next;
			currentIndex++;
		}
		
		return output;
	}

	@Override
	public boolean contains(Object o) {
		
		if(o == null) {
			throw new NullPointerException("object must not be null");
		}
		
		Node current = head;
		while(current != null) {
			if(current.value.equals(o)) {
				return true;
			}
			current = current.next;
		}
		
		return false;
	}

	@Override
	public boolean containsAll(MyList c) {
		Object[] comparisonArray = c.toArray();
		
		for(Object target: comparisonArray) {
			if(!this.contains(target)) {
				return false;
			}
		}
		
		return true;
	}

}
