package com.example.kodlamaioDevs.wepApi;

import com.example.kodlamaioDevs.business.abstracts.ILanguageService;
import com.example.kodlamaioDevs.entities.concretes.Languages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {
    private ILanguageService iLanguageService;
    @Autowired
    public LanguagesController(ILanguageService iLanguageService) {
        this.iLanguageService = iLanguageService;
    }
    @PostMapping("/id")
    public void add(@RequestBody Languages languages) throws Exception {
        iLanguageService.add(languages);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") int id) {
        iLanguageService.delete(id);
    }

    @PutMapping("/update")
    public void update(Languages languages) {
        iLanguageService.update(languages);
    }

    @GetMapping("{id}")
    public void findById(@PathVariable("id") int id) {
        iLanguageService.findById(id);
    }

    @GetMapping("/getall")
    public List<Languages> getAll(){
        return iLanguageService.getAll();
    }
}
