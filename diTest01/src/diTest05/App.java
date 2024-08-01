package diTest05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
  public static void main(String[] args) {
    // diTest05/beans.xml이라는 스프링 환경변수 파일을 불러옴.
    ApplicationContext context = new ClassPathXmlApplicationContext("diTest05/beans.xml");
    WriteArticleServiceImple service = (WriteArticleServiceImple) context.getBean("ws");
    service.pro();
    
  }
}
