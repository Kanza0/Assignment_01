 

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.IntStream;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class ArrayTest {

	private static final int[] NULL = null;


//testcase1
	@Test
	//deletion
	void test1() {
		Array arr= new Array();
		int count=0, count1=0;
		arr.insert(1, 0);
	
		arr.insert(2, 1);
	
		arr.insert(3, 2);
		
		arr.insert(4, 3);
		
		arr.insert(5, 4);
		
		System.out.println(arr.size);
	
		
		
		
		arr.display();
		
		count= arr.size;
		
		arr.delete(1);
		
		count1= arr.size;
		
		arr.display();
		assertNotEquals(count, count1);
		
	}
	
	
	
	//check if array is null or not
	//testcase2
	@Test
	void test2() {
		Array arr = new Array();
	assertFalse (arr.array==NULL);
	}
	
	
	
 
	
  @Test
  void test3() {
	  Array arr = new Array();
	     arr.insert(1, 0);
		
		arr.insert(2, 1);
	
		arr.insert(3, 2);
		
		arr.insert(4, 3);
		
		arr.insert(5, 4);
		
	
	for(int i=0;i<arr.size;i++){
	    assertTrue(arr.linearSearch(2) );
	}
  }
	
	
	//testcase 3
	//getvalues
	/*@Test
	void test3() {
		Array arr= new Array() ;
			arr.getValues();
			
		
	}*/
	
	
	
	
	//testcase4
	//insertion
	@Test
	void test4() {
		Array arr= new Array();
	    arr.insert(1,0);
	    arr.insert(2,1);
	    arr.insert(3,2);
	    
	   // int [] arr1= {0,1,2};
	    //assertArrayEquals(arr1,Array.array);
	    
	    boolean contains= IntStream.of(arr.array).anyMatch(x-> x==1);
	    assertTrue(contains);
				}
	
	
	
	@Test
	void test5() {
		Array arr= new Array();
		 arr.insert(1, 0);
			
			arr.insert(2, 1);
		
			arr.insert(3, 2);
			
			arr.insert(4, 3);
			
			arr.insert(5, 4);
			
		
		int [] array11= {5,4,3,2};
		int [] array111= {3,4,5,6};
		assertArrayNotEqual(array111, arr.array);
	}


private void assertArrayNotEqual(int[] array111, int[] array) {
		// TODO Auto-generated method stub
		
	}



@Test
void test6() {
	Array arr= new Array();
	int [] arr2= new int[100];
	
	arr2[0]=1;
	arr2[1]=2;
	arr2[2]=3;
	arr2[3]=4;
	arr2[4]=5;
	
	for(int i=5; i<100; i++)
	{
		arr2[i]=0;
		}
	
	arr.insert(1,0);
	arr.insert(2,1);
	arr.insert(3,2);
	arr.insert(4,3);
	arr.insert(5,4);
	
	arr.bubbleSort();
	arr.display();
	
	
	assertArrayEquals(arr2,arr.array);
	
}
	
	


@Test
void test7() {
	Array arr= new Array();
	arr.insert(1,0);
	arr.insert(2,1);
	arr.insert(3,2);
	arr.insert(4,3);
	arr.insert(5,4);
	
	
	assertTrue( arr.binarySearch(3,0,5));
}


@Test
void test8() {
	Array arr= new Array();
	arr.insert(1,0);
	arr.insert(2,1);
	arr.insert(3,2);
	arr.insert(4,3);
	arr.insert(5,4);
	
	
	assertTrue( arr.binarySearch(2,0,5));
}


@Test
void test9() {
	Array arr= new Array();
	arr.insert(1,0);
	arr.insert(2,1);
	arr.insert(3,2);
	arr.insert(4,3);
	arr.insert(5,4);
	
	
	assertFalse( arr.binarySearch(6,0,5));
}


@Test
void test10() {
	  Array arr = new Array();
	     arr.insert(1, 0);
		
		arr.insert(2, 1);
	
		arr.insert(3, 2);
		
		arr.insert(4, 3);
		
		arr.insert(5, 4);
		
	
	
	    
	    arr.delete(1);
	    
	    assertEquals(false,arr.linearSearch(2) );
	    
	}


@Test
void test11() {
	  Array arr = new Array();
	     arr.insert(1, 0);
		
		arr.insert(2, 1);
	
		arr.insert(3, 2);
		
		arr.insert(4, 3);
		
		arr.insert(5, 4);
		
	
	
	    
	    arr.delete(4);
	    
	    assertEquals(true,arr.linearSearch(2) );
	    arr.bubbleSort();
	    
	}



}
