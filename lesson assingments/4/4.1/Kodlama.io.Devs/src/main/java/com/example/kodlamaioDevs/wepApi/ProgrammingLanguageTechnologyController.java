package com.example.kodlamaioDevs.wepApi;

import com.example.kodlamaioDevs.business.abstracts.IProgrammingLanguageTechnologyService;
import com.example.kodlamaioDevs.business.request.CreateProgramingLanguageTechnologyRequest;
import com.example.kodlamaioDevs.business.request.DeleteProgramingLanguageTechnologyRequest;
import com.example.kodlamaioDevs.business.request.UpdateProgramingLanguageTechnologyRequest;
import com.example.kodlamaioDevs.business.responses.GetAllProgrammingLanguageTechnologyResponse;
import com.example.kodlamaioDevs.business.responses.GetByIdProgrammingLanguageTechnologyResponse;
import com.example.kodlamaioDevs.entities.concretes.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/languagestechnology")
public class ProgrammingLanguageTechnologyController {
    private IProgrammingLanguageTechnologyService iProgrammingLanguageTechnologyService;

    @Autowired
    public ProgrammingLanguageTechnologyController(IProgrammingLanguageTechnologyService iProgrammingLanguageTechnologyService) {
        this.iProgrammingLanguageTechnologyService = iProgrammingLanguageTechnologyService;
    }

    @PostMapping("/add")
    public void add(CreateProgramingLanguageTechnologyRequest createProgramingLanguageTechnologyRequest) throws Exception {
        iProgrammingLanguageTechnologyService.add(createProgramingLanguageTechnologyRequest);
    }

    @DeleteMapping("/delete{id}")
    public void delete(DeleteProgramingLanguageTechnologyRequest deleteProgramingLanguageTechnologyRequest){
        iProgrammingLanguageTechnologyService.delete(deleteProgramingLanguageTechnologyRequest);
    }

    @PutMapping("/update")
    public void update(UpdateProgramingLanguageTechnologyRequest updateProgramingLanguageTechnologyRequest){
        iProgrammingLanguageTechnologyService.update(updateProgramingLanguageTechnologyRequest);
    }

    @GetMapping("/findbyid/{id}")
    public GetByIdProgrammingLanguageTechnologyResponse findById(@PathVariable int id) throws Exception{
        return iProgrammingLanguageTechnologyService.findById(id);
    }

    @GetMapping("/getall")
    public List<GetAllProgrammingLanguageTechnologyResponse> getAll(){
        return iProgrammingLanguageTechnologyService.getAll();
    }
}

