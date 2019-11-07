public class JobSeeker {
    private String Name;
    private String emailAddress;
    private String phoneNumber;

    public JobSeeker() {
    }

    public JobSeeker(String name, String emailAddress) {
        Name = name;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
