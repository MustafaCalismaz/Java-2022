package dataAcces;

import entities.Teacher;

import java.util.ArrayList;
import java.util.List;

public class JdbcTeacherDao implements ITeacherDao{
    private List<Teacher>teachers= new ArrayList<>();
    @Override
    public void add(Teacher teacher) {
        teachers.add(teacher);
        System.out.println("Jdbc ile veritabanina eklendi");
    }

    @Override
    public void delete(int id) {
        teachers.remove(id);
        System.out.println("Ogretmen kaydi silindi");
    }

    @Override
    public void update(int id, Teacher teacher) {
        teachers.set(id, teacher);
        System.out.println("Ogretmen kaydi guncellendi");
    }

    @Override
    public Teacher findById(int id) {
        return teachers.get(id);
    }

    @Override
    public List<Teacher> getTeachers() {
        return teachers;
    }
}
