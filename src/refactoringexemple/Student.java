/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactoringexemple;

import java.util.Date;

/**
 *
 * @author 1795823
 */
public class Student extends Personne{
    String student_id;
    String lastname;
    String firstName;
    Date dateBirth;
    
    
    public Student (String n, String p, Date d){
        this.lastname= n;
        this.firstName= p;
        this.dateBirth= d;
        this.student_id = createStudentId(n, p ,d);
    }
    public String createStudentId (String lName, String fName, Date date){
        String end = concatDate(date);
        return lName.substring(0, 3) + fName.charAt(0)+ end;
        
    }
    private String concatDate (Date date){
        return student_id;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }
    public void isSuperviseBy (Professor professor){
        professor.students.add(this);
    }
}

