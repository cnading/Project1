import java.util.Comparator;

public class sortStudentGpa implements Comparator<Student>
	{

	@Override
	public int compare(Student s1, Student s2)
		{
			// fix: compareTo does not like double (gradePointAverage)
			//return s1.getGradePointAverage().compareTo(s2.getGradePointAverage());
			// temporary:
			return 0;
		}

	}
