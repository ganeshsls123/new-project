package junittest1;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.Test;

public class AssertClass {
	@Test
	public void equal() {
		String a="sam";
		String b="sam";
		assertEquals(a, b);
		System.out.println(a+"is same"+b);
		
	}
	@Test
	public void notEqual() {
		int a=10;
		int b=11;
		assertNotEquals(a, b);
		
	}
	@Test
	public void value() {
		String a=null;
		assertNull(a);
	}
	@Test
	public void value1() {
		String a="raju";
		assertNotNull(a);
	}
	@Test
	public void same() {
		int a=11;
		int b=10;
		if(a>b) {
		assertTrue(true);
	}
	}
	@Test
	public void notSame() {
		int a=11;
		int b=10;
		if(a>b) {
		assertFalse(false);
	}
	}
	@Test
	public void samer() {
		String a="data";
		String b="data";
		assertSame(b, a);
	}
	
	@Test
	public void notSamer() {
		String a="data";
		String b="data";
		assertSame(b, a);
	}
	@Test
	public void arra() {
		int a[]= {1,2,3};
		int b[]= {1,2,3};
		assertArrayEquals(b, a);
		
	}
	
	
}
