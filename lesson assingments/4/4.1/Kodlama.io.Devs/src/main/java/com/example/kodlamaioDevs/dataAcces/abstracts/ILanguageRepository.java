package com.example.kodlamaioDevs.dataAcces.abstracts;

import com.example.kodlamaioDevs.entities.concretes.Languages;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ILanguageRepository {

    void add(Languages languages);

    void delete(int id);

    void update(Languages languages);

    Languages findById(int id) throws Exception;

    List<Languages> getAll();

}
