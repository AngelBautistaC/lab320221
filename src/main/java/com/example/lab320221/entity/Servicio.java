package com.example.lab320221.entity;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "servicio")
public class Servicio {
    @Id
    @Column(name = "idservicio", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "mascota_idmascota", nullable = false)
    private Mascota mascotaIdmascota;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cuenta_idcuenta", nullable = false)
    private Cuenta cuentaIdcuenta;

    @Column(name = "hora_inicio", nullable = false)
    private Instant horaInicio;

    @Column(name = "duracion", nullable = false)
    private Integer duracion;

    @Lob
    @Column(name = "entrega", nullable = false)
    private String entrega;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "responsable_idresponsable", nullable = false)
    private Responsable responsableIdresponsable;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Mascota getMascotaIdmascota() {
        return mascotaIdmascota;
    }

    public void setMascotaIdmascota(Mascota mascotaIdmascota) {
        this.mascotaIdmascota = mascotaIdmascota;
    }

    public Cuenta getCuentaIdcuenta() {
        return cuentaIdcuenta;
    }

    public void setCuentaIdcuenta(Cuenta cuentaIdcuenta) {
        this.cuentaIdcuenta = cuentaIdcuenta;
    }

    public Instant getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Instant horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public String getEntrega() {
        return entrega;
    }

    public void setEntrega(String entrega) {
        this.entrega = entrega;
    }

    public Responsable getResponsableIdresponsable() {
        return responsableIdresponsable;
    }

    public void setResponsableIdresponsable(Responsable responsableIdresponsable) {
        this.responsableIdresponsable = responsableIdresponsable;
    }

}