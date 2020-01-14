
public class Student
	{
		         
		private String firstName;  
		private String lastName; 
		private String firstClass; 
		private String firstClassGrade; 
		private String secondClass; 
		private String secondClassGrade; 
		private String thirdClass; 
		private String thirdClassGrade;
		private double gradePointAverage; 
		
		public Student(String fN, String lN, String fC, String fCG, String sC, String sCG, String tC, String tCG, double gPA)
		{ 
			firstName = fN; 
			lastName = lN; 
			firstClass = fC; 
			firstClassGrade = fCG; 
			secondClass = sC; 
			secondClassGrade = sCG; 
			thirdClass = tC; 
			thirdClassGrade = tCG; 
			gradePointAverage = gPA; 
		}

		public String getFirstName()
			{
				return firstName;
			}

		public void setFirstName(String firstName)
			{
				this.firstName = firstName;
			}

		public String getLastName()
			{
				return lastName;
			}

		public void setLastName(String lastName)
			{
				this.lastName = lastName;
			}

		public String getFirstClass()
			{
				return firstClass;
			}

		public void setFirstClass(String firstClass)
			{
				this.firstClass = firstClass;
			}

		public String getFirstClassGrade()
			{
				return firstClassGrade;
			}

		public void setFirstClassGrade(String firstClassGrade)
			{
				this.firstClassGrade = firstClassGrade;
			}

		public String getSecondClass()
			{
				return secondClass;
			}

		public void setSecondClass(String secondClass)
			{
				this.secondClass = secondClass;
			}

		public String getSecondClassGrade()
			{
				return secondClassGrade;
			}

		public void setSecondClassGrade(String secondClassGrade)
			{
				this.secondClassGrade = secondClassGrade;
			}

		public String getThirdClass()
			{
				return thirdClass;
			}

		public void setThirdClass(String thirdClass)
			{
				this.thirdClass = thirdClass;
			}

		public String getThirdClassGrade()
			{
				return thirdClassGrade;
			}

		public void setThirdClassGrade(String thirdClassGrade)
			{
				this.thirdClassGrade = thirdClassGrade;
			}

		public double getGradePointAverage()
			{
				return gradePointAverage;
			}

		public void setGradePointAverage(double gradePointAverage)
			{
				this.gradePointAverage = gradePointAverage;
			}
		

	}
