package pack;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class Testadd {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void sum()
	{
		add obj=new add(9,2);
		Assert.assertEquals(7,obj.addition(3,4));
		
	}
}
