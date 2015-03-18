package Test;
import BusinessLayer.*;

import static org.junit.Assert.*;

import org.junit.Test;

import BusinessLayer.Order;
import DBLayer.*;

public class OrderTest {

	@Test
	public void No_Inputs_In_AddPartOrder() {
		Order order = new Order();
		int expected = 0;
		int actual = order.Add("");
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void One_Input_In_AddPartOrder(){
		Order order = new Order();
		int expected = 1;
		int actual = order.Add("1");
		
		assertEquals(expected, actual);
	}
}

//hejsimon