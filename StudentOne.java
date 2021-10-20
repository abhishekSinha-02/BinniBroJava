public class StudentOne {

String name;
int rollNo;
int mobNo;
String department;
String fatherName;
String motherName;
String address;
boolean isDayScholar;
boolean isNinePointer;
int totalFees;

public void name()

{
    String nameOfStudent = "Abhishek";
    System.out.println("The name of the student is : - "+ nameOfStudent);
    
}
    

public static void main(String[] args) 

{
  Student student = new Student();
  student.name();
}


}
