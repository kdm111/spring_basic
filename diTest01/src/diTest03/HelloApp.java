package diTest03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloApp {
  public static void main(String[] args) {
    // 스프링 컨테이너가 제공하는 주입을 사용하기 위해 설정함.
    // 스프링 환경변수 파일을 읽어들임.
    ApplicationContext context = new ClassPathXmlApplicationContext("diTest03/beans.xml");
    MessageBean bean = (MessageBean) context.getBean("messageBean");
    bean.sayHello("ssss");
    
  }
}
