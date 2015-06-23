/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.entities;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author jusan
 */
@Entity
@Table(name = "tra_hoja_ruta_cabecera")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TraHojaRutaCabecera.findAll", query = "SELECT t FROM TraHojaRutaCabecera t"),
    @NamedQuery(name = "TraHojaRutaCabecera.findByHrcIdPk", query = "SELECT t FROM TraHojaRutaCabecera t WHERE t.hrcIdPk = :hrcIdPk"),
    @NamedQuery(name = "TraHojaRutaCabecera.findByAudEliminado", query = "SELECT t FROM TraHojaRutaCabecera t WHERE t.audEliminado = :audEliminado"),
    @NamedQuery(name = "TraHojaRutaCabecera.findByAudFechaInsercion", query = "SELECT t FROM TraHojaRutaCabecera t WHERE t.audFechaInsercion = :audFechaInsercion"),
    @NamedQuery(name = "TraHojaRutaCabecera.findByAudFechaModificacion", query = "SELECT t FROM TraHojaRutaCabecera t WHERE t.audFechaModificacion = :audFechaModificacion"),
    @NamedQuery(name = "TraHojaRutaCabecera.findByAudUsuarioInserto", query = "SELECT t FROM TraHojaRutaCabecera t WHERE t.audUsuarioInserto = :audUsuarioInserto"),
    @NamedQuery(name = "TraHojaRutaCabecera.findByAudUsuarioModifico", query = "SELECT t FROM TraHojaRutaCabecera t WHERE t.audUsuarioModifico = :audUsuarioModifico"),
    @NamedQuery(name = "TraHojaRutaCabecera.findByHrcCobroCuenca", query = "SELECT t FROM TraHojaRutaCabecera t WHERE t.hrcCobroCuenca = :hrcCobroCuenca"),
    @NamedQuery(name = "TraHojaRutaCabecera.findByHrcCobroRuta", query = "SELECT t FROM TraHojaRutaCabecera t WHERE t.hrcCobroRuta = :hrcCobroRuta"),
    @NamedQuery(name = "TraHojaRutaCabecera.findByHrcFecha", query = "SELECT t FROM TraHojaRutaCabecera t WHERE t.hrcFecha = :hrcFecha"),
    @NamedQuery(name = "TraHojaRutaCabecera.findByHrcFletePagado", query = "SELECT t FROM TraHojaRutaCabecera t WHERE t.hrcFletePagado = :hrcFletePagado"),
    @NamedQuery(name = "TraHojaRutaCabecera.findByHrcNumero", query = "SELECT t FROM TraHojaRutaCabecera t WHERE t.hrcNumero = :hrcNumero"),
    @NamedQuery(name = "TraHojaRutaCabecera.findByHrcPorcentaje", query = "SELECT t FROM TraHojaRutaCabecera t WHERE t.hrcPorcentaje = :hrcPorcentaje"),
    @NamedQuery(name = "TraHojaRutaCabecera.findByHrcPropietario", query = "SELECT t FROM TraHojaRutaCabecera t WHERE t.hrcPropietario = :hrcPropietario"),
    @NamedQuery(name = "TraHojaRutaCabecera.findByHrcRuta", query = "SELECT t FROM TraHojaRutaCabecera t WHERE t.hrcRuta = :hrcRuta"),
    @NamedQuery(name = "TraHojaRutaCabecera.findByHrcTotalPagar", query = "SELECT t FROM TraHojaRutaCabecera t WHERE t.hrcTotalPagar = :hrcTotalPagar")})
