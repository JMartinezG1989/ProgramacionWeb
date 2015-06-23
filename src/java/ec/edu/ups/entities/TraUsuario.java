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
@Table(name = "tra_usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TraUsuario.findAll", query = "SELECT t FROM TraUsuario t"),
    @NamedQuery(name = "TraUsuario.findByUsuId", query = "SELECT t FROM TraUsuario t WHERE t.usuId = :usuId"),
    @NamedQuery(name = "TraUsuario.findByUsuClave", query = "SELECT t FROM TraUsuario t WHERE t.usuClave = :usuClave"),
    @NamedQuery(name = "TraUsuario.findByUsuUsuario", query = "SELECT t FROM TraUsuario t WHERE t.usuUsuario = :usuUsuario")})
public class TraUsuario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "usu_id")
    private Long usuId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "usu_clave")
    private String usuClave;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "usu_usuario")
    private String usuUsuario;
    @OneToMany(mappedBy = "usuId")
    private List<TraUsuarioRol> traUsuarioRolList;

    public TraUsuario() {
    }

    public TraUsuario(Long usuId) {
        this.usuId = usuId;
    }

    public TraUsuario(Long usuId, String usuClave, String usuUsuario) {
        this.usuId = usuId;
        this.usuClave = usuClave;
        this.usuUsuario = usuUsuario;
    }

    public Long getUsuId() {
        return usuId;
    }

    public void setUsuId(Long usuId) {
        this.usuId = usuId;
    }

    public String getUsuClave() {
        return usuClave;
    }

    public void setUsuClave(String usuClave) {
        this.usuClave = usuClave;
    }

    public String getUsuUsuario() {
        return usuUsuario;
    }

    public void setUsuUsuario(String usuUsuario) {
        this.usuUsuario = usuUsuario;
    }

    @XmlTransient
    public List<TraUsuarioRol> getTraUsuarioRolList() {
        return traUsuarioRolList;
    }

    public void setTraUsuarioRolList(List<TraUsuarioRol> traUsuarioRolList) {
        this.traUsuarioRolList = traUsuarioRolList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usuId != null ? usuId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TraUsuario)) {
            return false;
        }
        TraUsuario other = (TraUsuario) object;
        if ((this.usuId == null && other.usuId != null) || (this.usuId != null && !this.usuId.equals(other.usuId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.ups.entities.TraUsuario[ usuId=" + usuId + " ]";
    }
    
}
