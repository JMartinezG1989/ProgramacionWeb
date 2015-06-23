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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jusan
 */
@Entity
@Table(name = "tra_usuario_rol")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TraUsuarioRol.findAll", query = "SELECT t FROM TraUsuarioRol t"),
    @NamedQuery(name = "TraUsuarioRol.findByUsrId", query = "SELECT t FROM TraUsuarioRol t WHERE t.usrId = :usrId")})
public class TraUsuarioRol implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "usr_id")
    private Long usrId;
    @JoinColumn(name = "usu_id", referencedColumnName = "usu_id")
    @ManyToOne
    private TraUsuario usuId;
    @JoinColumn(name = "rol_id", referencedColumnName = "rol_id")
    @ManyToOne
    private TraRol rolId;

    public TraUsuarioRol() {
    }

    public TraUsuarioRol(Long usrId) {
        this.usrId = usrId;
    }

    public Long getUsrId() {
        return usrId;
    }

    public void setUsrId(Long usrId) {
        this.usrId = usrId;
    }

    public TraUsuario getUsuId() {
        return usuId;
    }

    public void setUsuId(TraUsuario usuId) {
        this.usuId = usuId;
    }

    public TraRol getRolId() {
        return rolId;
    }

    public void setRolId(TraRol rolId) {
        this.rolId = rolId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usrId != null ? usrId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TraUsuarioRol)) {
            return false;
        }
        TraUsuarioRol other = (TraUsuarioRol) object;
        if ((this.usrId == null && other.usrId != null) || (this.usrId != null && !this.usrId.equals(other.usrId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.ups.entities.TraUsuarioRol[ usrId=" + usrId + " ]";
    }
    
}
