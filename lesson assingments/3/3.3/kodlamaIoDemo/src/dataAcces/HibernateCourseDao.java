package dataAcces;

import entities.Course;

import java.util.ArrayList;
import java.util.List;

public class HibernateCourseDao implements ICourseDao{
    private List<Course>courses = new ArrayList<>();
    @Override
    public void add(Course course) {
        courses.add(course);
        System.out.println("Hibernate ile veritabanina eklendi");
    }

    @Override
    public void delete(int id) {
        courses.remove(id);
        System.out.println("Kurs silindi");
    }

    @Override
    public void update(int id, Course course) {
        courses.set(id, course);
        System.out.println("Kurs guncellendi");
    }

    @Override
    public Course findById(int id) {
        return courses.get(id);
    }

    @Override
    public List<Course> getCourses() {
        return courses;
    }
}
