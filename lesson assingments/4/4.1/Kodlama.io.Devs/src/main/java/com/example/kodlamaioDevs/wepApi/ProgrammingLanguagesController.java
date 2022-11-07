package com.example.kodlamaioDevs.wepApi;

import com.example.kodlamaioDevs.business.abstracts.IProgrammingLanguageService;
import com.example.kodlamaioDevs.business.request.CreateProgrammingLanguageRequest;
import com.example.kodlamaioDevs.business.request.DeleteProgrammingLanguageRequest;
import com.example.kodlamaioDevs.business.request.UpdateProgrammingLanguageRequest;
import com.example.kodlamaioDevs.business.responses.GetAllProgrammingLanguagesResponse;
import com.example.kodlamaioDevs.business.responses.GetByIdProgrammingLanguageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
public class ProgrammingLanguagesController {
    private IProgrammingLanguageService iLanguageService;

    @Autowired
    public ProgrammingLanguagesController(IProgrammingLanguageService iLanguageService) {
        this.iLanguageService = iLanguageService;
    }

    @PostMapping("/add")
    public void add(@RequestBody CreateProgrammingLanguageRequest createProgramingLanguageRequest) throws Exception {
        iLanguageService.add(createProgramingLanguageRequest);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(DeleteProgrammingLanguageRequest deleteProgramingLanguageRequest) {
        iLanguageService.delete(deleteProgramingLanguageRequest);
    }

    @PutMapping("/update")
    public void update(UpdateProgrammingLanguageRequest updateProgramingLanguageRequest) {
        iLanguageService.update(updateProgramingLanguageRequest);
    }

    @GetMapping("/findbyid/{id}")
    public GetByIdProgrammingLanguageResponse findById(@PathVariable int id) throws Exception {
       return iLanguageService.findById(id);
    }

    @GetMapping("/getall")
    public List<GetAllProgrammingLanguagesResponse> getAll() {
        return iLanguageService.getAll();
    }
}
