import business.CourseManager;
import core.loging.DatabaseLogger;
import core.loging.EMailLogger;
import core.loging.FileLogger;
import core.loging.ILogger;
import dataAcces.HibernateCourseDao;
import entities.Course;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        List<ILogger> loggers=new ArrayList<>();
        loggers.add(new DatabaseLogger());
        loggers.add(new EMailLogger());
        loggers.add(new FileLogger());

        Course course = new Course();
        course.setId(1);

        CourseManager courseManager = new CourseManager(new HibernateCourseDao(),loggers);
        courseManager.add(course);

    }
}