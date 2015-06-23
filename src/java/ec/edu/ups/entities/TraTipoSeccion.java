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
@Table(name = "tra_tipo_seccion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TraTipoSeccion.findAll", query = "SELECT t FROM TraTipoSeccion t"),
    @NamedQuery(name = "TraTipoSeccion.findByTisId", query = "SELECT t FROM TraTipoSeccion t WHERE t.tisId = :tisId"),
    @NamedQuery(name = "TraTipoSeccion.findByTisDescripcion", query = "SELECT t FROM TraTipoSeccion t WHERE t.tisDescripcion = :tisDescripcion"),
    @NamedQuery(name = "TraTipoSeccion.findByTisNivel", query = "SELECT t FROM TraTipoSeccion t WHERE t.tisNivel = :tisNivel")})
public class TraTipoSeccion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "tis_id")
    private Long tisId;
    @Size(max = 255)
    @Column(name = "tis_descripcion")
    private String tisDescripcion;
    @Size(max = 255)
    @Column(name = "tis_nivel")
    private String tisNivel;
    @OneToMany(mappedBy = "tisId")
    private List<TraSeccion> traSeccionList;

    public TraTipoSeccion() {
    }

    public TraTipoSeccion(Long tisId) {
        this.tisId = tisId;
    }

    public Long getTisId() {
        return tisId;
    }

    public void setTisId(Long tisId) {
        this.tisId = tisId;
    }

    public String getTisDescripcion() {
        return tisDescripcion;
    }

    public void setTisDescripcion(String tisDescripcion) {
        this.tisDescripcion = tisDescripcion;
    }

    public String getTisNivel() {
        return tisNivel;
    }

    public void setTisNivel(String tisNivel) {
        this.tisNivel = tisNivel;
    }

    @XmlTransient
    public List<TraSeccion> getTraSeccionList() {
        return traSeccionList;
    }

    public void setTraSeccionList(List<TraSeccion> traSeccionList) {
        this.traSeccionList = traSeccionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tisId != null ? tisId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TraTipoSeccion)) {
            return false;
        }
        TraTipoSeccion other = (TraTipoSeccion) object;
        if ((this.tisId == null && other.tisId != null) || (this.tisId != null && !this.tisId.equals(other.tisId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.ups.entities.TraTipoSeccion[ tisId=" + tisId + " ]";
    }
    
}
