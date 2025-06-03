import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
public class HighestSecond {

@Test
public void CheckTheArrayOfSecondLargestNumber() {
highestSecondNumber high = new highestSecondNumber();
int[] input = {9,6,8,11,12};
int[] highest = high.highestSecondNumber(input);
int[] result = {11};
assertArrayEquals(result,highest);

   }

}