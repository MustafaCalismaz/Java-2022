package dataAcces;

import entities.Course;
import entities.Teacher;

import java.util.List;

public interface ITeacherDao {
    void add(Teacher teacher);
    void delete(int id);
    void update(int id, Teacher teacher);

    Teacher findById(int id);

    List<Teacher> getTeachers();
}
