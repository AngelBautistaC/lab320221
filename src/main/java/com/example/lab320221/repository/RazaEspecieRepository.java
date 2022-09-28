package com.example.lab320221.repository;

import com.example.lab320221.entity.RazaEspecie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RazaEspecieRepository extends JpaRepository<RazaEspecie, Integer> {
}
