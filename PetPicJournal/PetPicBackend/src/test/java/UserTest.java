import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import javax.servlet.http.HttpUtils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;

import com.controller.LoginUserController;
import com.entity.LoginUserEntity;
import com.service.LoginUserService;

import junit.framework.Assert;

public class UserTest {
	


//	
//	@Test
//	public void test() {
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
//		LoginUserService co = (LoginUserService) context.getBean("userService");
//		LoginUserEntity l = co.selectById(1);
//		
//        assertEquals(l.getName(), null);
//	}
	
	@Test
	public void test1() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
		LoginUserService co = (LoginUserService) context.getBean("userService");
		LoginUserEntity l = co.selectById(11);
		
        assertEquals(l.getName(), "Full Name1");
	}

    

}
