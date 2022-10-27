package com.example.kodlamaioDevs.dataAcces.concretes;

import com.example.kodlamaioDevs.dataAcces.abstracts.ILanguageRepository;
import com.example.kodlamaioDevs.entities.concretes.Languages;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Repository
public class InMemoryLanguageRepository implements ILanguageRepository {

    List<Languages> language;

    public InMemoryLanguageRepository() {
        language = new ArrayList<Languages>();
        language.add(new Languages(1,"C#"));
        language.add(new Languages(2,".net"));
        language.add(new Languages(3,"phyton"));
        language.add(new Languages(4,"java"));
    }

    @Override
    public void add(Languages languages) {
        language.add(languages);
    }

    @Override
    public void delete(int id) {
        language.remove(id);
    }

    @Override
    public void update(Languages languages) {
        for (Languages l : language) {
            if(l.getId()==languages.getId()){
                l.setName(languages.getName());
            }
        }
    }

    @Override
    public Languages findById(int id) throws Exception {
        for (Languages i:language) {
            if (i.getId()==id){
                return i;
            }
        }
       return null;
    }

    @Override
    public List<Languages> getAll() {
        return language;
    }
}
