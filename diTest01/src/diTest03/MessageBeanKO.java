package diTest03;

public class MessageBeanKO implements MessageBean{
  @Override
  public void sayHello(String name) {
    System.out.println("안녕! " + name);
  }
}
