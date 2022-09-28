package com.example.lab320221.repository;

import com.example.lab320221.entity.ListaMascotasDto;
import com.example.lab320221.entity.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MascotaRepository extends JpaRepository<Mascota,Integer> {

    @Query(value= """
            select m.idmascota as id,m.nombre as nombre,m.anho as anho,m.sexo as sexo,m.raza_especie_idraza as idraza,m.raza_otros as razaotros,count(s.entrega) as contadorservicios,r.descripcion as descripcion from mascota m
            left join servicio s on (m.idmascota=s.mascota_idmascota)
            inner join raza_especie r on (r.idraza=m.raza_especie_idraza)
            group by m.idmascota""",nativeQuery = true)
    List<ListaMascotasDto> obtenerListaMascotas();



    @Query(value= """
            select m.idmascota as id,m.nombre as nombre,m.anho as anho,m.sexo as sexo,m.raza_especie_idraza as idraza,m.raza_otros as razaotros,count(s.entrega) as contadorservicios,r.descripcion as descripcion from mascota m
            left join servicio s on (m.idmascota=s.mascota_idmascota)
            inner join raza_especie r on (r.idraza=m.raza_especie_idraza)
            where lower(m.sexo) like lower(concat('%',?1,'%'))  OR lower(r.descripcion) like lower(concat('%',?1,'%'))
            group by m.idmascota""" ,nativeQuery = true)
    List<ListaMascotasDto> buscaMascotas(String searchField);


}