public class TraHojaRutaCabecera implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "hrc_id_pk")
    private Long hrcIdPk;
    @Size(max = 1)
    @Column(name = "aud_eliminado")
    private String audEliminado;
    @Column(name = "aud_fecha_insercion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date audFechaInsercion;
    @Column(name = "aud_fecha_modificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date audFechaModificacion;
    @Size(max = 255)
    @Column(name = "aud_usuario_inserto")
    private String audUsuarioInserto;
    @Size(max = 255)
    @Column(name = "aud_usuario_modifico")
    private String audUsuarioModifico;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "hrc_cobro_cuenca")
    private Double hrcCobroCuenca;
    @Column(name = "hrc_cobro_ruta")
    private Double hrcCobroRuta;
    @Column(name = "hrc_fecha")
    @Temporal(TemporalType.DATE)
    private Date hrcFecha;
    @Column(name = "hrc_flete_pagado")
    private Double hrcFletePagado;
    @Column(name = "hrc_numero")
    private BigInteger hrcNumero;
    @Column(name = "hrc_porcentaje")
    private Double hrcPorcentaje;
    @Size(max = 100)
    @Column(name = "hrc_propietario")
    private String hrcPropietario;
    @Size(max = 200)
    @Column(name = "hrc_ruta")
    private String hrcRuta;
    @Column(name = "hrc_total_pagar")
    private Double hrcTotalPagar;
    @OneToMany(mappedBy = "hrcHrdFk")
    private List<TraHojaRutaDetalle> traHojaRutaDetalleList;
    @JoinColumn(name = "per_hrc_fk", referencedColumnName = "per_id_pk")
    @ManyToOne
    private TraPersona perHrcFk;

    public TraHojaRutaCabecera() {
    }

    public TraHojaRutaCabecera(Long hrcIdPk) {
        this.hrcIdPk = hrcIdPk;
    }

    public Long getHrcIdPk() {
        return hrcIdPk;
    }

    public void setHrcIdPk(Long hrcIdPk) {
        this.hrcIdPk = hrcIdPk;
    }

    public String getAudEliminado() {
        return audEliminado;
    }

    public void setAudEliminado(String audEliminado) {
        this.audEliminado = audEliminado;
    }

    public Date getAudFechaInsercion() {
        return audFechaInsercion;
    }

    public void setAudFechaInsercion(Date audFechaInsercion) {
        this.audFechaInsercion = audFechaInsercion;
    }

    public Date getAudFechaModificacion() {
        return audFechaModificacion;
    }

    public void setAudFechaModificacion(Date audFechaModificacion) {
        this.audFechaModificacion = audFechaModificacion;
    }

    public String getAudUsuarioInserto() {
        return audUsuarioInserto;
    }

    public void setAudUsuarioInserto(String audUsuarioInserto) {
        this.audUsuarioInserto = audUsuarioInserto;
    }

    public String getAudUsuarioModifico() {
        return audUsuarioModifico;
    }

    public void setAudUsuarioModifico(String audUsuarioModifico) {
        this.audUsuarioModifico = audUsuarioModifico;
    }

    public Double getHrcCobroCuenca() {
        return hrcCobroCuenca;
    }

    public void setHrcCobroCuenca(Double hrcCobroCuenca) {
        this.hrcCobroCuenca = hrcCobroCuenca;
    }

    public Double getHrcCobroRuta() {
        return hrcCobroRuta;
    }

    public void setHrcCobroRuta(Double hrcCobroRuta) {
        this.hrcCobroRuta = hrcCobroRuta;
    }

    public Date getHrcFecha() {
        return hrcFecha;
    }

    public void setHrcFecha(Date hrcFecha) {
        this.hrcFecha = hrcFecha;
    }

    public Double getHrcFletePagado() {
        return hrcFletePagado;
    }

    public void setHrcFletePagado(Double hrcFletePagado) {
        this.hrcFletePagado = hrcFletePagado;
    }

    public BigInteger getHrcNumero() {
        return hrcNumero;
    }

    public void setHrcNumero(BigInteger hrcNumero) {
        this.hrcNumero = hrcNumero;
    }

    public Double getHrcPorcentaje() {
        return hrcPorcentaje;
    }

    public void setHrcPorcentaje(Double hrcPorcentaje) {
        this.hrcPorcentaje = hrcPorcentaje;
    }

    public String getHrcPropietario() {
        return hrcPropietario;
    }

    public void setHrcPropietario(String hrcPropietario) {
        this.hrcPropietario = hrcPropietario;
    }

    public String getHrcRuta() {
        return hrcRuta;
    }

    public void setHrcRuta(String hrcRuta) {
        this.hrcRuta = hrcRuta;
    }

    public Double getHrcTotalPagar() {
        return hrcTotalPagar;
    }

    public void setHrcTotalPagar(Double hrcTotalPagar) {
        this.hrcTotalPagar = hrcTotalPagar;
    }

    @XmlTransient
    public List<TraHojaRutaDetalle> getTraHojaRutaDetalleList() {
        return traHojaRutaDetalleList;
    }

    public void setTraHojaRutaDetalleList(List<TraHojaRutaDetalle> traHojaRutaDetalleList) {
        this.traHojaRutaDetalleList = traHojaRutaDetalleList;
    }

    public TraPersona getPerHrcFk() {
        return perHrcFk;
    }

    public void setPerHrcFk(TraPersona perHrcFk) {
        this.perHrcFk = perHrcFk;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (hrcIdPk != null ? hrcIdPk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TraHojaRutaCabecera)) {
            return false;
        }
        TraHojaRutaCabecera other = (TraHojaRutaCabecera) object;
        if ((this.hrcIdPk == null && other.hrcIdPk != null) || (this.hrcIdPk != null && !this.hrcIdPk.equals(other.hrcIdPk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.ups.entities.TraHojaRutaCabecera[ hrcIdPk=" + hrcIdPk + " ]";
    }
    
}
