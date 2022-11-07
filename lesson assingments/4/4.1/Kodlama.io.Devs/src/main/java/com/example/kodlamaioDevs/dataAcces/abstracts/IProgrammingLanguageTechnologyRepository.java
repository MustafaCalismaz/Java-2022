package com.example.kodlamaioDevs.dataAcces.abstracts;

import com.example.kodlamaioDevs.entities.concretes.ProgrammingLanguageTechnology;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProgrammingLanguageTechnologyRepository extends JpaRepository<ProgrammingLanguageTechnology,Integer> {
}
