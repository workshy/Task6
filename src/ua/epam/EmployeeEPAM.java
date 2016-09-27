package ua.epam;

/**
 * Created by Viktoriia_Marynchak on 9/19/2016.
 */
public class EmployeeEPAM {
    private String firstname;
    private String lastName;
    private int age;
    private String education;
    private String maritalStatus;

    public EmployeeEPAM(String firstname, String lastName, int age, String education, String maritalStatus) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.age = age;
        this.education = education;
        this.maritalStatus = maritalStatus;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmployeeEPAM that = (EmployeeEPAM) o;

        if (age != that.age) return false;
        if (firstname != null ? !firstname.equals(that.firstname) : that.firstname != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        if (education != null ? !education.equals(that.education) : that.education != null) return false;
        return maritalStatus != null ? maritalStatus.equals(that.maritalStatus) : that.maritalStatus == null;

    }

    @Override
    public int hashCode() {
        int result = firstname != null ? firstname.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + (education != null ? education.hashCode() : 0);
        result = 31 * result + (maritalStatus != null ? maritalStatus.hashCode() : 0);
        return result;
    }
}
