package com.example.lab320221.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "opcion")
public class Opcion {
    @Id
    @Column(name = "idopcion", nullable = false)
    private Integer id;

    @Column(name = "descripcion", nullable = false, length = 45)
    private String descripcion;

    @Column(name = "tiempo_minutos", nullable = false)
    private Integer tiempoMinutos;

    @Column(name = "precio", nullable = false)
    private Float precio;

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

    public Integer getTiempoMinutos() {
        return tiempoMinutos;
    }

    public void setTiempoMinutos(Integer tiempoMinutos) {
        this.tiempoMinutos = tiempoMinutos;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

}