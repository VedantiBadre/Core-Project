package Project;
//This Class is use to keep the track of Students fees,name,grades and feesPaid
public class Student {
		private int id;
	    private String name;
	    private int grade;
	    private int feesPaid;
	    private int feesTotal;

	   
	      //To create a new student by initializing.
	      //id for the student: unique.
	      //name of the student.
	      //grade of the student.
	     
	    public Student(int id, String name,int grade){
	        this.feesPaid=0;
	        this.feesTotal=30000;
	        this.id=id;
	        this.name=name;
	        this.grade=grade;

	    }

	    //Not going to alter student's name, student's id.

	     //Used to update the student's grade.
	     //new grade of the student.
	     
	    public void setGrade(int grade){
	        this.grade=grade;
	    }


	      //add the fees to feesPaid Field.
	      //fees to the fees paid.
	      //school is going receive the funds.
	      //fees student pays.
	     
	    public void payFees(int fees){
	        feesPaid+=fees;
	        School.updateTotalMoneyEarned(feesPaid);
	    }

	    //id of the student.
	    
	    public int getId() {
	        return id;
	    }

	     //name of the student.
	    
	    public String getName() {
	        return name;
	    }

	     //the grade of the student.
	     
	    public int getGrade() {
	        return grade;
	    }

	     //fees paid by the student.
	     
	    public int getFeesPaid() {
	        return feesPaid;
	    }

	   //the total fees of the student
	    public int getFeesTotal() {
	        return feesTotal;
	    }

	    //the remaining fees.
	     
	    public int getRemainingFees(){
	        return feesTotal-feesPaid;
	    }

	    @Override
	    public String toString() {
	        return "Student's name :"+name+
	                " Total fees paid so far $"+ feesPaid;
	    }

	}


