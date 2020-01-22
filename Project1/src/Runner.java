
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner; 
import java.util.Collections;



public class Runner
	{	
		static Scanner userInput = new Scanner(System.in);
		static int choice = 0;
		static ArrayList<Student> roster = new ArrayList<Student>();
		static DecimalFormat decFor = new DecimalFormat("0.00");
		
		public static void main(String[] args) throws FileNotFoundException
			{

				fileReader.readStudentFile();
				gpaCalculator.getGradeAverage();
				intro();

			}

		public static void intro()
			{
				System.out.println("What would you like to do?");
				System.out.println("1) Add or delete a student \n2) Change student grades or schedule\n3) Sort Students");
				choice= userInput.nextInt();
				if (choice==1){
					
					AddOrDel.intro();
				}

			
				else if (choice==2){
					ChangeStudentGradeSchedule.IntroForGradeAndScheduleChange();
				}
				else if (choice == 3)
					{
						sortStudentsMenu.intro();
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
				String studentGPA = decFor.format(s.getGradePointAverage()); 
				
				System.out.println(s.getFirstName() + " " + s.getLastName() + " " 
						+ s.getFirstClass() + " " + s.getFirstClassGrade() + " " 
						+ s.getSecondClass() + " " + s.getSecondClassGrade() + " " 
						+ s.getThirdClass() + " " + s.getThirdClassGrade() + " " 
						+ studentGPA);
			}
		}
		
	


	}

