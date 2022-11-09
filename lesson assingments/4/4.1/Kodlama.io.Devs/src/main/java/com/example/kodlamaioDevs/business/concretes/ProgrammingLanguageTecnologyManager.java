package com.example.kodlamaioDevs.business.concretes;

import com.example.kodlamaioDevs.business.abstracts.IProgrammingLanguageTechnologyService;
import com.example.kodlamaioDevs.business.request.CreateProgrammingLanguageTechnologyRequest;
import com.example.kodlamaioDevs.business.request.DeleteProgramingLanguageTechnologyRequest;
import com.example.kodlamaioDevs.business.request.UpdateProgramingLanguageTechnologyRequest;
import com.example.kodlamaioDevs.business.responses.GetAllProgrammingLanguageTechnologyResponse;
import com.example.kodlamaioDevs.business.responses.GetByIdProgrammingLanguageTechnologyResponse;
import com.example.kodlamaioDevs.dataAcces.abstracts.IProgrammingLanguageRepository;
import com.example.kodlamaioDevs.dataAcces.abstracts.IProgrammingLanguageTechnologyRepository;
import com.example.kodlamaioDevs.entities.concretes.ProgrammingLanguage;
import com.example.kodlamaioDevs.entities.concretes.ProgrammingLanguageTechnology;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProgrammingLanguageTecnologyManager implements IProgrammingLanguageTechnologyService {
    private final IProgrammingLanguageTechnologyRepository iProgrammingLanguageTechnologyRepository;
    private final IProgrammingLanguageRepository iProgrammingLanguageRepository;

    @Autowired
    public ProgrammingLanguageTecnologyManager(IProgrammingLanguageTechnologyRepository iProgrammingLanguageTechnologyRepository, IProgrammingLanguageRepository iProgrammingLanguageRepository) {
        this.iProgrammingLanguageTechnologyRepository = iProgrammingLanguageTechnologyRepository;
        this.iProgrammingLanguageRepository = iProgrammingLanguageRepository;
    }

    @Override
    public void add(CreateProgrammingLanguageTechnologyRequest createProgrammingLanguageTechnologyRequest) throws Exception {
        ProgrammingLanguage programmingLanguage = iProgrammingLanguageRepository.findById(createProgrammingLanguageTechnologyRequest.getProgrammingLanguageId()).get();
        ProgrammingLanguageTechnology programmingLanguageTechnology = new ProgrammingLanguageTechnology();
        programmingLanguageTechnology.setName(createProgrammingLanguageTechnologyRequest.getName());
        programmingLanguageTechnology.setBelong(programmingLanguage);
        iProgrammingLanguageTechnologyRepository.save(programmingLanguageTechnology);

    }

    @Override
    public void delete(DeleteProgramingLanguageTechnologyRequest deleteProgramingLanguageTechnologyRequest) {
        iProgrammingLanguageTechnologyRepository.deleteById(deleteProgramingLanguageTechnologyRequest.getId());
    }

    @Override
    public void update(UpdateProgramingLanguageTechnologyRequest updateProgramingLanguageTechnology) {
        ProgrammingLanguageTechnology programmingLanguageTechnology = iProgrammingLanguageTechnologyRepository.getReferenceById(updateProgramingLanguageTechnology.getId());
        ProgrammingLanguage programmingLanguage = iProgrammingLanguageRepository.getReferenceById(updateProgramingLanguageTechnology.getProgrammingLanguageId());
        programmingLanguageTechnology.setName(updateProgramingLanguageTechnology.getName());
        programmingLanguageTechnology.setBelong(programmingLanguage);
        iProgrammingLanguageTechnologyRepository.save(programmingLanguageTechnology);
    }

    @Override
    public GetByIdProgrammingLanguageTechnologyResponse findById(int id) throws Exception {
        List<ProgrammingLanguageTechnology> subLanguages = iProgrammingLanguageTechnologyRepository.findAll();
        GetByIdProgrammingLanguageTechnologyResponse getByIdProgrammingLanguageTechnologyResponse = null;

        for (ProgrammingLanguageTechnology programmingLanguageTechnology : subLanguages) {
            if (programmingLanguageTechnology.getId() == id) {
                getByIdProgrammingLanguageTechnologyResponse = new GetByIdProgrammingLanguageTechnologyResponse();
                getByIdProgrammingLanguageTechnologyResponse.setId(programmingLanguageTechnology.getId());
                getByIdProgrammingLanguageTechnologyResponse.setName(programmingLanguageTechnology.getName());
            }
        }
        if (getByIdProgrammingLanguageTechnologyResponse == null) {
            throw new Exception("girilen id numarasina ait programlama dili teknolojisi bulunamadi");
        }

        return getByIdProgrammingLanguageTechnologyResponse;
    }

    @Override
    public List<GetAllProgrammingLanguageTechnologyResponse> getAll() {
        List<ProgrammingLanguageTechnology> programmingLanguageTechnologies = iProgrammingLanguageTechnologyRepository.findAll();
        List<GetAllProgrammingLanguageTechnologyResponse> getAllProgrammingLanguageTechnologyResponses = new ArrayList<GetAllProgrammingLanguageTechnologyResponse>();

        for (ProgrammingLanguageTechnology programmingLanguageTechnology : programmingLanguageTechnologies) {
            GetAllProgrammingLanguageTechnologyResponse responseItem = new GetAllProgrammingLanguageTechnologyResponse();
            responseItem.setId(programmingLanguageTechnology.getId());
            responseItem.setName(programmingLanguageTechnology.getName());
            responseItem.setBelong(programmingLanguageTechnology.getBelong());
            getAllProgrammingLanguageTechnologyResponses.add(responseItem);
        }
        return getAllProgrammingLanguageTechnologyResponses;
    }


}
