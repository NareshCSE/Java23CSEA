package java_practice;
import java.util.ArrayList;
import java.util.List;
public class StudentCourseManagement {
	    public static void main(String[] args) {
	        try {
	            Semester semester = new Semester();
	            
	            // Adding courses
	            semester.addCourse(new Course(1, "Math 101", 1500));
	            semester.addCourse(new Course(2, "Physics 101", 5000));

	            // Viewing courses
	            Course[] courses = semester.viewCourses();
	            for (Course course : courses) {
	                System.out.println("Course ID: " + course.getId() + ", Subject: " + course.getName() + ", Price: " + course.getPrice());
	            }

	            // Calculating fee
	            double finalFee = semester.addFee(1600);
	            System.out.println("Final Fee after discount: " + finalFee);

	        } catch (Exception e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }
	}

class Course {
    private int id;
    private String name;
    private double price;

    // Constructor
    public Course(int id, String name, double price) {
        this.id = id;
        this.name = name;
        setPrice(price);
    }

    // Getter and Setter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 1000 || price > 3000) {
            throw new IllegalArgumentException("Price must be in the range of 1000 to 3000");
        }
        this.price = price;
    }
}
interface StudentCourse {
    void addCourse(Course course) throws Exception;
    Course[] viewCourses() throws Exception;
    double addFee(double fee) throws Exception;
}


class Semester implements StudentCourse {
    private List<Course> courses = new ArrayList<>();

    public void addCourse(Course course) throws Exception {
        if (course == null) {
            throw new IllegalArgumentException("Course cannot be null");
        }
        courses.add(course);
    }
    public Course[] viewCourses() throws Exception {
        if (courses.isEmpty()) {
            throw new Exception("No courses available");
        }
        return courses.toArray(new Course[0]);
    }
    public double addFee(double fee) throws Exception {
        if (fee < 1000 || fee > 3000) {
            throw new IllegalArgumentException("Fee must be in the range of 1000 to 3000");
        }
        double discount = fee > 1500 ? fee * 0.10 : 0;
        return fee - discount;
    }
}
