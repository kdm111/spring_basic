package diTest02;

public class MessageBeanEN implements MessageBean{
  @Override
  public void sayHello(String name) {
    System.out.println("HELLO! " + name);
  }
}
