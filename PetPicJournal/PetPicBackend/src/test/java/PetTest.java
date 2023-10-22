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
import com.entity.PetImageEntity;
import com.service.LoginUserService;
import com.service.PetImageService;

import junit.framework.Assert;

public class PetTest {
	

    

	
//	@Test
//	public void test() {
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
//		PetImageService co = (PetImageService) context.getBean("petImageService");
//		PetImageEntity l = co.selectById(1);
//		
//        assertEquals(l.getPetimage(),null);
//	}
	
	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
		PetImageService co = (PetImageService) context.getBean("petImageService");
		PetImageEntity l = co.selectById(31);
		
        assertEquals(l.getPettitle(),"Photo Title1");
	}
	
//	@Test
//	public void test1() {
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
//		LoginUserService co = (LoginUserService) context.getBean("petImageService");
//		LoginUserEntity l = co.selectById(0);
//		
//        assertEquals(l, null);
//	}

    

}
