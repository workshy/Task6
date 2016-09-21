package ua.epam;

/**
 * Created by Viktoriia_Marynchak on 9/19/2016.
 */
public class EmployeeRD extends EmployeeEPAM {
    protected Course course;

    public EmployeeRD(String firstname, String lastName, int age, String education, String maritalStatus, Course course) {
        super(firstname, lastName, age, education, maritalStatus);
        this.course = course;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        EmployeeRD that = (EmployeeRD) o;

        return course == that.course;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (course != null ? course.hashCode() : 0);
        return result;
    }
}
