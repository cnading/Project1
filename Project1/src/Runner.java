
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Runner
	{
		static Scanner userInput = new Scanner(System.in);
		static int choice = 0;
		public static void main(String[] args)
			{
     
				intro();
				sortStudents.sortByLastName();
				sortStudents.sortByGpa();
				sortStudents.sortByPeriod();
				ChangeStudentGradeSchedule.changeGrades();

			}

		public static void intro()
			{
				System.out.println("What would you like to do?");
				System.out.println("1) Add or delete a student \n2) Change student grades or schedule\n3) Sort Students");
				choice= userInput.nextInt();
				if (choice==1){
					
					AddOrDel.intro();
				}
//				else if (choice==1){
//					AddOrDel.intro();
//				}
//				else if (choice==2){
//					AddOrDel.intro();
//				}
				
				
			}



	}
