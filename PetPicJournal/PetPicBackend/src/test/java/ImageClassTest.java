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
import com.entity.ImageClassEntity;
import com.entity.LoginUserEntity;
import com.service.ImageClassService;
import com.service.LoginUserService;

import junit.framework.Assert;

public class ImageClassTest {
	


//	
//	@Test
//	public void test() {
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
//		ImageClassService co = (ImageClassService) context.getBean("imageclassService");
//		ImageClassEntity l = co.selectById(1);
//		
//        assertEquals(l.getId(), null);
//	}
	
	@Test
	public void test1() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
		ImageClassService co = (ImageClassService) context.getBean("imageclassService");
		ImageClassEntity l = co.selectById(11);
		
        assertEquals(l, null);
	}

    

}
