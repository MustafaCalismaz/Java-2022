package com.example.kodlamaioDevs.business.concretes;

import com.example.kodlamaioDevs.business.abstracts.IProgrammingLanguageTechnologyService;
import com.example.kodlamaioDevs.business.request.CreateProgramingLanguageTechnologyRequest;
import com.example.kodlamaioDevs.business.request.DeleteProgramingLanguageTechnologyRequest;
import com.example.kodlamaioDevs.business.request.UpdateProgramingLanguageTechnologyRequest;
import com.example.kodlamaioDevs.business.responses.GetAllProgrammingLanguageTechnologyResponse;
import com.example.kodlamaioDevs.business.responses.GetByIdProgrammingLanguageTechnologyResponse;
import com.example.kodlamaioDevs.dataAcces.abstracts.IProgrammingLanguageTechnologyRepository;
import com.example.kodlamaioDevs.entities.concretes.ProgrammingLanguageTechnology;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProgrammingLanguageTecnologyManager implements IProgrammingLanguageTechnologyService {
    private final IProgrammingLanguageTechnologyRepository iProgrammingLanguageTechnologyRepository;
    public ProgrammingLanguageTecnologyManager(IProgrammingLanguageTechnologyRepository iProgrammingLanguageTechnologyRepository) {
        this.iProgrammingLanguageTechnologyRepository = iProgrammingLanguageTechnologyRepository;
    }

    @Override
    public void add(CreateProgramingLanguageTechnologyRequest createProgramingLanguageTechnologyRequest) throws Exception{
        ProgrammingLanguageTechnology programmingLanguageTechnology = new ProgrammingLanguageTechnology();
        programmingLanguageTechnology.setProgramingLanguage(createProgramingLanguageTechnologyRequest.getBelong());
        programmingLanguageTechnology.setName(createProgramingLanguageTechnologyRequest.getName());
        iProgrammingLanguageTechnologyRepository.save(programmingLanguageTechnology);

    }

    @Override
    public void delete(DeleteProgramingLanguageTechnologyRequest deleteProgramingLanguageTechnologyRequest) {
        iProgrammingLanguageTechnologyRepository.deleteById(deleteProgramingLanguageTechnologyRequest.getId());
    }

    @Override
    public void update(UpdateProgramingLanguageTechnologyRequest updateProgramingLanguageTechnology) {
        ProgrammingLanguageTechnology programmingLanguageTechnology = iProgrammingLanguageTechnologyRepository.getReferenceById(updateProgramingLanguageTechnology.getId());
        programmingLanguageTechnology.setProgramingLanguage(updateProgramingLanguageTechnology.getBelong());
        programmingLanguageTechnology.setName(updateProgramingLanguageTechnology.getName());
        iProgrammingLanguageTechnologyRepository.save(programmingLanguageTechnology);
    }

    @Override
    public GetByIdProgrammingLanguageTechnologyResponse findById(int id) throws Exception {
        List<ProgrammingLanguageTechnology> subLanguages = iProgrammingLanguageTechnologyRepository.findAll();
        GetByIdProgrammingLanguageTechnologyResponse getByIdProgrammingLanguageTechnologyResponse = null;

        for (ProgrammingLanguageTechnology programmingLanguageTechnology : subLanguages){
            if (programmingLanguageTechnology.getId()==id){
                getByIdProgrammingLanguageTechnologyResponse = new GetByIdProgrammingLanguageTechnologyResponse();
                getByIdProgrammingLanguageTechnologyResponse.setId(programmingLanguageTechnology.getId());
                getByIdProgrammingLanguageTechnologyResponse.setName(programmingLanguageTechnology.getName());
            }
        }
        if (getByIdProgrammingLanguageTechnologyResponse == null){
            throw new Exception("girilen id numarasina ait programlama dili teknolojisi bulunamadi");
        }

        return getByIdProgrammingLanguageTechnologyResponse;
    }

    @Override
    public List<GetAllProgrammingLanguageTechnologyResponse> getAll() {
        List<ProgrammingLanguageTechnology> programmingLanguageTechnologies = iProgrammingLanguageTechnologyRepository.findAll();
        List<GetAllProgrammingLanguageTechnologyResponse> getAllProgrammingLanguageTechnologyResponses = new ArrayList<GetAllProgrammingLanguageTechnologyResponse>();

        for (ProgrammingLanguageTechnology programmingLanguageTechnology: programmingLanguageTechnologies) {
            GetAllProgrammingLanguageTechnologyResponse responseItem = new GetAllProgrammingLanguageTechnologyResponse();
            responseItem.setId(programmingLanguageTechnology.getId());
            responseItem.setName(programmingLanguageTechnology.getName());
            getAllProgrammingLanguageTechnologyResponses.add(responseItem);
        }
        return getAllProgrammingLanguageTechnologyResponses;
    }


}
