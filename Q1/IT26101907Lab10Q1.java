import java.util.Scanner;

public class  IT26101907Lab10Q1{
	
	public static void main(String[]args){
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter mark(0-100): ");
	int mark = scanner.nextInt();
	
	assert(mark >= 0&& mark <=100):"Invalid mark";
	
	System.out.println("Mark is validated");
	
	char grade;
	
	if (mark >= 75){
		grade = 'A';
		
	}else if (mark >= 60){
		grade = 'B';
	}else if (mark >= 50){
		grade = 'C';
	}else if (mark >= 40){
		grade = 'D';
	}else{
		grade = 'F';
	}
	
	boolean isGradeCorrect = false;
	
	if (mark >= 75 && grade == 'A') isGradeCorrect = true;
	else if (mark >= 60 && mark <= 74 && grade == 'B') isGradeCorrect = true;
	else if (mark >= 50 && mark <= 64 && grade == 'C') isGradeCorrect = true;
	else if (mark >= 40 && mark <= 54 && grade == 'D') isGradeCorrect = true;
	else if (mark < 40 && grade == 'F') isGradeCorrect = true;
	
	assert isGradeCorrect : "Incorrect Grade Assigned";
	
	System.out.println("The Grade for the Enterd Mark is: " + grade);
	
	scanner.close();
 }

}