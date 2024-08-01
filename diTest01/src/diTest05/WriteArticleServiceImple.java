package diTest05;

public class WriteArticleServiceImple {

  private MySqlArticleDAO dao;
  
  public WriteArticleServiceImple(MySqlArticleDAO dao) {
    this.dao = dao;
  }
  public void pro() {
    dao.insert();
  }
}
