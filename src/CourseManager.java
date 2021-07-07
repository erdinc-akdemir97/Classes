
public class CourseManager {

	public void ListAllCourses(Course[] courses) {
		for(Course course:courses) {
			System.out.println(course.name);
		}
	}
}
