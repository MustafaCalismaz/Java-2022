package com.example.kodlamaioDevs.business.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateProgrammingLanguageTechnologyRequest {
    private String name;
    private int programmingLanguageId;
}
