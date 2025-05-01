package course;
public class course {
    int courseId;
    String courseName;
    int credit;
   public course(int courseId , String courseName,int credit){
        this.courseId=courseId;
        this.courseName=courseName;
        this.credit=credit;
    }
    public String getCourseInfo(){
        return ("Course id : "+courseId + ","+ "Course Name  :" + courseName + ","+ "Credit : "+credit+ ","+"\n"); 
    }
}
