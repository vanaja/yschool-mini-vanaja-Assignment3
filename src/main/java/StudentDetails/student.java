/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentDetails;

import java.util.Date;

/**
 *
 * @author Vanaja
 */
public class student {
    
    private String studentName;
    private String grade;
    private String subject;
    private int marks;

    /**
     * @return the studentName
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * @param studentName the studentName to set
     */
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    /**
     * @return the grade
     */
    public String getGrade() {
        return grade;
    }

    /**
     * @param grade the grade to set
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }

    /**
     * @return the subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * @param subject the subject to set
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * @return the marks
     */
    public int getMarks() {
        return marks;
    }

    /**
     * @param marks the marks to set
     */
    public void setMarks(int marks) {
        this.marks = marks;
    }

    public student(String studentName, String grade, String subject, int marks) {
        this.studentName = studentName;
        this.grade = grade;
        this.subject = subject;
        this.marks = marks;
    }

    public student() {
    }
     
    
}
