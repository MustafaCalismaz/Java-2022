package business;

import core.loging.ILogger;
import dataAcces.ICategoryDao;
import entities.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryManager {
    private ICategoryDao categoryDao;
    private List<ILogger> loggers = new ArrayList<>();

    public CategoryManager(ICategoryDao categoryDao, List<ILogger> loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }

    public void add(Category category) throws Exception{
        boolean again = false;

        for (Category c: categoryDao.getCategories()) {
            if (category.equals(category.getName())) {
                again = true;
            }
        }
        if (!again){
            categoryDao.add(category);
        }else {
            throw new Exception("Kategori ismi ayni olamaz");
        }
        for (ILogger logger:loggers
             ) {
            logger.log(category.getName());
        }
    }

    public void delete(int id){
        categoryDao.delete(id);
    }

    public void update(int id, Category category){
        categoryDao.update(id,category);
    }

    public Category findById(int id){
        return categoryDao.findById(id);
    }

    public List<Category> getCategoies() {
        return categoryDao.getCategories();
    }

}
