 

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LinkedListTest {
	private static final int[] NULL = null;

	@Test
	void test() {
		LinkedList linklist= new LinkedList();
		linklist.pushFront(2);
		linklist.pushFront(4);
		linklist.pushFront(6);
		linklist.pushFront(8);
		
		
		linklist.display();
		assertEquals(8, linklist.head.key);
		
	}
	
	
	@Test
	void test1() {
		LinkedList linklist= new LinkedList();
		linklist.pushFront(2);
		linklist.pushFront(4);
		linklist.pushFront(6);
		linklist.pushFront(8);
		linklist.popFront();
		
		linklist.display();
		assertNotEquals(2, linklist.head.key);
		
	}

	
	
	
	
	
	
	@Test
	void test3() {
		LinkedList linklist= new LinkedList();
		linklist.pushFront(2);
		linklist.pushFront(4);
		linklist.pushFront(6);
		linklist.pushFront(8);
		linklist.popFront();
		linklist.pushBack(10);
		linklist.popBack();
		
		
		linklist.display();
		assertEquals(6, linklist.head.key);
		
	}
	
	
	@Test
	void test4() {
		LinkedList linklist= new LinkedList();
		linklist.pushFront(2);
		linklist.pushFront(4);
		linklist.pushFront(6);
		linklist.pushFront(8);
		linklist.popFront();
		linklist.pushBack(10);
		linklist.pop(2);
	
		
		
		linklist.display();
		System.out.println("Test");
		assertNotEquals(20, linklist.head.next.key);
		System.out.println("LinkedList");
		
	}
	
	
	
	@Test
	void test5() {
		LinkedList linklist= new LinkedList();
		linklist.pushFront(2);
		linklist.pushFront(4);
		linklist.pushFront(6);
		linklist.pushFront(8);
		linklist.popFront();
		linklist.pushBack(10);
		linklist.pop(2);
		//linklist.size();
		
		
		linklist.display();
		System.out.println("Test");
		assertEquals(3, linklist.size);
		
	}
	
	
	@Test
	void test6() {
		LinkedList linklist= new LinkedList();
		linklist.pushFront(2);
		linklist.pushFront(4);
		linklist.pushFront(3);
		linklist.pushBack(8);
		linklist.pushBack(10);
		linklist.pop(2);
		linklist.pop(4);
		
		
		
		linklist.display();
		
		assertNotEquals(5, linklist.size);
	}	
}
