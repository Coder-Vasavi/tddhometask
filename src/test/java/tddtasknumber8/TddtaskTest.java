package tddtasknumber8;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TddtaskTest
{
	@Test        
	public void testupdate_string()
	{
		Tddtask obj1=new Tddtask();
		assertEquals("Output String is : ","BCDAC",obj1.update_string("ABCDAC"));
	}
	@Test      
	public void test1update_string()
	{
		Tddtask obj2=new Tddtask();
		assertEquals("Output String is : ","BBGCV",obj2.update_string("BBGCV"));
	}
	@Test
	public void test2update_string()
	{
		Tddtask obj3=new Tddtask();
		assertEquals("Output String is : ","",obj3.update_string(""));
	}
	@Test
	public void test3update_string()
	{
		Tddtask obj4=new Tddtask();
		assertEquals("Output String is : ","",obj4.update_string("AA"));
	}
	@Test
	public void test4update_string()
	{
		Tddtask obj5=new Tddtask();
		assertEquals("Output String is : ","",obj5.update_string("A"));
	}
	@Test
	public void test5update_string()
	{
		Tddtask obj6=new Tddtask();
		assertEquals("Output String is : ","B",obj6.update_string("B"));
	}
	@Test
	public void test6update_string()
	{
		Tddtask obj7=new Tddtask();
		assertEquals("Output String is : ","CFS",obj7.update_string("AACFS"));
	}

}


