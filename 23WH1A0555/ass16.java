package project;

import java.util.ArrayList;

import java.util.List;



// Course class

class Course {

    private int id;

    private String name;

    private double price;



    public Course(int id, String name, double price) {

        this.id = id;

        this.name = name;

        this.price = price;

    }



    public int getId() {

        return id;

    }



    public void setId(int id) {

        this.id = id;

    }



    public String getName() {

        return name;

    }



    public void setName(String name) {

        this.name = name;

    }



    public double getPrice() {

        return price;

    }



    public void setPrice(double price) {

        this.price = price;

    }

}



// StudentCourse interface

interface StudentCourse {

    void addCourse(Course course) throws Exception;

    Course[] viewCourses() throws Exception;

    double addFee(double fee) throws Exception;

}



// Semester class implementing StudentCourse interface

class Semester implements StudentCourse {

    private List<Course> courses = new ArrayList<>();



    @Override

    public void addCourse(Course course) throws Exception {

        if (course == null) {

            throw new Exception("Course cannot be null.");

        }

        courses.add(course);

    }



    @Override

    public Course[] viewCourses() throws Exception {

        if (courses.isEmpty()) {

            throw new Exception("No courses available.");

        }

        return courses.toArray(new Course[0]);

    }



    @Override

    public double addFee(double fee) throws Exception {

        if (fee < 1000 || fee > 3000) {

            throw new Exception("Fee must be in the range of 1000 to 3000.");

        }

        double discount = 0;

        if (fee > 1500) {

            discount = fee * 0.10; // 10% discount

        }

        return fee - discount;

    }

}



// Main class to test the application

public class ass16 {

    public static void main(String[] args) {

        try {

            Semester semester = new Semester();

            Course course1 = new Course(1, "Mathematics", 1600);

            Course course2 = new Course(2, "Science", 1400);



            semester.addCourse(course1);

            semester.addCourse(course2);



            // View courses

            Course[] courses = semester.viewCourses();

            for (Course course : courses) {

                System.out.println("Course ID: " + course.getId() +

                                   ", Name: " + course.getName() +

                                   ", Price: " + course.getPrice());

            }



            // Calculate fee

            double fee = 1800;

            double finalFee = semester.addFee(fee);

            System.out.println("Final Fee after discount (if applicable): " + finalFee);



        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }

    }

}

