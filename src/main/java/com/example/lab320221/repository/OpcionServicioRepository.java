package com.example.lab320221.repository;


import com.example.lab320221.entity.OpcionServicio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OpcionServicioRepository extends JpaRepository<OpcionServicio,Integer> {



    @Query(value=" select * from opcion_servicio where servicio_idservicio=?1 ",nativeQuery = true)
    List<OpcionServicio> OpcionxMascota(int id);




}
