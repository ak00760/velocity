package TestNGBasics;
import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
String str1="Hello";
String str2="Hi";
@Test
public void Test1() {
	Assert.assertEquals(str1, "Hi");
	System.out.println("str1");
}
public void Tests1() {
	Assert.assertEquals(str2, "Hi");
	System.out.println("str2");
}
//@Test
//public void Test2() {
//	Assert.assertNotEquals("str1", "str2");
//}
//@Test
//public void Test3() {
//	Assert.assertTrue(rv.isSelected());
//	Assert.assertTrue(rv.isDisplayed());
//	Assert.assertTrue(rv.isEnabled());
//	}
//@Test
//public void Test4() {
//	Assert.assertNotNull("str1");
//}
//@Test
//public void Test5() {
//	Assert.assertNull("str1");
//}
//@Test
//public void Test6() {
//	Assert.fail();
//}

}
