/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.entities;

import java.io.Serializable;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author jusan
 */
@Entity
@Table(name = "tra_seccion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TraSeccion.findAll", query = "SELECT t FROM TraSeccion t"),
    @NamedQuery(name = "TraSeccion.findBySecId", query = "SELECT t FROM TraSeccion t WHERE t.secId = :secId"),
    @NamedQuery(name = "TraSeccion.findBySecDescripcion", query = "SELECT t FROM TraSeccion t WHERE t.secDescripcion = :secDescripcion"),
    @NamedQuery(name = "TraSeccion.findBySecEtiqueta", query = "SELECT t FROM TraSeccion t WHERE t.secEtiqueta = :secEtiqueta"),
    @NamedQuery(name = "TraSeccion.findBySecNombreClave", query = "SELECT t FROM TraSeccion t WHERE t.secNombreClave = :secNombreClave"),
    @NamedQuery(name = "TraSeccion.findBySecOrden", query = "SELECT t FROM TraSeccion t WHERE t.secOrden = :secOrden"),
    @NamedQuery(name = "TraSeccion.findBySecPagina", query = "SELECT t FROM TraSeccion t WHERE t.secPagina = :secPagina"),
    @NamedQuery(name = "TraSeccion.findBySecRuta", query = "SELECT t FROM TraSeccion t WHERE t.secRuta = :secRuta")})
public class TraSeccion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "sec_id")
    private Long secId;
    @Size(max = 255)
    @Column(name = "sec_descripcion")
    private String secDescripcion;
    @Size(max = 255)
    @Column(name = "sec_etiqueta")
    private String secEtiqueta;
    @Size(max = 255)
    @Column(name = "sec_nombre_clave")
    private String secNombreClave;
    @Column(name = "sec_orden")
    private Integer secOrden;
    @Size(max = 255)
    @Column(name = "sec_pagina")
    private String secPagina;
    @Size(max = 255)
    @Column(name = "sec_ruta")
    private String secRuta;
    @OneToMany(mappedBy = "secId")
    private List<TraPermiso> traPermisoList;
    @JoinColumn(name = "tis_id", referencedColumnName = "tis_id")
    @ManyToOne
    private TraTipoSeccion tisId;

    public TraSeccion() {
    }

    public TraSeccion(Long secId) {
        this.secId = secId;
    }

    public Long getSecId() {
        return secId;
    }

    public void setSecId(Long secId) {
        this.secId = secId;
    }

    public String getSecDescripcion() {
        return secDescripcion;
    }

    public void setSecDescripcion(String secDescripcion) {
        this.secDescripcion = secDescripcion;
    }

    public String getSecEtiqueta() {
        return secEtiqueta;
    }

    public void setSecEtiqueta(String secEtiqueta) {
        this.secEtiqueta = secEtiqueta;
    }

    public String getSecNombreClave() {
        return secNombreClave;
    }

    public void setSecNombreClave(String secNombreClave) {
        this.secNombreClave = secNombreClave;
    }

    public Integer getSecOrden() {
        return secOrden;
    }

    public void setSecOrden(Integer secOrden) {
        this.secOrden = secOrden;
    }

    public String getSecPagina() {
        return secPagina;
    }

    public void setSecPagina(String secPagina) {
        this.secPagina = secPagina;
    }

    public String getSecRuta() {
        return secRuta;
    }

    public void setSecRuta(String secRuta) {
        this.secRuta = secRuta;
    }

    @XmlTransient
    public List<TraPermiso> getTraPermisoList() {
        return traPermisoList;
    }

    public void setTraPermisoList(List<TraPermiso> traPermisoList) {
        this.traPermisoList = traPermisoList;
    }

    public TraTipoSeccion getTisId() {
        return tisId;
    }

    public void setTisId(TraTipoSeccion tisId) {
        this.tisId = tisId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (secId != null ? secId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TraSeccion)) {
            return false;
        }
        TraSeccion other = (TraSeccion) object;
        if ((this.secId == null && other.secId != null) || (this.secId != null && !this.secId.equals(other.secId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.ups.entities.TraSeccion[ secId=" + secId + " ]";
    }
    
}
