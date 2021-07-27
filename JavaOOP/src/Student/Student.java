package Student;

public class Student {

    public static void main(String[] args){
        Student student = new Student("Marie",24,"Female",071121);
        System.out.println("Name: " + student.getStudentName() + "\nAge: " + student.getStudentAge() + "\nGender: "
        + student.getStudentGender() + "\nStudent ID Number: " + student.getStudentIdNo());
    }
    
    String studentName;
    int studentAge;
    String studentGender;
    long studentIdNo;

    public Student(String studentName, int studentAge, String studentGender, long studentIdNo){
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentGender = studentGender;
        this.studentIdNo = studentIdNo;
    }

    public String getStudentName(){
        return studentName;
    }

    public int getStudentAge(){
        return  studentAge;
    }

    public String getStudentGender() {
        return studentGender;
    }

    public long getStudentIdNo() {
        return studentIdNo;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public void setStudentGender(String studentGender) {
        this.studentGender = studentGender;
    }

    public void setStudentIdNo(long studentIdNo) {
        this.studentIdNo = studentIdNo;
    }


}
