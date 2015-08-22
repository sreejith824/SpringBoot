package tcs.com.firstgradle.helloworld;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

import com.tcs.firstgradle.helloworld.impl.HelloworldImpl;


public class HelloworldTest {

	@Test
	public void testSuccess() {
		HelloworldImpl helloworld = new HelloworldImpl();
		assertEquals("Success",  helloworld.sayHelloworld());
	}
	@Ignore
	@Test
	public void testFailure() {
		HelloworldImpl helloworld = new HelloworldImpl();
		assertEquals("", helloworld.sayHelloworld());
	}

}
