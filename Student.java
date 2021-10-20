public class Student {

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

public String name()

{
    String nameOfStudent = "Abhishek";
    System.out.println("The name of the student is : - "+ nameOfStudent);
    return nameOfStudent;
}
    

public static void main(String[] args) 

{
  Student student = new Student();
  String nm = student.name();
  System.out.println("my name - " +nm);
}


}
