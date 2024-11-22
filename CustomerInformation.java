package ja7.airplaneticketsreservation;

public class CustomerInformation {

    private String UserName;
    private String EmailAddres;
    private String DateOfBirth;
    private int UserNumber;
    private int PersonalID;

    public CustomerInformation() {}

    public CustomerInformation(String UserName, String EmailAddres, String DateOfBirth, int UserNumber, int PersonalID) {
        this.UserName = UserName;
        this.EmailAddres = EmailAddres;
        this.DateOfBirth = DateOfBirth;
        this.UserNumber = UserNumber;
        this.PersonalID = PersonalID;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getEmailAddres() {
        return EmailAddres;
    }

    public void setEmailAddres(String EmailAddres) {
        this.EmailAddres = EmailAddres;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

    public int getUserNumber() {
        return UserNumber;
    }

    public void setUserNumber(int UserNumber) {
        this.UserNumber = UserNumber;
    }

    public int getPersonalID() {
        return PersonalID;
    }

    public void setPersonalID(int PersonalID) {
        this.PersonalID = PersonalID;
    }
}
