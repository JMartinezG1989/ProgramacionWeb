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
@Table(name = "tra_tipo_cuentas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TraTipoCuentas.findAll", query = "SELECT t FROM TraTipoCuentas t"),
    @NamedQuery(name = "TraTipoCuentas.findByTicuId", query = "SELECT t FROM TraTipoCuentas t WHERE t.ticuId = :ticuId"),
    @NamedQuery(name = "TraTipoCuentas.findByTicuDescripcion", query = "SELECT t FROM TraTipoCuentas t WHERE t.ticuDescripcion = :ticuDescripcion")})
public class TraTipoCuentas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ticu_id")
    private Long ticuId;
    @Size(max = 255)
    @Column(name = "ticu_descripcion")
    private String ticuDescripcion;

    public TraTipoCuentas() {
    }

    public TraTipoCuentas(Long ticuId) {
        this.ticuId = ticuId;
    }

    public Long getTicuId() {
        return ticuId;
    }

    public void setTicuId(Long ticuId) {
        this.ticuId = ticuId;
    }

    public String getTicuDescripcion() {
        return ticuDescripcion;
    }

    public void setTicuDescripcion(String ticuDescripcion) {
        this.ticuDescripcion = ticuDescripcion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ticuId != null ? ticuId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TraTipoCuentas)) {
            return false;
        }
        TraTipoCuentas other = (TraTipoCuentas) object;
        if ((this.ticuId == null && other.ticuId != null) || (this.ticuId != null && !this.ticuId.equals(other.ticuId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.ups.entities.TraTipoCuentas[ ticuId=" + ticuId + " ]";
    }
    
}
