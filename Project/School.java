package Project;
import java.util.List;

public class School {

	 private List<Teacher> teachers;
	    private List<Student> students;
	    private static int  totalMoneyEarned;
	    private static int totalMoneySpent;

	    
	        //school object is created.
	        //list of teachers in the school.
	        //list of students in the school.
	     
	    public School(List<Teacher> teachers, List<Student> students) {
	        this.teachers = teachers;
	        this.students = students;
	        totalMoneyEarned=0;
	        totalMoneySpent=0;
	    }

	   
	      //list of teachers in the school.
	     
	    public List<Teacher> getTeachers() {
	        return teachers;
	    }

	    
	     //teacher to the school.
	     //the teacher to be added.
	     
	    public void addTeacher(Teacher teacher) {
	        teachers.add(teacher);
	    }

	    
	      //list of students in the school.
	     
	    public List<Student> getStudents() {
	        return students;
	    }

	    
	       //student to the school
	       //student to be added.
	     
	    public void addStudent(Student student) {
	        students.add(student);
	    }

	    
	       //total money earned by the school.
	     
	    public int getTotalMoneyEarned() {
	        return totalMoneyEarned;
	    }

	    
	     //total money earned by the school.
	     //money that is supposed to be  added.
	     
	    public static void updateTotalMoneyEarned(int MoneyEarned) {
	        totalMoneyEarned += MoneyEarned;
	    }

	    //total money spent by the school.
	     
	    public int getTotalMoneySpent() {
	        return totalMoneySpent;
	    }

	    
	       //update the money that is spent by the school which
	       //the salary given by the school to its teachers.
	       //the money spent by school.
	     
	    public static void updateTotalMoneySpent(int moneySpent) {
	        totalMoneyEarned-=moneySpent;
	     }
	
}

