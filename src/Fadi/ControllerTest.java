package Fadi;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ControllerTest {

	Controller controller;
	ViewOfCalculator view;
	Model model;

	@Before
	public void setUp() throws Exception {
		controller = new Controller();
		view = new ViewOfCalculator();
		model = new Model();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void addTest() {
		boolean x = (Double.parseDouble(controller.model.add(5.5, 3)) == 8.5) ;
		assert(x);
	}
	
	@Test
	public void subtractTest() {
		boolean x = (Double.parseDouble(controller.model.subtract(6, 2)) == 4);
		assert(x);
	}
	
	@Test
	public void multiplyTest() {
		boolean x = (Double.parseDouble(controller.model.multiply(5.5, 2)) == 11);
		assert(x);
	}
	
	@Test
	public void divideTest1() {
		boolean x = (Double.parseDouble(controller.model.divide(10, 4)) == 2.5);
		assert(x);
	}
	
	@Test
	public void divideTest2() {
		controller.model.divide(3, 0);
	}
	
	@Test
	public void modTest1() {
		boolean x =  (Double.parseDouble(controller.model.mod(10, 4)) == 2);
		assert(x);
	}
	
	@Test
	public void modTest2() {
		controller.model.mod(3, 0);
	}
	
	@Test
	public void squareRootTest1() {
		boolean x = (Double.parseDouble(controller.model.squareRoot(4)) == 2);
		assert(x);
	}
	
	@Test
	public void squareRootTest2() {
		controller.model.squareRoot(-4);
	}
	
}
