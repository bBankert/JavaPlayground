package com.bbankert.generics;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class DefaultMyListParameterized<T> implements MyListParameterized<T>, ListIterableParameterized<T> {
	
	private Node<T> head;
	private Node<T> tail;
	/**
	 * Total amount of elements in object of MyListImpl.
	 */
	private int size;
	
	
	/**
	 * Nested class which store information about next 
	 * and previous elements in container MyList and data of 
	 * this Node
	 */
	
	private static class Node<T> {
		private T data;
		private Node<T> next;
		private Node<T> previous;
		
		public Node(Node<T> previousNode, T data, Node<T> nextNode) {
			this.next = nextNode;
			this.previous = previousNode;
			this.data = data;
		}
			
		@Override
		public String toString() {
			return data.toString();
		}
	}
	
	private class ListIteratorImplParameterized<T> extends IteratorImpl<T> implements ListIteratorParameterized<T> {

		@Override
		public boolean hasPrevious() {
			return cursor != 0;
		}

		@Override
		public T previous() {
			cursor -= 1;
			Node<T> previous = (Node<T>) getNodeByIndex(cursor);
			if(previous == null) {
				cursor = 0;
				throw new NoSuchElementException();
			}
			
			lastRet = cursor;
			return previous.data;
		}

		@Override
		public void set(T e) {
			if(lastRet < 0) {
				throw new IllegalStateException();
			}
			Node<T> node = (Node<T>)getNodeByIndex(lastRet);
			node.data = e;
			lastRet = -1;
			
		}
		
	}
	
	private class IteratorImpl<T> implements Iterator<T> {
		
		protected int cursor = 0;
		
		protected int lastRet = -1;

		@Override
		public boolean hasNext() {
			return cursor != size;
		}

		@Override
		public T next() {
			Node<T> next = (Node<T>) getNodeByIndex(cursor);
			if(next == null) {
				throw new NoSuchElementException();
			}
			lastRet = cursor;
			cursor += 1;
			return next.data;
		}
		
		public void remove() {
			if(lastRet < 0) {
				throw new IllegalStateException();
			}
			
			removeNodeByIndex(lastRet);
			if(lastRet < cursor) {
				cursor--;
			}
			
			lastRet = -1;
		}
	}

	@Override
	public Iterator<T> iterator() {
		return new IteratorImpl<>();
	}
	
	T unlink(Node<T> element) {
		T obj = element.data;
		Node<T> next = element.next;
		Node<T> previous = element.previous;
			
		if (previous == null) {
			head = next;
		} else {
			previous.next = next;
			element.previous = null;
		}
		if (next == null) {
			tail = previous;
		} else {
			next.previous = previous;
			element.next = null;
		}
			
		element.data = null;
		size--;
		return obj;	
	}
	
	public T removeNodeByIndex(int index) {
		return unlink(getNodeByIndex(index));
		
	}

	public Node<T> getNodeByIndex(int index) {
		if (index > (size -1)) {
			return null;
		}
		
		if (index < (size >> 1)) {
            Node<T> x = head;
            for (int i = 0; i < index; i++) {
				x = x.next;
			}
            return x;
        } else {
            Node<T> x = tail;
            for (int i = size - 1; i > index; i--) {
				x = x.previous;
			}
            return x;
        }
	}

	@Override
	public ListIteratorParameterized<T> listIterator() {
		return new ListIteratorImplParameterized<>();
	}

	@Override
	public void add(T e) {
		final Node<T> lastNode = tail;
        final Node<T> newNode = new Node(lastNode, e, null);
        tail = newNode;
        if (lastNode == null) {
			head = newNode;
		} else {
			lastNode.next = newNode;
		}
        size++;
		
	}

	@Override
	public void clear() {
		for (Node<T> x = head; x != null; ) {
			Node<T> next = x.next;
			x.data = null;
			x.next = null;
			x.previous = null;
			x = next;
		}
		tail = null;
		head = null;
		size = 0;
		
	}

	@Override
	public boolean remove(Object obj) {
		if (obj == null) {
			for (Node<T> x = head; x != null; x = x.next) {
				if (x.data == null) {
					unlink(x);
					return true;
				}
			}		
		} else {
			for (Node<T> x = head; x != null; x = x.next) {
				if (x.data.equals(obj)) {
					unlink(x);
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public Object[] toArray() {
		Object[] result = new Object[size];
		int index = 0;
		for (Node<T> x = head; x != null; x = x.next) {
			result[index++] = x.data;
		}
		return result;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean contains(Object o) {
		if (o == null) {
			for (Node<T> x = head; x != null; x = x.next) {
				if (x.data == null) {
					return true;
				}
			}
		} else {
			for (Node<T> x = head; x != null; x = x.next) {
				if (x.data.equals(o)) {
					return true;
				}
			}
		}
		
		return false;
	}

	@Override
	public boolean containsAll(MyListParameterized<?> c) {
		Object[] array = c.toArray();
		for (int i = 0; i < array.length; i++) {
			if (!contains(array[i])) {
				return false;
			};
		}	
		return true;
	}
	
}
