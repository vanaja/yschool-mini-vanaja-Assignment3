/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentDetails;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Vanaja
 */
public class studentDB {
    private final static List<student> users;
	
	static{
		student ananthan = new student( "Ananthan", "2", "Maths",85);
		student tharsan = new student("Tharsan", "3", "Science",90);
		student sekar = new student("Sekar", "2", "Maths",56);
		student ramesh = new student( "Ramesh", "8", "Tsmil", 86);
		student raman = new student("Raman","9", "History",96);
		student kannan = new student( "Kannan", "11", "Religion",89);
		
		users = new ArrayList<student>();
		users.add(ananthan);
		users.add(tharsan);
		users.add(sekar);
		users.add(ramesh);
		users.add(raman);
		users.add(kannan);
	}
	
	/*private static Date getDate(int date, int month, int year){
		Calendar cal = Calendar.getInstance();
		cal.set(year, month, date, 0,0,0);
		return cal.getTime();
	}*/
	
	public static void addStudent(student user){
            student u=new student();
            u.setStudentName(user.getStudentName());            
            u.setGrade(user.getGrade());
            u.setSubject(user.getSubject());
            u.setMarks(user.getMarks());
            users.add(user);
	}
	
	/*public static void updateUser(student user){
            for(student u : users){
                if(u.getId() == user.getId()){
                    u.setName(user.getName());
                    u.setDateOfBirth(user.getDateOfBirth());
                    u.setAddress(user.getAddress());
                }
            }
	}*/
	
	public static void deleteUser(){
		
	}
	
	public static List<student> getUsers(){
		return users;
	}
    
}

