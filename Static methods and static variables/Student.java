// This is a java practise

public class Student{
    private String name;
    private String studentID;
    private double marks;
    public static int studentCount = 0;

    public Student(String name, String studentID, double marks){ //}, int studentCount){
        this.name  = name;
        this.studentID = studentID;
        this.marks = marks;
        studentCount++;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getStudentID(){
        return studentID;
    }

    public void setStudentID(String studentID){
        this.studentID = studentID;
    }

    public double getMarks(){
        return marks;
    }

    public void setMarks(double marks){
        this.marks = marks;
    }

    public static int displayStudentCount(){
        // if (studentCount >= 0){
        //     studentCount++;
        // }
        return studentCount;
    }

    public String displayDetails(){
        return "Name: "+name+", Student ID: "+studentID+", Marks: "+marks;
    }

}