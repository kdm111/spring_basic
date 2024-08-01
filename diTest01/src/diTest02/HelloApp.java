package diTest02;

public class HelloApp {
  public static void main(String[] args) {
    // 여전히 객체를 사용함으로써 일일히 코드를 찾아 고쳐야 한다.
    // MessageBean mb = new MessageBeanEN();
    MessageBean mb = new MessageBeanKO();

    mb.sayHello("enen");
  }
}
