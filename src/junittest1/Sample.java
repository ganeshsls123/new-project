package junittest1;

import org.junit.Test;

public class Sample {
	ArithmeticOperations ao=new ArithmeticOperations();
	@Test
	public void testAdd() {
		ao.add();
	}
	@Test
	public void testSub() {
		ao.sub();
	}
	@Test
	public void testMul() {
		ao.mul();
	}
	@Test
	public void testDiv() {
		ao.div();
	}
}
