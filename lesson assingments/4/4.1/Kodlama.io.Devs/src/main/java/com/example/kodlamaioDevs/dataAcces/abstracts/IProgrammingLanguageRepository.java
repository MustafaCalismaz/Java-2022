package com.example.kodlamaioDevs.dataAcces.abstracts;

import com.example.kodlamaioDevs.entities.concretes.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage,Integer> {

}
