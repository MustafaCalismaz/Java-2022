package com.example.kodlamaioDevs.business.abstracts;

import com.example.kodlamaioDevs.business.request.CreateProgrammingLanguageRequest;
import com.example.kodlamaioDevs.business.request.DeleteProgrammingLanguageRequest;
import com.example.kodlamaioDevs.business.request.UpdateProgrammingLanguageRequest;
import com.example.kodlamaioDevs.business.responses.GetAllProgrammingLanguagesResponse;
import com.example.kodlamaioDevs.business.responses.GetByIdProgrammingLanguageResponse;


import java.util.List;
public interface IProgrammingLanguageService {
    void add(CreateProgrammingLanguageRequest createProgramingLanguageRequest) throws Exception;

    void delete(DeleteProgrammingLanguageRequest deleteProgramingLanguageRequest);

    void update(UpdateProgrammingLanguageRequest updateProgramingLanguageRequest);

    GetByIdProgrammingLanguageResponse findById(int id) throws Exception;

    List<GetAllProgrammingLanguagesResponse> getAll();

}
