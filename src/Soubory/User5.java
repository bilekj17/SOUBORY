package Soubory;

public class User5 {
    private String loginEmail;
    private int identifier;
    private String onetimePassword;
    private String recoveryCode;
    private String firstname;
    private String lastname;
    private String department;
    private String location;
    public User5(String text) {
        String[]  split = text.split(";");
        loginEmail = split[0];
        identifier = Integer.parseInt(split[1]);
        onetimePassword =  split[2];
        recoveryCode = split[3];
        firstname =   split[4];
        lastname =    split[5];
        department =  split[6];
        location =   split[7];
    }

    public int getIdentifier() {
        return identifier;
    }

    public String getOnetimePassword() {
        return onetimePassword;
    }

    public String getLastname() {
        return lastname;
    }
}
