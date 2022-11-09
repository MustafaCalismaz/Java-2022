package com.example.kodlamaioDevs.business.responses;


import com.example.kodlamaioDevs.entities.concretes.ProgrammingLanguage;
import com.example.kodlamaioDevs.entities.concretes.ProgrammingLanguageTechnology;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllProgrammingLanguagesResponse {
    private int id;
    private String name;
}
