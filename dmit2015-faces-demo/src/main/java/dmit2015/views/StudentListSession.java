package dmit2015.views;


import dmit2015.model.StudentInfo;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@SessionScoped //Keeps the history from the session of the user
public class StudentListSession implements Serializable {

    private List<StudentInfo> students = new ArrayList<>();

    // This gets the data from the user input
    public List<StudentInfo> getStudents() {
        return students;
    }

    public void add(StudentInfo newStudentInfo) {
        students.add(newStudentInfo);
    }

    public void remove(StudentInfo existingStudentInfo) {
        students.remove(existingStudentInfo);
    }


}
