import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ChangeStudentGradeSchedule
	{
		static ArrayList<Student> roster = new ArrayList<Student>();
		
		public static void IntroForGradeAndScheduleChange()
			{

				Scanner userInput = new Scanner(System.in);
				System.out.println("Hello, would you like to (1) change Grades or (2) Change Schedule?");

				boolean studentList = true;
				while (studentList)
					{
						int catagory = userInput.nextInt();
						if (catagory == 1)
							{

								changeGrades();
								studentList = false;
							} else if (catagory == 2)
							{
								switchClasses();
								studentList = false;
							}

						else
							{
								System.out.println("Please pick either 1 or 2.");

							}
					}

			}

		public static void changeGrades()
			{
				Scanner userInput = new Scanner(System.in);

				System.out.println("Okay, here are all of the students: ");

				System.out.println();

				Runner.printRoster();

				System.out.println();

				System.out.println("Please enter the first name of a student to change their grades.");

				String firstName = userInput.next();

				System.out.println("Please enter the last name of the student.");

				String lastName = userInput.next();

				String fullName = firstName + " " + lastName;

				System.out.println();
				
					
						
					
				for (Student s : Runner.roster)
					{
						if ((s.getFirstName() + " " + s.getLastName()).equals(fullName))
							{
								String studentGPA = Runner.decFor.format(s.getGradePointAverage());
								System.out.println("Here is the student: " + s.getFirstName() + " " + s.getLastName()
										+ " " + s.getFirstClass() + " " + s.getFirstClassGrade() + " "
										+ s.getSecondClass() + " " + s.getSecondClassGrade() + " " + s.getThirdClass()
										+ " " + s.getThirdClassGrade() + " " + studentGPA);

								System.out.println();

								System.out.println("Which class would you like to change the grade in?\n1) "
										+ s.getFirstClass() + " " + s.getFirstClassGrade() + "\n2) "
										+ s.getSecondClass() + " " + s.getSecondClassGrade() + "\n3) "
										+ s.getThirdClass() + " " + s.getThirdClassGrade());

								int chosenClass = userInput.nextInt();

								if (chosenClass == 1)
									{
										System.out.println("You are changing the grade in " + s.getFirstClass());

										System.out.println("What would you like the new grade to be?");

										String chosenGrade = userInput.next();

										s.setFirstClassGrade(chosenGrade);

										System.out.println("Okay, the grade has been changed");

									}

								else if (chosenClass == 2)
									{
										System.out.println("You are changing the grade in " + s.getSecondClass());

										System.out.println("What would you like the new grade to be?");

										String chosenGrade2 = userInput.next();

										s.setSecondClassGrade(chosenGrade2);
										

										System.out.println("Okay, the grade has been changed");

									}

								else if (chosenClass == 3)
									{
										System.out.println("You are changing the grade in " + s.getThirdClass());

										System.out.println("What would you like the new grade to be?");

										String chosenGrade3 = userInput.next();

										s.setThirdClassGrade(chosenGrade3);

										System.out.println("Okay, the grade has been changed");

									}
								
								gpaCalculator.getGradeAverage();

								System.out.println();
								System.out.println("Here is the updated roster: ");
								System.out.println();
								Runner.printRoster();
								System.out.println();
								Runner.intro(); 

							}
					}

			}


		public static void switchClasses()
			{
				Scanner userInput = new Scanner(System.in); 
				
				System.out.println("Okay here is the student roster: ");

				System.out.println();
				
				Runner.printRoster(); 
				
				System.out.println();
				
				System.out.println("Please enter the first name of a student to change their shedule.");

				String firstName = userInput.next();

				System.out.println("Please enter the last name of the student.");

				String lastName = userInput.next();

				String fullName = firstName + " " + lastName;
				
				String temp; 
				
				for(Student t: Runner.roster)
					{ 
						if ((t.getFirstName() + " " + t.getLastName()).equals(fullName))
							{
								String studentGPA = Runner.decFor.format(t.getGradePointAverage());
								System.out.println("Here is the student: " + t.getFirstName() + " " + t.getLastName()
										+ " " + t.getFirstClass() + " " + t.getFirstClassGrade() + " "
										+ t.getSecondClass() + " " + t.getSecondClassGrade() + " " + t.getThirdClass()
										+ " " + t.getThirdClassGrade() + " " + studentGPA);
								
								System.out.println();

			
								
								System.out.println("Which period would you like to transfer out of? \nPeriod 1: "
										+ t.getFirstClass() + " " + t.getFirstClassGrade() + "\nPeriod 2: "
										+ t.getSecondClass() + " " + t.getSecondClassGrade() + "\nPeriod 3: "
										+ t.getThirdClass() + " " + t.getThirdClassGrade());
								
								int transferPeriod = userInput.nextInt(); 
								
								System.out.println("Which period would you like to transfer into? \nPeriod 1: "
										+ t.getFirstClass() + " " + t.getFirstClassGrade() + "\nPeriod 2: "
										+ t.getSecondClass() + " " + t.getSecondClassGrade() + "\nPeriod 3: "
										+ t.getThirdClass() + " " + t.getThirdClassGrade());
								
								int transferToPeriod = userInput.nextInt(); 
								
								System.out.println("Okay you are transferring out of period: " + transferPeriod + ", " + "into period: " + transferToPeriod);
								
								if(transferPeriod == 1 && transferToPeriod == 2)
									{
										temp = t.getFirstClass(); 
										t.setFirstClass(t.getSecondClass());
										t.setSecondClass(temp);
									}
								
								
								
								else if(transferPeriod == 2 && transferToPeriod == 3)
									{ 
										temp = t.getSecondClass(); 
										t.setSecondClass(t.getThirdClass());
										t.setThirdClass(temp);
										
									}
								
								else if(transferPeriod == 1 && transferToPeriod == 3)
									{ 
										temp = t.getFirstClass(); 
										t.setFirstClass(t.getThirdClass()); 
										t.setThirdClass(temp);
									}
								
								System.out.println("Here is the updated roster: ");
								
								Runner.printRoster(); 
								
								System.out.println();
								
								Runner.intro();
									
								
								
								
								
								
								

	
					}
					
				
				
				
				
				
				
				
				
				String temp1; 
				String temp2;
				String temp3;
				String[] schedule1;
				String[] schedule2;
				
				

			
					}
			}
	}
