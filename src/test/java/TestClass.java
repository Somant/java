import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.test.Calculation;

public class TestClass {

	Calculation obj = new Calculation();

	@Test
	public void adder() {
		assertEquals(4, obj.adder(2, 2));
	}
}
