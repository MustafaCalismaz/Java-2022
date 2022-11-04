package com.example.kodlamaioDevs.business.abstracts;

import com.example.kodlamaioDevs.business.request.CreateProgramingLanguageRequest;
import com.example.kodlamaioDevs.business.request.DeleteProgramingLanguageRequest;
import com.example.kodlamaioDevs.business.responses.GetAllProgramingLanguagesResponse;
import com.example.kodlamaioDevs.business.responses.GetByIdProgramingLanguageResponse;
import com.example.kodlamaioDevs.entities.concretes.ProgramingLanguage;


import java.util.List;
public interface IProgramingLanguageService {
    void add(CreateProgramingLanguageRequest createProgramingLanguageRequest) throws Exception;

    void delete(DeleteProgramingLanguageRequest deleteProgramingLanguageRequest);

    void update(ProgramingLanguage programingLanguage);

    ProgramingLanguage findById(GetByIdProgramingLanguageResponse getByIdProgramingLanguageResponse);

    List<GetAllProgramingLanguagesResponse> getAll();

}
