package group;

import java.util.Arrays;

public class Group {
    private String designation;
    private int yearBuild;
    private String[] students;

    public Group() {
    }

    public Group(String designation, int yearBuild, String[] students) {
        this.designation = designation;
        this.yearBuild = yearBuild;
        this.students = students;
    }

    public String getDesignation() {        return designation;    }

    public void setDesignation(String designation) {        this.designation = designation;    }

    public int getYearBuild() {        return yearBuild;    }

    public void setYearBuild(int yearBuild) {        this.yearBuild = yearBuild;    }

    public String[] getStudents() {        return students;    }

    public void setStudents(String[] students) {        this.students = students;    }


    @Override
    public String toString() {
        return "Group{" +
                "designation='" + designation + '\'' +
                ", yearBuild=" + yearBuild +
                '}';
    }

    public String groupStudents(){
        return Arrays.toString(students);
    }
}
