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
@Table(name = "tra_bancos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TraBancos.findAll", query = "SELECT t FROM TraBancos t"),
    @NamedQuery(name = "TraBancos.findByBanId", query = "SELECT t FROM TraBancos t WHERE t.banId = :banId"),
    @NamedQuery(name = "TraBancos.findByBanNombre", query = "SELECT t FROM TraBancos t WHERE t.banNombre = :banNombre")})
public class TraBancos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ban_id")
    private Long banId;
    @Size(max = 100)
    @Column(name = "ban_nombre")
    private String banNombre;

    public TraBancos() {
    }

    public TraBancos(Long banId) {
        this.banId = banId;
    }

    public Long getBanId() {
        return banId;
    }

    public void setBanId(Long banId) {
        this.banId = banId;
    }

    public String getBanNombre() {
        return banNombre;
    }

    public void setBanNombre(String banNombre) {
        this.banNombre = banNombre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (banId != null ? banId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TraBancos)) {
            return false;
        }
        TraBancos other = (TraBancos) object;
        if ((this.banId == null && other.banId != null) || (this.banId != null && !this.banId.equals(other.banId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.ups.entities.TraBancos[ banId=" + banId + " ]";
    }
    
}
