package com.example.kodlamaioDevs.entities.concretes;

import lombok.*;
import javax.persistence.*;

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
    @JoinColumn(name = "id_programming_languages",referencedColumnName = "id")
    private ProgrammingLanguage belong;
}