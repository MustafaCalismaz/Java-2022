import business.CategoryManager;
import business.CourseManager;
import core.loging.DatabaseLogger;
import core.loging.EMailLogger;
import core.loging.FileLogger;
import core.loging.ILogger;
import dataAcces.HibernateCourseDao;
import dataAcces.JdbcCategoryDao;
import entities.Category;
import entities.Course;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        List<ILogger> loggers=new ArrayList<>();
        loggers.add(new DatabaseLogger());
        loggers.add(new EMailLogger());
        loggers.add(new FileLogger());

/*        Category category1 = new Category(1,"Programla");
        Category category2 = new Category(1,"Tumu");
        Category category3 = new Category(1,"Programla");

        CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(),loggers);
        categoryManager.add(category1);
        categoryManager.add(category2);
        categoryManager.add(category3);*/

        Course course1 = new Course(1,"Java22","Java 2022 yazilim kursu",0);
        Course course2 = new Course(2,"C#","C# 2022 yazilim kursu",0);
       // Course course3 = new Course(3,"Java22","Java 2022 yazilim kursu",0);


        CourseManager courseManager = new CourseManager(new HibernateCourseDao(),loggers);
        courseManager.add(course1);
        courseManager.add(course2);
       // courseManager.add(course3);



    }
}