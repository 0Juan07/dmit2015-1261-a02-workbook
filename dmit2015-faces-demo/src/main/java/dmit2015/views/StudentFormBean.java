package dmit2015.views;

import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Named;
import org.omnifaces.cdi.ViewScoped;

import java.io.Serializable; //Jakarta face card, this lets the program know we are using ViewScope

@Named
@ViewScoped // This would give a life for the JAVA Object for the page lifetime

public class StudentFormBean implements Serializable {

    private int submissionCount = 0;
    private String fullName;
    private String program;
    private Boolean fullTime;


    public int getSubmissionCount() {
        return submissionCount;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public Boolean getFullTime() {
        return fullTime;
    }

    public void setFullTime(Boolean fullTime) {
        this.fullTime = fullTime;
    }


    public void onSubmit() {
        submissionCount++;

        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Form Submitted: ", String.format("Welcome %s to %s program (%s)", fullName, program, fullTime ? "Full time" : "Part Time"));

        FacesContext.getCurrentInstance().addMessage(null, message);

        fullName = null;
        program = null;
        fullTime = true;
    }

}
