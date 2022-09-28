package com.example.lab320221.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "raza_especie")
public class RazaEspecie {
    @Id
    @Column(name = "idraza", nullable = false)
    private Integer id;

    @Column(name = "descripcion", nullable = false, length = 45)
    private String descripcion;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}