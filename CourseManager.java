public class CourseManager {

    int totalCourse=0;
    public void addCourse(Course course){
        System.out.println("Course has been added: "+course.name);
        totalCourse++;
    }

    public void removeCourse(Course course){
        System.out.println("Course has been deleted: "+course.name);
        totalCourse--;
    }

}
