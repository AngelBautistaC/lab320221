package com.example.lab320221.entity;

import javax.persistence.*;

@Entity
@Table(name = "mascota")
public class Mascota {
    @Id
    @Column(name = "idmascota", nullable = false)
    private Integer id;

    @Column(name = "nombre", nullable = false, length = 45)
    private String nombre;

    @Column(name = "anho", nullable = false, length = 45)
    private String anho;

    @Lob
    @Column(name = "historia", nullable = false)
    private String historia;

    @Lob
    @Column(name = "observaciones", nullable = false)
    private String observaciones;

    @Column(name = "sexo", nullable = false, length = 45)
    private String sexo;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "raza_especie_idraza", nullable = false)
    private RazaEspecie razaEspecieIdraza;

    @Column(name = "raza_otros", length = 45)
    private String razaOtros;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cuenta_idcuenta")
    private Cuenta cuentaIdcuenta;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAnho() {
        return anho;
    }

    public void setAnho(String anho) {
        this.anho = anho;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public RazaEspecie getRazaEspecieIdraza() {
        return razaEspecieIdraza;
    }

    public void setRazaEspecieIdraza(RazaEspecie razaEspecieIdraza) {
        this.razaEspecieIdraza = razaEspecieIdraza;
    }

    public String getRazaOtros() {
        return razaOtros;
    }

    public void setRazaOtros(String razaOtros) {
        this.razaOtros = razaOtros;
    }

    public Cuenta getCuentaIdcuenta() {
        return cuentaIdcuenta;
    }

    public void setCuentaIdcuenta(Cuenta cuentaIdcuenta) {
        this.cuentaIdcuenta = cuentaIdcuenta;
    }

}