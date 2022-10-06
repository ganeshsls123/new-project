package junittest1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestJunit {
@Before
public void beforeCase() {
	System.out.println("welcome");
}
@Test
public void testCase() {
	System.out.println("this is test case");
}
@After
public void afterCase() {
	System.out.println("thank you");
}
}
