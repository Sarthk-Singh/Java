package enrollement;
import student.student;
import course.course;
public class Enrollment {
    private student student;
    private course course;
    public Enrollment(student student, course course) {
        this.student = student;
        this.course = course;
    }

    
    public String getEnrollmentInfo() {
        return student.getStudentInfo() + "\n" +" Enrolled id: "+"\n" + course.getCourseInfo();
    }
}
