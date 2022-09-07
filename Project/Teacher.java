package Project;

public class Teacher {

	private int id;
    private String name;
    private int salary;
    private int salaryEarned;

      //Creates a new Teacher object.
      //id for the teacher.
      //name of the teacher.
      //salary of the teacher.
    
    public Teacher(int id, String name, int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.salaryEarned=0;
    }

    // id of the teacher.
     
    public int getId(){
        return id;
    }

    // name of the teacher.
    
    public String getName(){
        return name;
    }


   // salary of the teacher.
     
    public int getSalary(){
        return  salary;
    }

     //set the salary.
     //salary
     
    public void setSalary(int salary){
        this.salary=salary;
    }

    
       //Adds  to salaryEarned.
       //Removes from the total money earned by the school.
       //salary
     
    public void receiveSalary(int salary){
        salaryEarned+=salary;
        School.updateTotalMoneySpent(salary);
    }


    @Override
    public String toString() {
        return "Name of the Teacher: " + name
                +" Total salary earned so far $"
                + salaryEarned;
    }

}

