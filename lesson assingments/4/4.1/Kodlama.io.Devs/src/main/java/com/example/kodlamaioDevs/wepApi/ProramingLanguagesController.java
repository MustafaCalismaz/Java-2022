package com.example.kodlamaioDevs.wepApi;

import com.example.kodlamaioDevs.business.abstracts.IProgramingLanguageService;
import com.example.kodlamaioDevs.business.request.CreateProgramingLanguageRequest;
import com.example.kodlamaioDevs.business.request.DeleteProgramingLanguageRequest;
import com.example.kodlamaioDevs.business.responses.GetAllProgramingLanguagesResponse;
import com.example.kodlamaioDevs.business.responses.GetByIdProgramingLanguageResponse;
import com.example.kodlamaioDevs.entities.concretes.ProgramingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
public class ProramingLanguagesController {
    private IProgramingLanguageService iLanguageService;

    @Autowired
    public ProramingLanguagesController(IProgramingLanguageService iLanguageService) {
        this.iLanguageService = iLanguageService;
    }

    @PostMapping("/add")
    public void add(@RequestBody CreateProgramingLanguageRequest createProgramingLanguageRequest) throws Exception {
        iLanguageService.add(createProgramingLanguageRequest);
    }

    @DeleteMapping("/delete")
    public void delete(DeleteProgramingLanguageRequest deleteProgramingLanguageRequest) {
        iLanguageService.delete(deleteProgramingLanguageRequest);
    }

    @PutMapping("/update")
    public void update(ProgramingLanguage programingLanguage) {
        iLanguageService.update(programingLanguage);
    }

    @GetMapping("/findbyid")
    public void findById(@RequestBody GetByIdProgramingLanguageResponse getByIdProgramingLanguageResponse) {
        iLanguageService.findById(getByIdProgramingLanguageResponse);
    }

    @GetMapping("/getall")
    public List<GetAllProgramingLanguagesResponse> getAll() {
        return iLanguageService.getAll();
    }
}
