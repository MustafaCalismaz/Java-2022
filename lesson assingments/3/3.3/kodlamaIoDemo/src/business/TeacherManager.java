package business;

import dataAcces.ITeacherDao;
import entities.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherManager {
    private ITeacherDao teacherDao;
    private List<ITeacherDao> teacherDaos = new ArrayList<>();

    public TeacherManager(ITeacherDao teacherDao, List<ITeacherDao> teacherDaos) {
        this.teacherDao = teacherDao;
        this.teacherDaos = teacherDaos;
    }

    public void add(Teacher teacher) throws Exception{
        teacherDao.add(teacher);
    }
    public void delete(int id){
        teacherDao.delete(id);
    }
    public void update(int id, Teacher teacher){
        teacherDao.update(id,teacher);
    }
    public Teacher findById(int id){
        return teacherDao.findById(id);
    }
    public List<Teacher> getTeacher(){
        return teacherDao.getTeachers();
    }
}
