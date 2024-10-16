package Assignment;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class Assert {
	@Test
	public void test1() {
		System.out.println("test1 running");
	}
	@Test
	public void test2() {
		System.out.println("Test2 running");
		int a[]= {1,2,3,4,5,6,7,8};
		int b[]= {1,2,3,4,5};
	
		assertArrayEquals(a, b);
		assertFalse(false);

	}
	@Test
	public void test3() {
		System.out.println("test 3 running");
		
	
		

	}

}
