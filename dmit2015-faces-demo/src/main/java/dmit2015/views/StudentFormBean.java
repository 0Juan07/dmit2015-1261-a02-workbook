package dmit2015.views;

import dmit2015.model.StudentInfo;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Named;
import org.omnifaces.cdi.ViewScoped;

import java.io.Serializable; //Jakarta face card, this lets the program know we are using ViewScope

@Named
@ViewScoped // This would give a life for the JAVA Object for the page lifetime

// implements Serializable is required for the ViewScope
public class StudentFormBean implements Serializable {

    private int submissionCount = 0;

    public int getSubmissionCount() {
        return submissionCount;
    }

    private StudentInfo studentInfo = new StudentInfo();

    public StudentInfo getStudentInfo() {
        return studentInfo;
    }

    public void setStudentInfo(StudentInfo studentInfo) {
        this.studentInfo = studentInfo;
    }

    public void onSubmit() {
        submissionCount++;

        FacesMessage message = new FacesMessage(
                FacesMessage.SEVERITY_INFO, "Form Submitted: ",
                String.format("Welcome %s to %s program (%s)", studentInfo.getFullName(), studentInfo.getProgram(), studentInfo.isFullTime() ? "Full time" : "Part Time"));

        FacesContext.getCurrentInstance().addMessage(null, message);

        studentInfo = new StudentInfo();

    }

}
