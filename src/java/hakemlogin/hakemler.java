
package hakemlogin;

public class hakemler {
    private String username;
    private String password;
public hakemler( String username, String password) {
 
 this.username = username;
 this.password = password;
 
 }
    /**
     * @return the kullanici
     */
    public String gethakem() {
        return username;
    }

    /**
     * @param username the kullanici to set
     */
    public void sethakem(String username) {
        this.username = username;
    }

    /**
     * @return the sifre
     */
    public String getSifre() {
        return password;
    }

    /**
     * @param password the sifre to set
     */
    public void setSifre(String password) {
        this.password = password;
    }
}
