package one;

public class testco {
	public static void main(String[] args) {
		
		Student s1 = new Student("Mohammed Mouafik", "33 Casablanca", "2022");
		 s1.addCourseGrade("CS209", 95);
		 s1.addCourseGrade("CS203", 70);
		 s1.printGrades();
		 System.out.println("Average is " + s1.getAverageGrade() + "/ I have passed");
		 
		 Teacher t1 = new Teacher("Adriana Gavi", "8 beach way", "2019",0);
		 System.out.println(t1);
		 Teacher.receiveSalary(Teacher.getSalary());
		 System.out.println("college1 has spent for salary to " + Teacher.getName() + " and now has 3000 £");
		 
		 
		 String[] courses = {"CS209", "CS203", "CS250", "Programing"};
		 for (String course: courses) 
		 	{
			 if (t1.addCourse(course)) 
			 	{
				 System.out.println(course + " added.");
				 }
			 else {
				 System.out.println(course + " cannot be added.");
				 }
			 }
		 for (String course: courses) {
			 if (t1.removeCourse(course)) 
			 {
				 System.out.println(course + " removed.");
				 }
			 else 
			 {
				 System.out.println(course + " cannot be removed.");
				 }
		 }
	}
}