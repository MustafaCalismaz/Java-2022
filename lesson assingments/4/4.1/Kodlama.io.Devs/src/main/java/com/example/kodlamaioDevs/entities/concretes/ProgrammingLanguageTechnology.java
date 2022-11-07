package com.example.kodlamaioDevs.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "programingLanguagesTechonology")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ProgrammingLanguageTechnology {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_programming_language_technology")
    private int id;

    @Column(name = "name_programming_language_technology")
    private String name;

    @ManyToOne
    @JoinColumn(name = "id_programin_language", referencedColumnName = "id")
    private ProgrammingLanguage programingLanguage;
}
