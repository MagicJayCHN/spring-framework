import com.wsj.config.AnnotationConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BasicTest {

	@Test
	public void test(){


		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AnnotationConfig.class);


		ac.close();

	}




	@Test
	public void test2() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("myTestApplicationContext.xml", getClass());


		AnnotationConfig bean1 = (AnnotationConfig) context.getBean("annotationConfig");
		System.out.println(bean1);

		context.stop();

		context.close();
	}


}