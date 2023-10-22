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
import com.entity.ChatEntity;
import com.entity.LoginUserEntity;
import com.entity.PetImageEntity;
import com.service.ChatService;
import com.service.LoginUserService;
import com.service.PetImageService;

import junit.framework.Assert;

public class ChatTest {
	

    

	
//	@Test
//	public void test() {
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
//		ChatService co = (ChatService) context.getBean("chatService");
//		ChatEntity l = co.selectById(1);
//		
//        assertEquals(l.getUserid(),null);
//	}
//	
	@Test
	public void test1() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
		ChatService co = (ChatService) context.getBean("chatService");
		ChatEntity l = co.selectById(31);
		
		assertEquals(l,null);
	}
	
//	@Test
//	public void test1() {
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
//		LoginUserService co = (LoginUserService) context.getBean("petImageService");
//		LoginUserEntity l = co.selectById(11);
//		
//        assertEquals(l.getName(), "Full Name1");
//	}

    

}
