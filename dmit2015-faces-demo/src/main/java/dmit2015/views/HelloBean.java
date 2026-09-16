package dmit2015.views;

// Dependency to make NAMED and REQUESTSCOPED usable

import jakarta.enterprise.context.RequestScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Named;

// links the code with the xhtml page
@Named
// gives the lifetime of the JAVA Object on the page ... This gives 1 life jajaj
@RequestScoped

public class HelloBean {

    private String userInput;

    public String getUserInput() {
        return userInput;
    }

    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }

    public String getMessage() {
        return "Hello, " + userInput;
    }

    public String onSubmit() {
        FacesContext.getCurrentInstance().addMessage(null,new FacesMessage("FacesMessage from Java part " + userInput));
        // userInput = null;
        return null;
    }

}
