/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */

import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author User
 */
@Named(value = "tableBean")
@Dependent
public class TableBean {
   
    private List<Student> students;
    
    public TableBean(){
        students = new ArrayList<>();
        students.add(new Student("Robert", "Lewandowski", 3.40));
        students.add(new Student("Marcin", "Pudzianowski", 3.34));
        students.add(new Student("Karol", "Wojtyla", 4.09));
        students.add(new Student("Robert", "Maklowicz", 3.32));
    }

    /**
     * @return the students
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * @param students the students to set
     */
    public void setStudents(List<Student> students) {
        this.students = students;
    }
     
}
