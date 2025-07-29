package collectionDemo;


import java.util.ArrayList;
import java.util.List;

class Student{

    String name;
    String course;
    int id;

    public Student(String name, String course, int id) {
        this.name = name;
        this.course = course;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", id=" + id +
                '}';
    }
}
public class CustomList {
    public static void main(String[] args) {

        List<Student> studentList=new ArrayList<>();
        Student s1=new Student("Abhishek","DSA",1);
        Student s2=new Student("shivam","C#",2);
        Student s3=new Student("lekh","Math",3);
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

        System.out.println(studentList);
    }
}
