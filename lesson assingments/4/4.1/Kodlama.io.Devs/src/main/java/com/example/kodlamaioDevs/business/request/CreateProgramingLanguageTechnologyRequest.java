package com.example.kodlamaioDevs.business.request;

import com.example.kodlamaioDevs.entities.concretes.ProgrammingLanguage;
import com.example.kodlamaioDevs.entities.concretes.ProgrammingLanguageTechnology;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateProgramingLanguageTechnologyRequest {
    private String name;
    private ProgrammingLanguage belong;
}
