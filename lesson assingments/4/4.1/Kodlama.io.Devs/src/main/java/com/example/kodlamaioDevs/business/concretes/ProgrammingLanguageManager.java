package com.example.kodlamaioDevs.business.concretes;

import com.example.kodlamaioDevs.business.abstracts.IProgrammingLanguageService;
import com.example.kodlamaioDevs.business.request.CreateProgrammingLanguageRequest;
import com.example.kodlamaioDevs.business.request.DeleteProgrammingLanguageRequest;
import com.example.kodlamaioDevs.business.request.UpdateProgrammingLanguageRequest;
import com.example.kodlamaioDevs.business.responses.GetAllProgrammingLanguagesResponse;
import com.example.kodlamaioDevs.business.responses.GetByIdProgrammingLanguageResponse;
import com.example.kodlamaioDevs.dataAcces.abstracts.IProgrammingLanguageRepository;
import com.example.kodlamaioDevs.entities.concretes.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class ProgrammingLanguageManager implements IProgrammingLanguageService {

    private final IProgrammingLanguageRepository iProgramingLanguageRepository;

    @Autowired
    public ProgrammingLanguageManager(IProgrammingLanguageRepository iProgramingLanguageRepository) {
        this.iProgramingLanguageRepository = iProgramingLanguageRepository;
    }

    @Override
    public void add(CreateProgrammingLanguageRequest createProgramingLanguageRequest) throws Exception {
        ProgrammingLanguage programingLanguage = new ProgrammingLanguage();
        if (!createProgramingLanguageRequest.getName().isBlank()) {
            for (ProgrammingLanguage l : iProgramingLanguageRepository.findAll()) {
                if (l.getName().equals(createProgramingLanguageRequest.getName())) {
                    throw new Exception("isim ayni olamaz");
                }
            }
        }
        if (createProgramingLanguageRequest.getName().isEmpty()) {
            throw new Exception("Programlama dili bos gecilemez");

        }

        programingLanguage.setName(createProgramingLanguageRequest.getName());
        iProgramingLanguageRepository.save(programingLanguage);
    }

    @Override
    public void delete(DeleteProgrammingLanguageRequest deleteProgramingLanguageRequest) {
        iProgramingLanguageRepository.deleteById(deleteProgramingLanguageRequest.getId());
    }

    @Override
    public void update(UpdateProgrammingLanguageRequest updateProgramingLanguageRequest) {
        ProgrammingLanguage programingLanguage = iProgramingLanguageRepository.getReferenceById(updateProgramingLanguageRequest.getId());
        programingLanguage.setName(updateProgramingLanguageRequest.getName());
        iProgramingLanguageRepository.save(programingLanguage);
    }

    @Override
    public GetByIdProgrammingLanguageResponse findById(int id) throws Exception {
        List<ProgrammingLanguage> languages = iProgramingLanguageRepository.findAll();
        GetByIdProgrammingLanguageResponse getByIdProgramingLanguageResponse = null;

        for (ProgrammingLanguage programingLanguageTemp : languages) {
            if (programingLanguageTemp.getId() == id) {
                getByIdProgramingLanguageResponse = new GetByIdProgrammingLanguageResponse();
                getByIdProgramingLanguageResponse.setId(programingLanguageTemp.getId());
                getByIdProgramingLanguageResponse.setName(programingLanguageTemp.getName());
            }
        }
        if (getByIdProgramingLanguageResponse == null) {
            throw new Exception("Girilen id numarasina ait programlama dili bulunamadi");
        }
        return getByIdProgramingLanguageResponse;
    }

    @Override
    public List<GetAllProgrammingLanguagesResponse> getAll() {
        List<ProgrammingLanguage> programingLanguages = iProgramingLanguageRepository.findAll();
        List<GetAllProgrammingLanguagesResponse> getAllProgrammingLanguagesRespons = new ArrayList<GetAllProgrammingLanguagesResponse>();
        for (ProgrammingLanguage programingLanguage : programingLanguages) {
            GetAllProgrammingLanguagesResponse responseItem = new GetAllProgrammingLanguagesResponse();
            responseItem.setId(programingLanguage.getId());
            responseItem.setName(programingLanguage.getName());
            getAllProgrammingLanguagesRespons.add(responseItem);
        }
        return getAllProgrammingLanguagesRespons;
    }

}
