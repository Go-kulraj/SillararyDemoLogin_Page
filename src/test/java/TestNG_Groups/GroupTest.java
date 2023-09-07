package TestNG_Groups;

import org.testng.annotations.Test;

public class GroupTest {
	@Test(groups="smoke")
	public void demo1() {
		System.out.println("Ji Sample 1");
	}
@ Test
public void demo2() {
	System.out.println("Ji sample 2");
}
}
