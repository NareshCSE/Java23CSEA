import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Custom exception class
class CourseException extends Exception {
    public CourseException(String message) {
        super(message);
    }
}

// Course class
class Course {
    private int id;
    private String name;
    private double price;

    // Constructor
    public Course(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

// StudentCourse interface
interface StudentCourse {
    void addCourse(Course course) throws CourseException;
    Course[] viewCourses() throws CourseException;
    double addFee(double fee) throws CourseException;
}

// Main class implementing the StudentCourse interface
public class assignment16 implements StudentCourse {
    private List<Course> courses = new ArrayList<>();

    @Override
    public void addCourse(Course course) throws CourseException {
        if (course == null) {
            throw new CourseException("Course cannot be null.");
        }
        courses.add(course);
    }

    @Override
    public Course[] viewCourses() throws CourseException {
        if (courses.isEmpty()) {
            throw new CourseException("No courses available.");
        }
        return courses.toArray(new Course[0]);
    }

    @Override
    public double addFee(double fee) throws CourseException {
        if (fee < 1000 || fee > 3000) {
            throw new CourseException("Fee must be in the range of 1000 to 3000.");
        }
        double discount = (fee > 1500) ? fee * 0.10 : 0;
        return fee - discount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        assignment16 semester = new assignment16();

        try {
            // Adding courses
            semester.addCourse(new Course(1, "Java Programming", 2000));
            semester.addCourse(new Course(2, "Data Structures", 1500));
            semester.addCourse(new Course(3, "Web Development", 1200));

            // Viewing courses
            Course[] courses = semester.viewCourses();
            System.out.println("Available Courses:");
            for (Course course : courses) {
                System.out.println("ID: " + course.getId() + ", Name: " + course.getName() + ", Price: " + course.getPrice());
            }

            // Adding fee
            System.out.print("Enter fee amount to add: ");
            double fee = scanner.nextDouble();
            double finalFee = semester.addFee(fee);
            System.out.println("Final Fee after discount (if applicable): " + finalFee);
        } catch (CourseException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
