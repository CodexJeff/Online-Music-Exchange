public class User {
  private String     userName;
  private boolean    online;
  
  public User()  { this(""); }
  
  public User(String u)  {
    userName = u;
    online = false;
  }
  
  public String getUserName() { return userName; }
  public boolean isOnline() { return online; }
  
  public String toString()  {
    String s = "" + userName + ": XXX songs (";
    if (!online) s += "not ";
    return s + "online)";
  }
}
