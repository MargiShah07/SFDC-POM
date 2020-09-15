//package util;
//
//import java.util.Iterator;
//import java.util.Set;
//
//import org.testng.annotations.Test;
//
//import com.salesforce.test.TestBase;
//public class TestUtil extends TestBase{
//	
//	public static void switchChildWindow()
//	{
//		Set<String> ids = driver.getWindowHandles();
//		Iterator <String> it = ids.iterator();
//		String parentID=it.next();
//		String childID=it.next();
//		driver.switchTo().window(childID);
//	}
//}
