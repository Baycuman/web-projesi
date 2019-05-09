package editorlogin;

public class edıtorler {
    private String username;
    private String password;
public edıtorler( String username, String password) {
 
 this.username = username;
 this.password = password;
 
 }
    
    public String getedıtor() {
        return username;
    }

  
    public void setedıtor(String username) {
        this.username = username;
    }

 
    public String getSifre() {
        return password;
    }

    public void setSifre(String password) {
        this.password = password;
    }
}
