/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

import StudentDetails.student;
import StudentDetails.studentDB;
import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "studentManagedBean")
@RequestScoped
public class studentManagedBean implements Serializable{

    private static final long serialVersionUID = 1L;
    private List<student> users;
    private String message;
    private student createStudent;
    
    public studentManagedBean() {
        createStudent=new student();
        System.out.println("Data Loaded");
        users =studentDB.getUsers();
    }

    /**
     * @return the createStudent
     */
    public student getCreateStudent() {
        return createStudent;
    }

    /**
     * @param createStudent the createStudent to set
     */
    public void setCreateStudent(student createStudent) {
        this.createStudent = createStudent;
    }

    /**
     * @return the users
     */
    public List<student> getUsers() {
        return users;
    }

    /**
     * @param users the users to set
     */
    public void setUsers(List<student> users) {
        this.users = users;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }
    
    public void prepareCreate() {
        studentDB.addStudent(getCreateStudent());
        System.out.println("Successfully added!!");
         FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_INFO, "User successfully inserted.", null));
    }  
    
}
