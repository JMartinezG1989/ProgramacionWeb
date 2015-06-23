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
@Table(name = "tra_rol")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TraRol.findAll", query = "SELECT t FROM TraRol t"),
    @NamedQuery(name = "TraRol.findByRolId", query = "SELECT t FROM TraRol t WHERE t.rolId = :rolId"),
    @NamedQuery(name = "TraRol.findByRolDescripcion", query = "SELECT t FROM TraRol t WHERE t.rolDescripcion = :rolDescripcion")})
public class TraRol implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "rol_id")
    private Long rolId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "rol_descripcion")
    private String rolDescripcion;
    @OneToMany(mappedBy = "rolId")
    private List<TraUsuarioRol> traUsuarioRolList;
    @OneToMany(mappedBy = "rolId")
    private List<TraPermiso> traPermisoList;

    public TraRol() {
    }

    public TraRol(Long rolId) {
        this.rolId = rolId;
    }

    public TraRol(Long rolId, String rolDescripcion) {
        this.rolId = rolId;
        this.rolDescripcion = rolDescripcion;
    }

    public Long getRolId() {
        return rolId;
    }

    public void setRolId(Long rolId) {
        this.rolId = rolId;
    }

    public String getRolDescripcion() {
        return rolDescripcion;
    }

    public void setRolDescripcion(String rolDescripcion) {
        this.rolDescripcion = rolDescripcion;
    }

    @XmlTransient
    public List<TraUsuarioRol> getTraUsuarioRolList() {
        return traUsuarioRolList;
    }

    public void setTraUsuarioRolList(List<TraUsuarioRol> traUsuarioRolList) {
        this.traUsuarioRolList = traUsuarioRolList;
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
        hash += (rolId != null ? rolId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TraRol)) {
            return false;
        }
        TraRol other = (TraRol) object;
        if ((this.rolId == null && other.rolId != null) || (this.rolId != null && !this.rolId.equals(other.rolId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.ups.entities.TraRol[ rolId=" + rolId + " ]";
    }
    
}
