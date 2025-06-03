import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestMath {
	@Test
	public void testThatAddFunctionExists() {
		Math mat = new Math();
		mat.add(1,2);
	}

	@Test
	public void testAddFunctionReturnsCorrectAnswer() {
		Math mat = new Math();
		int actual = mat.add(1,2);
		int expected = 3;
		assertEquals(actual, expected);
	}

	@Test
	public void testArgumentsAreNegative() {
		Math mat = new Math();
		int actual = mat.add(-1,-2);
		int expected = 0;
		assertEquals(actual, expected);
	}
}