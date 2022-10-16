package business;

import core.loging.ILogger;
import dataAcces.ICourseDao;
import entities.Course;


import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class CourseManager {
    private ICourseDao courseDao;
    private List<ILogger> loggers = new ArrayList<>();

    public CourseManager(ICourseDao courseDao, List<ILogger> loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }

    public void add(Course course) throws Exception{
        boolean again = false;

        for (Course c: courseDao.getCourses()) {
            if (courseDao.equals(course.getName())) {
                again = true;
            }
        }
        if (!again){
            courseDao.add(course);
        }else {
            throw new Exception("Kursa adi ayni olamaz");
        }
        if (course.getPrice()<0){
            throw new Exception("Kurs ucreti 0 dan kucuk olamaz");
        }
        for (ILogger logger: loggers){
            logger.log(course.getName());
        }
    }

    public void delete(int id){
        courseDao.delete(id);
    }

    public void update(int id, Course course){
        courseDao.update(id,course);
    }

    public Course findById(int id){
        return courseDao.findById(id);
    }

    public List<Course> getCourse() {
        return courseDao.getCourses();
    }

}
