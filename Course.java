
public class Course {
    private String courseName;
    private String[] students = new String[20];
    private int numberOfStudents = 0;
    
    public Course(String courseName){
    	this.courseName = courseName;
    }
    public String getCourseName() {
    	return courseName;
    }
    public void addStudents(String student) {
    	students[numberOfStudents] = student;
    	numberOfStudents++;
    }
    public void dropOfStudent(String student) {
    	for(int i = 0;i < numberOfStudents;i++)
    	{
    		if(students[i].equals(student))
    		{
    			for(;i < numberOfStudents - 1;i++)
    			{
    				students[i] = students[i + 1];
    			}
    			numberOfStudents--;
    		}
    	}
    }
    public String[] getStudents() {
    	return students;
    }
    public int getNumberOfStudents(){
    	return numberOfStudents;
    }
}
