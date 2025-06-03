import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class AdditionTest {
	@Test
	public void testThatICanAddTwoNumbers(){
		//given
		Calculator calculator = new Calculator();
		//when		
		int calculate = calculator.add(25, 5);
		//assert
		assertEquals(30, calculate);	
	}
}