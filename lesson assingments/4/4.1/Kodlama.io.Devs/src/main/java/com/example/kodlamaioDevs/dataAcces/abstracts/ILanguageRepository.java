package com.example.kodlamaioDevs.dataAcces.abstracts;

import com.example.kodlamaioDevs.entities.concretes.Languages;

import java.util.List;

public interface ILanguageRepository {

    void add(Languages languages);

    void delete(int id);

    void update(Languages languages);

    Languages findById(int id);

    List<Languages> getAll();

}
