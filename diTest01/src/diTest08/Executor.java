package diTest08;

public class Executor {

  private Worker worker;
  private String runner;

  public Worker getWorker() {
    return worker;
  }
  public void setWorker(Worker worker) {
    this.worker = worker;
  }
  public String getRunner() {
    return runner;
  }
  public void setRunner(String runner) {
    this.runner = runner;
  }
  public Executor() {
    
  }
  public Executor(Worker worker) {
    super();
    this.worker = worker;
    System.out.println("생성자 1");
  }
  public Executor(String runner) {
    super();
    this.runner = runner;
    System.out.println("생성자 2");

  }
  public void execute() {
    System.out.println("다음에 의해 동작함");
    if (worker != null) {
      System.out.println(worker);
    } else {
      System.out.println(runner);
    }

  }
}