package ee.ubit.simplecalculator;

import org.junit.Test;

import ee.ubit.simplecalculator.SimpleCalculator.numberButtonAction;


public class SimpleCalculatorTest{

	SystemClass system;
	SimpleCalculator simpleCalculator;
	numberButtonAction numberButtonAction;
	
	@Test
	public void test()
	{
		com.shazam.gwen.Gwen.given(simpleCalculator);
		com.shazam.gwen.Gwen.when(numberButtonAction).actionPerformed();
		com.shazam.gwen.Gwen.then(system).doSomething();
	}
	
}