import java.util.Scanner;
/**
 * Write a java program to find the odd composite numbers
 * between 2 and n where n is given as an input.
 *
 * @author : SupriyaMadupathi
 */
class StudentDetails {
    String student;
    String rollno;
    double m1;
    double m2;
    double m3;
    public StudentDetails(String student, String rollno, double m1, double m2, double m3) {
    this.student  = student;
    this.rollno = rollno;
    this.m1 = m1;
    this.m2 = m2;
    this.m3 = m3;
    }
    public double GPA() {
        return (m1 + m2 + m3) / 3;
    }

    public static void main(String[] args) {
        StudentDetails s1 = new StudentDetails("sandhya", "6024", 7.5, 7.0, 8.0);
        System.out.println(s1.GPA());
        StudentDetails s2 = new StudentDetails("sam", "6025", 8.5, 6.0, 7.5);
        System.out.println(s2.GPA());
        StudentDetails s3 = new StudentDetails("sandy", "6026", 7.5, 8.0, 9.0);
        System.out.println(s3.GPA());
    }
}


