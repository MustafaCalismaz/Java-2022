package com.example.kodlamaioDevs.business.abstracts;

import com.example.kodlamaioDevs.business.request.*;
import com.example.kodlamaioDevs.business.responses.GetAllProgrammingLanguageTechnologyResponse;
import com.example.kodlamaioDevs.business.responses.GetByIdProgrammingLanguageTechnologyResponse;

import java.util.List;

public interface IProgrammingLanguageTechnologyService {
    void add(CreateProgrammingLanguageTechnologyRequest createProgrammingLanguageTechnologyRequest) throws Exception;

    void delete(DeleteProgramingLanguageTechnologyRequest deleteProgramingLanguageTechnologyRequest);

    void update(UpdateProgramingLanguageTechnologyRequest updateProgramingLanguageTechnology);

    GetByIdProgrammingLanguageTechnologyResponse findById(int id) throws Exception;

    List<GetAllProgrammingLanguageTechnologyResponse> getAll();
}
