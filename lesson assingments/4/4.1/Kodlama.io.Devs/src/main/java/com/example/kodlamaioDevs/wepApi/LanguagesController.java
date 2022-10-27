package com.example.kodlamaioDevs.wepApi;

import com.example.kodlamaioDevs.business.abstracts.ILanguageService;
import com.example.kodlamaioDevs.dataAcces.abstracts.ILanguageRepository;
import com.example.kodlamaioDevs.entities.concretes.Languages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/Languages")
public class LanguagesController {
    private ILanguageService iLanguageService;
    @Autowired
    public LanguagesController(ILanguageService iLanguageService) {
        this.iLanguageService = iLanguageService;
    }
    @GetMapping("add")
    public void add( Languages languages) throws Exception {
        iLanguageService.add(languages);
    }

    @GetMapping("delete")
    public void delete(@RequestParam int id) {
        iLanguageService.delete(id);
    }

    @GetMapping("update")
    public void update(Languages languages) {
        iLanguageService.update(languages);
    }

    @GetMapping("findbyid")
    public void findById(int id) {
        iLanguageService.findById(id);
    }

    @GetMapping("getall")
    public List<Languages> getAll(){
        return iLanguageService.getAll();
    }
}
