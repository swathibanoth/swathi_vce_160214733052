import java.util.*;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		
		// Add your implementation here
		return  students;
	}

	@Override
	public void setStudents(Student[] students) {
		try
		{
		if(students==null)throw new  IllegalArgumentException();
		{
		this.students=students;
	
	}
		}
		catch(IllegalArgumentException e)
		{
			e.printStackTrace();

		}
	}

	@Override
	public Student getStudent(int index) 
	{
		try
	{
	if(students==null)throw new  IllegalArgumentException();
	else if(index<0 || index>=students.length)throw new  IllegalArgumentException();
	else
		return students[index];
	}
		catch(IllegalArgumentException e)
		{
			e.printStackTrace();

		}
		return null;
	}

		// Add your implementation here	}

	@Override
	public void setStudent(Student student, int index) {

		try
		{
		if(students==null)throw new  IllegalArgumentException();
		else if(index<0 || index>=students.length)throw new  IllegalArgumentException();
		else
			students[index]=student;
		}
		catch(IllegalArgumentException e)
		{
			e.printStackTrace();

		}
		// Add your implementation here
	}

	@Override
	public void addFirst(Student student) {
		int i=0;
	
		try
		{
		if(students==null)throw new  IllegalArgumentException();
		
		else
		{
			
			for(i=0;i<students.length;i++)
			{
				students[i]=students[i-1];
			}
		}
		students[0]=student;

		}
		catch(IllegalArgumentException e)
		{
			e.printStackTrace();

		}
	
		// Add your implementation here
	}

	@Override
	public void addLast(Student student) {
		int i=0;
		
		try
		{
		if(students==null)throw new  IllegalArgumentException();
		
		else
		
			
				students[students.length+1]=student;
			
		
			
		}
		catch(IllegalArgumentException e)
		{
			e.printStackTrace();

		}
	

		
		// Add your implementation here
	}

	@Override
	public void add(Student student, int index) {
int i=0;
		
		try
		{
		if(students==null)throw new  IllegalArgumentException();
		else if(index<0 || index>=students.length)throw new  IllegalArgumentException();
		else
		{
			int length=students.length;
			for(i=length;i>index;i--)
			{
				students[i]=students[i-1];
			}
		}
		students[index]=student;

		}
		catch(IllegalArgumentException e)
		{
			e.printStackTrace();

		}

		// Add your implementation here
	}

	@Override
	public void remove(int index) {
		int i=0;
		index=-1;
		try
		{
		if(students==null)throw new  IllegalArgumentException();
		else 
		{
			for(i=0;i<students.length;i++)
			{
				students[i]=students[i+1];
			}
		}
		
				}
		catch(IllegalArgumentException e)
		{
			
			System.out.println("Student not exist");


		}
		// Add your implementation here
	}

	@Override
	public void remove(Student student) {
		int i=0,j;
		int index=-1;
		try
		{
		if(students==null)throw new  IllegalArgumentException();
		else 
		{
			for(i=0;i<students.length;i++)
			{
				if(students[i].equals(student))index=i;
			}
			for(j=0;j<index;j++)
				{
				students[j]=students[j+1];
				}
}
		}
		catch(IllegalArgumentException e)
		{
			
			e.printStackTrace();


		}
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
try{
			
			if(students==null)throw new IllegalArgumentException();
			if(index<0 || index>=students.length) throw new IllegalArgumentException();
			for(int i=index;i<students.length;i++){
				students[i+1]=null;
			}
         }
			catch(IllegalArgumentException e)
			{
				e.printStackTrace();
			}
		}
		// Add your implementation here
	

	@Override
	public void removeFromElement(Student student) {
		 try{
				
				if(students==null)throw new IllegalArgumentException();
				
				for(int i=0;i<students.length;i++){
					if(students[i]==student){
						for(int j=i+1;j<students.length;j++)
						          students[j]=null;
					}
				}
	         }
				catch(IllegalArgumentException e)
				{
					e.printStackTrace();
				}
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
	
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
double max=students[0].getAvgMark();
		
		for(int i=1; i<=students.length; i++)
		{
			if(students[i].getAvgMark()>max)
			{
				max=students[i].getAvgMark();
			}
		}
		Student sm[] = new Student[students.length];
		int j=0;
		for(int i=0; i<students.length; i++)
		{
			if(max == students[i].getAvgMark()) { sm[j]=students[i]; j++;}
		}
		return null;
	
	}

	@Override
	public Student getNextStudent(Student student) {
		int i;
		try
		{
		if(students==null)throw new  IllegalArgumentException();
		for( i=0;i<students.length;i++)
		{
			if(students.equals(student))
			{
				return students[i+1];
			}
		}
		}
		catch(IllegalArgumentException e)
		{
			
			e.printStackTrace();


		}
		// Add your implementation here
		return null;
	}
}
