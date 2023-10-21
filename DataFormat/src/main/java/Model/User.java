
package Model;


public class User {
    protected String PHONE_VALID = "^[0-9]{10}$";
    protected String EMAIL_VALID = "^[A-Z0-9a-z._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}$";

    public User() {
    }

    public String getPHONE_VALID() {
        return PHONE_VALID;
    }

    public void setPHONE_VALID(String PHONE_VALID) {
        this.PHONE_VALID = PHONE_VALID;
    }

    public String getEMAIL_VALID() {
        return EMAIL_VALID;
    }

    public void setEMAIL_VALID(String EMAIL_VALID) {
        this.EMAIL_VALID = EMAIL_VALID;
    }
    
    
}
