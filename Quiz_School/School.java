import java.util.*;

public class School
{
    private Student student;
    private String school;
    private List<Student> students;

    public School(String school){
        this.school = school;
    }

    public void addStudent(Student student)
    {
        students.add(student);
    }

    public String getName(){
        return school;
    }
    
    public List<Student> getStudents(){
        return students;
    }

    public double getAvgGPA(){
        double totoal = 0;
        for(int studentss = 0; studentss < students.size(); studentss++)
        {
            Student studentn = students.get(studentss);
            totoal += studentn.getGPA();
        }
        double result = totoal / students.size();
        return result;
    }
}