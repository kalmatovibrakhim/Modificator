import course.Course;
import group.Group;
import student.Student;

import java.sql.Array;

public class Main {
    public static void main(String[] args) {
        Student student1= new Student("aman","asanov",1996,"aman@mail.ru");
        Student student2=new Student("azat","azatov",1997,"azat@mail.ru");
        Student student3=new Student("esen","esenov",1997,"esen@mail.ru");
        Student student4=new Student("uson","usonov",1998,"uson@mail.ru");
        System.out.println(student1);

        Group group1=new Group("java",2022,new String[]{student1.mStudent(),student2.mStudent()});
        Group group2=new Group("javascript",2022,new String[]{student2.mStudent(),student3.mStudent()});
        System.out.println(group1);

        Course course =new Course("Programing",4,"Nurperi",new String[]{group1.groupStudents(),group2.groupStudents()});
        System.out.println(course);
        System.out.println(course.mCourseGroups());


    }
}