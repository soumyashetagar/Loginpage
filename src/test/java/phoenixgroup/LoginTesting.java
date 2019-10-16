package phoenixgroup;

import com.phoenix.servlet.Login;

import junit.framework.TestCase;

public class LoginTesting extends TestCase {
	
	public void test() {
		Login l=new Login();
		String output =l.Test("admin", "admin");
		assertEquals("success",output);
		
	}

}
