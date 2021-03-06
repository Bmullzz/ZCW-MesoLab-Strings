package mullin.brian;

import java.util.ArrayList;

/**
 * Created by brianmullin on 5/20/17.
 */
public class DriversLicense {

    private String lastName;
    private String firstName;
    private String streetAddress;
    private String state;
    private String licenseNumber;
    private String dateOfBirth;
    private String issueDate;
    private String expirationDate;
    private String sex;
    private String eyeColor;
    private String height;
    private String organDonor;
    private String licenseClass;

    public DriversLicense(String lastName, String firstName, String streetAddress,
                          String state, String licenseNumber, String dateOfBirth,
                          String issueDate, String expirationDate, String sex,
                          String eyeColor, String height, String organDonor, String licenseClass) {

        this.lastName = lastName;
        this.firstName = firstName;
        this.streetAddress = streetAddress;
        this.state = state;
        this.licenseNumber = licenseNumber;
        this.dateOfBirth = dateOfBirth;
        this.issueDate = issueDate;
        this.expirationDate = expirationDate;
        this.sex = sex;
        this.eyeColor = eyeColor;
        this.height = height;
        this.organDonor = organDonor;
        this.licenseClass = licenseClass;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getState() {
        return state;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public String getSex() {
        return sex;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public String getHeight() {
        return height;
    }

    public String getOrganDonor() {
        return organDonor;
    }

    public String getLicenseClass() {
        return licenseClass;
    }

    public static String getCSVHeader(){
        return "LAST_NAME,FIRST_NAME,ADDR,STATE,LICENSE_NUMBER,D.O.B.,ISS_D,EXP_D,SEX,EYES,HGT,ORGANDONOR,CLASS\n";
    }

    public static String serializeToCSV(ArrayList<DriversLicense> list){

        StringBuilder result = new StringBuilder(1000);
        result.append(getCSVHeader());
        DriversLicense currentLicense;
        for (int i = 0; i < list.size(); i++){
           currentLicense = list.get(i);
           result.append(currentLicense.serializeThis());
        }

        return result.toString();
    }

    public String serializeThis(){

        StringBuilder result = new StringBuilder(1000);
        result.append(getLastName());
        result.append(",");
        result.append(getFirstName());
        result.append(",");
        result.append(getStreetAddress());
        result.append(",");
        result.append(getState());
        result.append(",");
        result.append(getLicenseNumber());
        result.append(",");
        result.append(getDateOfBirth());
        result.append(",");
        result.append(getIssueDate());
        result.append(",");
        result.append(getExpirationDate());
        result.append(",");
        result.append(getSex());
        result.append(",");
        result.append(getEyeColor());
        result.append(",");
        result.append(getHeight());
        result.append(",");
        result.append(getOrganDonor());
        result.append(",");
        result.append(getLicenseClass());
        result.append("\n");
        return result.toString();
    }

}
