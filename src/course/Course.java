package course;

import java.util.Arrays;

public class Course {
    private String courseName;
    private int courseNumber;
    private String courseTeacher;
    private String[] courseGroups;


    public Course() {
    }

    public Course(String courseName, int courseNumber, String courseTeacher, String[] courseGroups) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
        this.courseTeacher = courseTeacher;
        this.courseGroups = courseGroups;
    }

    public String getCourseName() { return courseName;    }

    public void setCourseName(String courseName) {  this.courseName = courseName;    }

    public int getCourseNumber() {        return courseNumber;    }

    public void setCourseNumber(int courseNumber) {        this.courseNumber = courseNumber;    }

    public String getCourseTeacher() {        return courseTeacher;    }

    public void setCourseTeacher(String courseTeacher) {        this.courseTeacher = courseTeacher;    }

    public String[] getCourseGroups() {        return courseGroups;    }

    public void setCourseGroups(String[] courseGroups) {        this.courseGroups = courseGroups;    }


    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", courseNumber=" + courseNumber +
                ", courseTeacher='" + courseTeacher + '\'' +
                '}';
    }
    public String mCourseGroups(){
        return Arrays.toString(courseGroups);
    }
}
