package student;
public class student{
    int studentId;
    String name;
    int age;
    public student(int studentId,int age,String name){
        this.studentId = studentId;
        this.age = age;
        this.name = name;
    }
    public String getStudentInfo(){  
        return ("Name : "+ name + ","+ " Age : " + age+ "," + " Student id: " + studentId + ","+ "\n");
    }
}
