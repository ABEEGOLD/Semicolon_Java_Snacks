import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class SubtractTest{

	@Test
	public void testThatSubtractionSubtractsTwoDigits(){
	
	//Given

	int a = 10;
	int b = 5;

	//When
	int expected = Subtraction.subtracts(a,b);
	//Check
	int result = 5;
	assertEquals(result,expected);
	}
}