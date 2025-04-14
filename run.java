import student.student;
import course.course;
import enrollement.Enrollment;
public class run {
    public static void main(String[] args) {
        student student1 = new student(101, 20, "Alice Johnson");
        course course1 = new course(201, "Java Programming", 4); 
        Enrollment enrollment1 = new Enrollment(student1, course1);       
        System.out.println(enrollment1.getEnrollmentInfo());
    }
}
