import java.util.Scanner;

public class AddOrDel
	{
		static Scanner userInput = new Scanner(System.in);
		static int choice;

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
			
		}
		
		public static void removeStudent(){
			
		}
	}
