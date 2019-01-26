import javax.swing.*;
public class GradePoint
{
	private static String[] studentNames;
	private static String[] grades;
	private static float gradePointAverage;
	public static void main(String[] args)
	{
		byte numberOfStudents = (byte)Integer.parseInt(JOptionPane.showInputDialog(null,"How many student names?"));
		studentNames = new String[numberOfStudents];
		grades = new String[numberOfStudents];
		enterNames();
		enterGrades();
		determineGradePointAverage();
		displayInfo();
		//for(int loopCount = 0;loopCount < numberOfStudents;++loopCount)
		//{
		//	studentArray[loopCount] = JOptionPane.showInputDialog(null,"Enter the name for student # " + ++loopCount);
		//	System.out.println("The name of student " + ++loopCount +  " is " + studentArray[loopCount]);
		//}
	}
	private static void enterNames()
	{
		for(int studentNumber = 0;studentNumber < studentNames.length;++studentNumber)
			studentNames[studentNumber] = JOptionPane.showInputDialog("Enter the name for student # " + (studentNumber + 1));
	}
	private static void enterGrades()
	{
		for(int studentNumber = 0;studentNumber < studentNames.length;++studentNumber)
			grades[studentNumber] = JOptionPane.showInputDialog("Enter letter grade for " + studentNames[studentNumber]);
	} 
	private static void determineGradePointAverage()
	{
		String gradeConversion = "FDCBA";
		gradePointAverage = 0
		for(int studentNumber = 0;studentNumber < studentNames.length;++studentNumber)
			gradePointAverage += gradeConversion.indexOf(grades[studentNumber]);
		gradePointAverage = gradePointAverage/studentNames.length;
	}
	private static void displayInfo()
	{
		//char gradeEntered;
		for(int studentNumber = 0;studentNumber < studentNames.length;++studentNumber)
			//System.out.println("The name of student " + (studentNumber + 1) + " is " + studentNames[studentNumber]);
			System.out.println(studentNames[studentNumber] + " received a grade of " + grades[studentNumber]);
			System.out.println("The class point average is " + gradePointAverage);
	}
}