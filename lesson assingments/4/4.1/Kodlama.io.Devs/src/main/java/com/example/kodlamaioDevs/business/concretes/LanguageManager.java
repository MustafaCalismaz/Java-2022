package com.example.kodlamaioDevs.business.concretes;

import com.example.kodlamaioDevs.business.abstracts.ILanguageService;
import com.example.kodlamaioDevs.dataAcces.abstracts.ILanguageRepository;
import com.example.kodlamaioDevs.entities.concretes.Languages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class LanguageManager implements ILanguageService{

    private ILanguageRepository iLanguageRepository;
    @Autowired
    public LanguageManager(ILanguageRepository iLanguageRepository) {
        this.iLanguageRepository = iLanguageRepository;
    }

    @Override
    public void add(Languages languages) throws Exception {
        if (languages!=null){
            for (Languages l : iLanguageRepository.getAll()) {
                if (l.getName().equals(languages.getName())){
                    throw new Exception("isim ayni olamaz");
                }
            }
            iLanguageRepository.add(languages);
        }else {
            throw new Exception("Programlama dili bos gecilemez");
        }
    }

    @Override
    public void delete(int id) {
        iLanguageRepository.delete(id);
    }

    @Override
    public void update(Languages languages) {
        iLanguageRepository.update(languages);
    }

    @Override
    public Languages findById(int id) {
        return findById(id);
    }

    @Override
    public List<Languages> getAll() {
        return iLanguageRepository.getAll();
    }

}
