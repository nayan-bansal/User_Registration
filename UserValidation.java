package UserRegValidation;

import static org.junit.Assert.*;
import org.junit.Test;

public class Validation {

	private String Input;
	private boolean Output;
	private Registration eMailChecker;
	@Before
	public void initialize() {
		eMailChecker=new Registration();
	}
	public MultipleEntryTest(String Input,boolean Output) {
		this.Input=Input;
		this.Output=Output;
	}
	@Parameterized.Parameters
	public static Collection eMails() {
		return Arrays.asList(new Object [][] {{"abc@yahoo.com",true},{"abc@com",false},{"abc@1.com",true}});
	}
	@Test
	public void testMultipleEntryTest() {
		//fail("Not yet implemented");
		System.out.println("Input: "+Input);
		assertEquals(Output,Registration.eMailCheck(Input));
	}
}