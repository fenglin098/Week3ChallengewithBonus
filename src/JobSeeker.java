public class JobSeeker {
    private String fName;
    private String lName;
    private String emailAddress;

    public JobSeeker() {
    }

    public JobSeeker(String fName, String lName, String emailAddress) {
        this.fName = fName;
        this.lName = lName;
        this.emailAddress = emailAddress;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
