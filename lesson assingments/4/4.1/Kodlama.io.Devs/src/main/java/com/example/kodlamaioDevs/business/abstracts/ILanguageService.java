package com.example.kodlamaioDevs.business.abstracts;

import com.example.kodlamaioDevs.entities.concretes.Languages;

import java.util.List;

public interface ILanguageService {
    void add(Languages languages) throws Exception;

    void delete(int id);

    void update(Languages languages);

    Languages findById(int id);

    List<Languages> getAll();

}
