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
@Table(name = "tra_operacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TraOperacion.findAll", query = "SELECT t FROM TraOperacion t"),
    @NamedQuery(name = "TraOperacion.findByOpeId", query = "SELECT t FROM TraOperacion t WHERE t.opeId = :opeId"),
    @NamedQuery(name = "TraOperacion.findByOpeDescripcion", query = "SELECT t FROM TraOperacion t WHERE t.opeDescripcion = :opeDescripcion")})
public class TraOperacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ope_id")
    private Long opeId;
    @Size(max = 255)
    @Column(name = "ope_descripcion")
    private String opeDescripcion;
    @OneToMany(mappedBy = "opeId")
    private List<TraPermiso> traPermisoList;

    public TraOperacion() {
    }

    public TraOperacion(Long opeId) {
        this.opeId = opeId;
    }

    public Long getOpeId() {
        return opeId;
    }

    public void setOpeId(Long opeId) {
        this.opeId = opeId;
    }

    public String getOpeDescripcion() {
        return opeDescripcion;
    }

    public void setOpeDescripcion(String opeDescripcion) {
        this.opeDescripcion = opeDescripcion;
    }

    @XmlTransient
    public List<TraPermiso> getTraPermisoList() {
        return traPermisoList;
    }

    public void setTraPermisoList(List<TraPermiso> traPermisoList) {
        this.traPermisoList = traPermisoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (opeId != null ? opeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TraOperacion)) {
            return false;
        }
        TraOperacion other = (TraOperacion) object;
        if ((this.opeId == null && other.opeId != null) || (this.opeId != null && !this.opeId.equals(other.opeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.ups.entities.TraOperacion[ opeId=" + opeId + " ]";
    }
    
}
