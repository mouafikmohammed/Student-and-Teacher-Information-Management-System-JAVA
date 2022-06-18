package one;

public class Teacher extends People {
	
	private int numCourses;
	 private String[] courses;
	 private static final int MAX_COURSES = 20;
	 private static int salary;
	 
	 public Teacher(String name, String address, String year, int salary) {
		 super(name, address, year);
		 numCourses = 0;
		 courses = new String[MAX_COURSES];
		 Teacher.salary=salary;
		 }
	 
	 @Override
	 public String toString() {
		 return "Teacher: " + super.toString(); }
	 
	 public boolean addCourse(String course) {
		 
		 for (int i = 0; i < numCourses; i++) {
		 if (courses[i].equals(course)) return false;
		 }
		 courses[numCourses] = course;
		 numCourses++;
		 return true;
			}
	 
	 public boolean removeCourse(String course) {

		 int courseIndex = numCourses;
		 for (int i = 0; i < numCourses; i++) {
		 if (courses[i].equals(course)) {
		 courseIndex = i;
		 break;
		 }
		 }
		 if (courseIndex == numCourses) { // cannot find the course to be removed
		 return false;
		 } 
		 else {
		 for (int i = courseIndex; i < numCourses-1; i++) {
		 courses[i] = courses[i+1];
		 		} 
		 numCourses--;
		 return true;
		 	}
		 }
	 public void setSalary1(int salary) {
		 Teacher.salary=salary;
	 }
	 public static int getSalary() {
		 return salary;
	 }

	 public void setSalary(int salary) {
		 Teacher.salary=salary;
	 }
	 public static void receiveSalary(int salary2) {
		 
	 }
}

















