 

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StackTest {
	private static final int[] NULL = null;
	
	
	@Test
	void test() {
		Stack stack= new Stack();
		stack.push(2);
		stack.push(4);
		stack.push(6);
		stack.push(8);
		
		stack.display();
		assertEquals(true,true);
	}

	
	@Test
	void test1() {
		Stack stack= new Stack();
		stack.push(2);
		stack.push(4);
		stack.push(6);
		stack.push(8);
		
		stack.display();
	assertEquals(8, stack.top());
	
	}
	
	
	@Test
	void test3() {
		Stack stack= new Stack();
		stack.push(2);
		stack.push(4);
		stack.push(6);
		stack.push(8);
		
		stack.display();
	assertNotEquals(2, stack.top());
	
	}
	
	
	@Test
	void test2() {
		Stack stack= new Stack();
		stack.push(2);
		stack.push(4);
		stack.push(6);
		stack.push(8);
		
		stack.display();
	assertEquals(8, stack.pop());
	
	}
	
	
	
	@Test
	void test4() {
		Stack stack= new Stack();
		stack.push(2);
		stack.push(4);
		stack.push(6);
		stack.push(8);
		
		stack.display();
	assertNotEquals(2, stack.pop());
	
	}
	
	@Test
	void test5() {
		Stack stack= new Stack();
		stack.push(2);
		stack.push(4);
		stack.push(6);
		stack.push(8);
		
		stack.display();
	assertEquals(4, stack.getSize());
	}
	
	@Test
	void test6() {
		Stack stack= new Stack();
		stack.push(2);
		stack.push(4);
		stack.push(6);
		stack.push(8);
		
		stack.display();
		
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		
		
	assertEquals(0, stack.getSize());
	
	
	}
	
}
