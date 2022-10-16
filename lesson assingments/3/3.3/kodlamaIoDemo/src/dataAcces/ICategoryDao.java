package dataAcces;

import entities.Category;

import java.util.List;

public interface ICategoryDao {
    void add(Category category);

    void delete(int id);

    void update(int id , Category category);

    Category findById(int id);

    List<Category> getCategories();
}
