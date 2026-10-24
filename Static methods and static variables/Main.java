public class Main{
    public static void main(String[] args){
        Student student = new Student("Lwando Lusiki", "LSKLWA001", 69.03); //, 1);

        System.out.println(student.displayDetails()+". And also the count is: "+Student.displayStudentCount());

        // Student studen = new Student("Lwando Lusiki", "LSKLWA001", 69.03);

        // System.out.println(studen.displayDetails()+". And also the count is: "+Student.displayStudentCount());
    }
}