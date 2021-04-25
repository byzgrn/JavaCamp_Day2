public class Main {
    public static void main(String[] args){
        Course course1=new Course("Java",1,"2 months","Engin Demirog");
        Course course2=new Course("C#",2,"3 months","Engin Demirog");
        Course course3=new Course("Python",3,"1 week","Ömer Cengiz");

        Profile profile1=new Profile("Beyza Nur Gören",1,"***@hotmail.com");
        Profile profile2=new Profile("Engin Demirog",2,"+++@gmail.com");


        Course[] courses={course1,course2,course3};
        Profile[] profiles={profile1,profile2};

        for (Course c:courses){
        System.out.println(c.name);
        }

        for (Profile p:profiles){
            System.out.println(p.fullName);
        }
        System.out.println(courses.length);
        System.out.println(profiles.length);

        CourseManager courseManager=new CourseManager();
        courseManager.addCourse(course1);
        courseManager.addCourse(course2);
        courseManager.addCourse(course3);
        courseManager.removeCourse(course2);
        System.out.println(courseManager.totalCourse);
    }
}
