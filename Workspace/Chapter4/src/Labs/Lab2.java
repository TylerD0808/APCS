package Labs1;
// ****************************************************************
//   Grades.java
//
//   Use Student class to get test grades for two students
//   and compute averages
//          
// ****************************************************************
public class Lab2
{
    public static void main(String[] args)
    {
	Lab2Class student1 = new Lab2Class("Mary");
	Lab2Class student2 = new Lab2Class ("Mike");

	student1.inputGrades();
	System.out.println(student1.getName() + "'s average score: " + student1.getAverage());

	System.out.println();

	student2.inputGrades();
	System.out.println(student2.getName() + "'s average score: " + student2.getAverage());
	
	System.out.println();
	
	System.out.println(student1.toString());
	System.out.println(student2.toString());
    }
}