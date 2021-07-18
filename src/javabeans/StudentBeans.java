/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javabeans;

/**
 *
 * @author pintu
 */
public class StudentBeans
{
    public StudentBeans(){}
    
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private String name;
    private String rollno;

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }
}
