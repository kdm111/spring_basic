package diTest11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context 
		= new ClassPathXmlApplicationContext("diTest11/beans.xml");
		DataSource ds = (DataSource)context.getBean("ds");
		ds.info();
	}
}