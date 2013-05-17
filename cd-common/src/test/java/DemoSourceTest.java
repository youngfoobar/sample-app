import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.xebia.cd.demo.DemoSource;

public class DemoSourceTest {

	@Test
	public void testReadData() {
		assertEquals("hello Xebia", new DemoSource().readData());
	}
}
