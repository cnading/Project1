import java.util.Scanner;

public class AddOrDel
	{
		static Scanner userInput = new Scanner(System.in);
		static int choice;
		static String fName;
		static String lName;
		static String fClass;
		static String fGrade;
		static String sClass;
		static String sGrade;
		static String tClass;
		static String tGrade;
		static double GPA;
		static Student transfer;
		static Student temp;
		static String response;
		
		
		public static void intro()
			{
				System.out.println("Would you like to...\n1) Add a student\n2) Remove a student"
						+ "\n3) Back to Main Menu");
				choice = userInput.nextInt();
				if(choice==1){
					addStudent();
				}
				else if(choice==2){
					removeStudent();
				}
				else if(choice==3){
					Runner.intro();
				}
				else{
					intro();
				}
			}
		
		public static void addStudent(){
			System.out.println("What is the Students first name?");
			userInput.nextLine();
			fName= userInput.nextLine();
			System.out.println("What is " + fName + "'s last name?");
			lName= userInput.nextLine();
			System.out.println("What is " +fName +" " + lName + "'s first class?");
			fClass= userInput.nextLine();
			System.out.println("And what is their grade in " + fClass);
			fGrade = userInput.nextLine();
			System.out.println("What is " +fName + lName + "'s second class?");
			sClass= userInput.nextLine();
			System.out.println("And what is their grade in " + sClass);
			sGrade = userInput.nextLine();
			System.out.println("What is " +fName + lName + "'s third class?");
			tClass= userInput.nextLine();
			System.out.println("And what is their grade in " + tClass);
			tGrade = userInput.nextLine();
			System.out.println("Lastly, what is their GPA?");
			GPA= userInput.nextDouble();
			transfer = new Student(fName, lName, fClass, fGrade, sClass, sGrade, tClass, tGrade, GPA);
			System.out.println("Please confirm the following info is correct?\n(YES or NO)");
			System.out.println(transfer.getFirstName() + " " + transfer.getLastName() + "\n" + transfer.getFirstClass() + ": " + transfer.getFirstClassGrade()
			 + "\n" + transfer.getSecondClass() + ": " + transfer.getSecondClassGrade()
			 + "\n" + transfer.getThirdClass() + ": " + transfer.getThirdClassGrade()
			 + "\nGPA: " + transfer.getGradePointAverage());
			userInput.nextLine();
			response= userInput.nextLine();
			if (response.equals("Yes")|| response.equals("yes") || response.equals("YES")){
				System.out.println("Student Added");
				Runner.roster.add(transfer);
				intro();
			}
			else{
				System.out.println("Canceled!");
				intro();
			}
		}
		
		public static void removeStudent(){
			System.out.println("What is the students first name?");
			userInput.nextLine();
			fName = userInput.nextLine();
			for (Student n: Runner.roster){
				if(fName.equals(n.getFirstName())){
					Student deletedStudent  = n;
					System.out.println(deletedStudent.getFirstName());
					
				}
				
			}
			System.out.println("Are you sure you want to remove " + temp.getFirstName() + temp.getLastName());
			userInput.nextLine();
			response= userInput.nextLine();
			if (response.equals("Yes")|| response.equals("yes") || response.equals("YES")){
				System.out.println("Student Removed!");
				intro();
			}
			else{
				System.out.println("Canceled!");
				intro();
			}
		}
	}
