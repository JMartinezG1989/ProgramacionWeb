/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jusan
 */
@Entity
@Table(name = "tra_conta_niveles")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TraContaNiveles.findAll", query = "SELECT t FROM TraContaNiveles t"),
    @NamedQuery(name = "TraContaNiveles.findByConiId", query = "SELECT t FROM TraContaNiveles t WHERE t.coniId = :coniId"),
    @NamedQuery(name = "TraContaNiveles.findByConiDescripcion", query = "SELECT t FROM TraContaNiveles t WHERE t.coniDescripcion = :coniDescripcion"),
    @NamedQuery(name = "TraContaNiveles.findByConiValor", query = "SELECT t FROM TraContaNiveles t WHERE t.coniValor = :coniValor")})
public class TraContaNiveles implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "coni_id")
    private Long coniId;
    @Size(max = 255)
    @Column(name = "coni_descripcion")
    private String coniDescripcion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "coni_valor")
    private Double coniValor;

    public TraContaNiveles() {
    }

    public TraContaNiveles(Long coniId) {
        this.coniId = coniId;
    }

    public Long getConiId() {
        return coniId;
    }

    public void setConiId(Long coniId) {
        this.coniId = coniId;
    }

    public String getConiDescripcion() {
        return coniDescripcion;
    }

    public void setConiDescripcion(String coniDescripcion) {
        this.coniDescripcion = coniDescripcion;
    }

    public Double getConiValor() {
        return coniValor;
    }

    public void setConiValor(Double coniValor) {
        this.coniValor = coniValor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (coniId != null ? coniId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TraContaNiveles)) {
            return false;
        }
        TraContaNiveles other = (TraContaNiveles) object;
        if ((this.coniId == null && other.coniId != null) || (this.coniId != null && !this.coniId.equals(other.coniId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.ups.entities.TraContaNiveles[ coniId=" + coniId + " ]";
    }
    
}
