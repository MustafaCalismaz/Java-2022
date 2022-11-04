package com.example.kodlamaioDevs.dataAcces.abstracts;

import com.example.kodlamaioDevs.entities.concretes.ProgramingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILanguageRepository extends JpaRepository<ProgramingLanguage,Integer> {

}
