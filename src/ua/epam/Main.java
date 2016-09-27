package ua.epam;

public class Main {

    public static void main(String[] args) {
	    EmployeeEPAM smith = new EmployeeEPAM("John", "Smith", 30, "mathematician", "not married");
        EmployeeEPAM smit = new EmployeeEPAM("John", "Smith", 30, "mathematician", "married");
        EmployeeRD adams = new EmployeeRD("Jack", "Adams", 31, "physicist", "married", Course.JavaDevelopment);
        EmployeeRD adam = new EmployeeRD("Jack", "Adams", 31, "physicist", "married", Course.JavaDevelopment);

        boolean isEquals1 = adams.equals(adam);

        boolean isEquals2 = smith.equals(smit);

        boolean isEquals3 = smith.equals(adams);



    }
}
