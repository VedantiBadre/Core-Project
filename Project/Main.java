package Project;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
        Teacher teacher1 = new Teacher(1,"teacher1",900);
        Teacher teacher2 = new Teacher(2,"teacher2",300);
        Teacher teacher3 = new Teacher(3,"teacher3",700);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(teacher1);
        teacherList.add(teacher2);
        teacherList.add(teacher3);

        Student student1 = new Student(1,"student1",9);
        Student student2 = new Student(2,"student2",6);
        Student student3 = new Student(3,"student3",11);
        List<Student> studentList = new ArrayList<>();

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        School college1 = new School(teacherList,studentList);

        Teacher teacher4 = new Teacher(5,"teacher4", 800);

        college1.addTeacher(teacher4);


        student1.payFees(5000);
        student2.payFees(6000);
        System.out.println("college1 has earned $"+ college1.getTotalMoneyEarned());

        System.out.println("*******SCHOOL PAY SALARY**********");
        teacher1.receiveSalary(teacher1.getSalary());
        System.out.println("college1 has spent for salary to " + teacher1.getName()
        +" and now has $" + college1.getTotalMoneyEarned());

        teacher2.receiveSalary(teacher2.getSalary());
        System.out.println("college1 has spent for salary to " + teacher2.getName()
                +" and now has $" + college1.getTotalMoneyEarned());


        System.out.println(student2);

        teacher3.receiveSalary(teacher3.getSalary());

        System.out.println(teacher3);
    }
}
