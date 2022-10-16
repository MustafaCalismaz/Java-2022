package dataAcces;

import entities.Category;

import java.util.ArrayList;
import java.util.List;

public class HibernateCategoryDao implements ICategoryDao{

    private List<Category>categories = new ArrayList<>();

    @Override
    public void add(Category category) {
        categories.add(category);
        System.out.println("Hibernate ile veritabanina eklendi");
    }

    @Override
    public void delete(int id) {
        categories.remove(id);
        System.out.println("Kategori silindi");
    }

    @Override
    public void update(int id, Category category) {
        categories.set(id, category);
        System.out.println("Kategori guncellendi");
    }

    @Override
    public Category findById(int id) {
        return categories.get(id);
    }

    @Override
    public List<Category> getCategories() {
        return categories;
    }
}
