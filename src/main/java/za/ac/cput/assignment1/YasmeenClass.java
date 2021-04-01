/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.ac.cput.assignment1;

/**
 *
 * @author Killa-Bee
 */
public class YasmeenClass {

     private String age, name, student;
     
     public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "YasmeenClass{" + "age= " + age + ", name =" + name + ", student=" + student + '}';
    }
    
    
}
