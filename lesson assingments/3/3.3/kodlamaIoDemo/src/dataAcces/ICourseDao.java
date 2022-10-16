package dataAcces;

import entities.Category;
import entities.Course;

import java.util.List;

public interface ICourseDao {
    void add(Course course);
    void delete(int id);
    void update(int id, Course course);

    Course findById(int id);

    List<Course> getCourses();
}
