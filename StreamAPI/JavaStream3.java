package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class JavaStream3 {

    public static void main(String[] args) {
        Student vishal = new Student(1, "Vishal Talekar", 96658, 26);
        Student vijay = new Student(2, "Vijay Talekar", 97663, 24);

        List<Student> studentList = Arrays.asList(vishal, vijay);

        Stream<Student> stream = studentList.stream();

        stream.forEach(student -> System.out.println(student));

        //stream.forEach(System.out::println);
    }
}

class Student {

    private int studentId;

    private String studentName;

    private int mobileNumber;

    private int age;

    public Student(int studentId, String studentName, int mobileNumber, int age) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.mobileNumber = mobileNumber;
        this.age = age;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", mobileNumber=" + mobileNumber +
                ", age=" + age +
                '}';
    }
}
