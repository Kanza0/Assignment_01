 

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QueueTest {

	private static final int[] NULL = null;
	
	
	@Test
	public void test() {
		Queue queue= new Queue();
		
		queue.enqueue(2);
		queue.enqueue(4);
		queue.enqueue(6);
		queue.enqueue(8);
		
		
		queue.display();
		
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		
		
		queue.display();
		
	      assertEquals(-1,queue.dequeue());
	}

	
	
	@Test
	public void test1() {
		Queue queue= new Queue();
		queue.enqueue(2);
		queue.enqueue(4);
		queue.enqueue(6);
		queue.enqueue(8);

		
        queue.display();
		
		queue.dequeue();
		assertEquals(4,queue.dequeue());
	}
	
	
	
	@Test
	public void test2() {
		Queue queue= new Queue();
		queue.enqueue(2);
		queue.enqueue(4);
		queue.enqueue(6);
		queue.enqueue(8);

		
        queue.display();
		
		
		assertEquals(2,queue.dequeue());
	}
	
	

	
	
}



