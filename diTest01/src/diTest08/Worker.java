package diTest08;

public class Worker {
  private String name;
  private int age;
  
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getAge() {
    return age;
  }
  public void setAge(int age) {
    this.age = age;
  }
  public Worker() {
    
  }
  public Worker(String name, int age) {
    super();
    this.name = name;
    this.age = age;
  }
  @Override
  public String toString() {
    return "Worker " + this.name + " " + this.age;
  }
}
