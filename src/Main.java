
public class Main {

	public static void main(String[] args) {
		
		Teacher teacher1=new Teacher(101, "Erdinç Akdemir");
		Teacher teacher2=new Teacher(102, "Merter Gün");
		
		Course course1=new Course(1, "Java & React", 10, teacher1);
		Course course2=new Course(2, "Javascript", 10, teacher2);
		
		Course[] courses= {course1,course2};
		
		CourseManager manager=new CourseManager();
		manager.ListAllCourses(courses);
		

	}

}
