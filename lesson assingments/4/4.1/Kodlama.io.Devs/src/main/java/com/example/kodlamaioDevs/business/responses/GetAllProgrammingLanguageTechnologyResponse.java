package com.example.kodlamaioDevs.business.responses;

import com.example.kodlamaioDevs.entities.concretes.ProgrammingLanguage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllProgrammingLanguageTechnologyResponse {
    private int id;
    private String name;
    private ProgrammingLanguage belong;
}
