
import java.io.FileNotFoundException; 
import java.util.ArrayList;
import java.util.Scanner; 
import java.util.Collections;



public class Runner
	{	
		static Scanner userInput = new Scanner(System.in);
		static int choice = 0;
		static ArrayList<Student> roster = new ArrayList<Student>();
		public static void main(String[] args) throws FileNotFoundException
			{
	
				fileReader.readStudentFile();
				intro();
//				sortStudents.sortByGpa();
//				sortStudents.sortByPeriod();
				//ChangeStudentGradeSchedule.IntroForGradeAndScheduleChange();
	

			}

		public static void intro()
			{
				System.out.println("What would you like to do?");
				System.out.println("1) Add or delete a student \n2) Change student grades or schedule\n3) Sort Students");
				choice= userInput.nextInt();
				if (choice==1){
					
					AddOrDel.intro();
				}
				else if (choice==1){
					AddOrDel.intro();
				}
				else if (choice==2){
					ChangeStudentGradeSchedule.IntroForGradeAndScheduleChange();
				}
				else if(choice==3)
					{ 
						sortStudentsMenu.intro();
					}
				
				
				
			}
		
		public static void printRoster()
		{ 
			for(Student s: roster)
			{ 
				System.out.println(s.getFirstName() + s.getLastName() + s.getFirstClass() + s.getFirstClassGrade() + s.getSecondClass() + s.getSecondClassGrade() + s.getThirdClass() + s.getThirdClassGrade() + 0.0);
			}
		}
		
	


	}

