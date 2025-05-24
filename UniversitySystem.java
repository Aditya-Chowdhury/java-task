import java.util.Date;

class Student {
    int id;
    String name;
    String program;

    public Student(int id, String name, String program) {
        this.id = id;
        this.name = name;
        this.program = program;
    }
}

class Instructor {
    int id;
    String name;
    String department;
    String title;

    public Instructor(int id, String name, String department, String title) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.title = title;
    }
}

class Course {
    int id;
    String syllabus;
    String title;
    String credits;
    String prerequisite;

    public Course(int id, String syllabus, String title, String credits, String prerequisite) {
        this.id = id;
        this.syllabus = syllabus;
        this.title = title;
        this.credits = credits;
        this.prerequisite = prerequisite;
    }
}

class CourseOffering {
    int studentID;
    int instructorID;
    int courseID;
    Date time;
    int sectionNo;
    int roomId;
    int year;
    char semester;

    public CourseOffering(int studentID, int instructorID, int courseID, Date time,
                          int sectionNo, int roomId, int year, char semester) {
        this.studentID = studentID;
        this.instructorID = instructorID;
        this.courseID = courseID;
        this.time = time;
        this.sectionNo = sectionNo;
        this.roomId = roomId;
        this.year = year;
        this.semester = semester;
    }
}

public class UniversitySystem {
    public static void main(String[] args) {
        Student student = new Student(1, "Alice", "CSE");
        Instructor instructor = new Instructor(1, "Dr. Bob", "CSE", "Professor");
        Course course = new Course(101, "Week1-Intro, Week2-OOP", "Object Oriented Programming", "3", "Intro to Programming");
        CourseOffering offering = new CourseOffering(1, 1, 101, new Date(), 1, 101, 2025, 'F');

        System.out.println("Student " + student.name + " is enrolled in course: " + course.title);
    }
}
