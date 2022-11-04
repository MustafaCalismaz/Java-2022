package com.example.kodlamaioDevs.business.concretes;

import com.example.kodlamaioDevs.business.abstracts.IProgramingLanguageService;
import com.example.kodlamaioDevs.business.request.CreateProgramingLanguageRequest;
import com.example.kodlamaioDevs.business.request.DeleteProgramingLanguageRequest;
import com.example.kodlamaioDevs.business.responses.GetAllProgramingLanguagesResponse;
import com.example.kodlamaioDevs.business.responses.GetByIdProgramingLanguageResponse;
import com.example.kodlamaioDevs.dataAcces.abstracts.ILanguageRepository;
import com.example.kodlamaioDevs.entities.concretes.ProgramingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
@Service
public class ProgramingLanguageManager implements IProgramingLanguageService {

    private final List<ProgramingLanguage> language;
    private final ILanguageRepository iLanguageRepository;
    @Autowired
    public ProgramingLanguageManager(ILanguageRepository iLanguageRepository, List<ProgramingLanguage> language) {
        this.language = language;
        this.iLanguageRepository = iLanguageRepository;
    }

    @Override
    public void add(CreateProgramingLanguageRequest createProgramingLanguageRequest) throws Exception {
            ProgramingLanguage programingLanguage = new ProgramingLanguage();
        if (!createProgramingLanguageRequest.getName().isBlank()){
            for (ProgramingLanguage l : iLanguageRepository.findAll()) {
                if (l.getName().equals(createProgramingLanguageRequest.getName())){
                    throw new Exception("isim ayni olamaz");
                }
            }
        }
        if (createProgramingLanguageRequest.getName().isEmpty()){
            throw new Exception("Programlama dili bos gecilemez");

        }

        programingLanguage.setName(createProgramingLanguageRequest.getName());
        iLanguageRepository.save(programingLanguage);
    }

    @Override
    public void delete(DeleteProgramingLanguageRequest deleteProgramingLanguageRequest) {
        iLanguageRepository.deleteById(deleteProgramingLanguageRequest.getId());
    }

    @Override
    public void update(ProgramingLanguage programingLanguage){
        for (ProgramingLanguage l : language) {
            if(l.getId()== programingLanguage.getId()){
                l.setName(programingLanguage.getName());
            }else {
                System.out.println("Id girmediniz");
            }
        }
    }

    @Override
    public ProgramingLanguage findById(GetByIdProgramingLanguageResponse getByIdProgramingLanguageResponse) {
        for (ProgramingLanguage i:language) {
            if (i.getId()==getByIdProgramingLanguageResponse.getId()){
                return iLanguageRepository.getReferenceById(getByIdProgramingLanguageResponse.getId());
            }
        }
        return null;
    }

    @Override
    public List<GetAllProgramingLanguagesResponse> getAll() {
        List<ProgramingLanguage> programingLanguages = iLanguageRepository.findAll();
        List<GetAllProgramingLanguagesResponse> getAllProgramingLanguagesResponses= new ArrayList<GetAllProgramingLanguagesResponse>();
        for (ProgramingLanguage programingLanguage:programingLanguages) {
            GetAllProgramingLanguagesResponse responseItem = new GetAllProgramingLanguagesResponse();
            responseItem.setId(programingLanguage.getId());
            responseItem.setName(programingLanguage.getName());
            getAllProgramingLanguagesResponses.add(responseItem);
        }
        return getAllProgramingLanguagesResponses;
    }

}
