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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "tra_permiso")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TraPermiso.findAll", query = "SELECT t FROM TraPermiso t"),
    @NamedQuery(name = "TraPermiso.findByPerId", query = "SELECT t FROM TraPermiso t WHERE t.perId = :perId"),
    @NamedQuery(name = "TraPermiso.findByPerDescripcion", query = "SELECT t FROM TraPermiso t WHERE t.perDescripcion = :perDescripcion")})
public class TraPermiso implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "per_id")
    private Long perId;
    @Size(max = 255)
    @Column(name = "per_descripcion")
    private String perDescripcion;
    @JoinColumn(name = "sec_id", referencedColumnName = "sec_id")
    @ManyToOne
    private TraSeccion secId;
    @JoinColumn(name = "rol_id", referencedColumnName = "rol_id")
    @ManyToOne
    private TraRol rolId;
    @JoinColumn(name = "ope_id", referencedColumnName = "ope_id")
    @ManyToOne
    private TraOperacion opeId;

    public TraPermiso() {
    }

    public TraPermiso(Long perId) {
        this.perId = perId;
    }

    public Long getPerId() {
        return perId;
    }

    public void setPerId(Long perId) {
        this.perId = perId;
    }

    public String getPerDescripcion() {
        return perDescripcion;
    }

    public void setPerDescripcion(String perDescripcion) {
        this.perDescripcion = perDescripcion;
    }

    public TraSeccion getSecId() {
        return secId;
    }

    public void setSecId(TraSeccion secId) {
        this.secId = secId;
    }

    public TraRol getRolId() {
        return rolId;
    }

    public void setRolId(TraRol rolId) {
        this.rolId = rolId;
    }

    public TraOperacion getOpeId() {
        return opeId;
    }

    public void setOpeId(TraOperacion opeId) {
        this.opeId = opeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (perId != null ? perId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TraPermiso)) {
            return false;
        }
        TraPermiso other = (TraPermiso) object;
        if ((this.perId == null && other.perId != null) || (this.perId != null && !this.perId.equals(other.perId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.ups.entities.TraPermiso[ perId=" + perId + " ]";
    }
    
}
