package dataAcces;

import entities.Product;

public class JdbcProducthDao implements ProductDao{
    public void add(Product product){
        //sadece ve sadece db erişim kodları buraya yazılır SQL
        System.out.println("JDBC ile veritabanına eklendi.");
    }
}

//Hibernate geçiyoruz