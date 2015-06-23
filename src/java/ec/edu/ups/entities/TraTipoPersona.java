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
@Table(name = "tra_tipo_persona")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TraTipoPersona.findAll", query = "SELECT t FROM TraTipoPersona t"),
    @NamedQuery(name = "TraTipoPersona.findByTpeIdPk", query = "SELECT t FROM TraTipoPersona t WHERE t.tpeIdPk = :tpeIdPk"),
    @NamedQuery(name = "TraTipoPersona.findByTpeDescripcion", query = "SELECT t FROM TraTipoPersona t WHERE t.tpeDescripcion = :tpeDescripcion")})
public class TraTipoPersona implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "tpe_id_pk")
    private Long tpeIdPk;
    @Size(max = 500)
    @Column(name = "tpe_descripcion")
    private String tpeDescripcion;

    public TraTipoPersona() {
    }

    public TraTipoPersona(Long tpeIdPk) {
        this.tpeIdPk = tpeIdPk;
    }

    public Long getTpeIdPk() {
        return tpeIdPk;
    }

    public void setTpeIdPk(Long tpeIdPk) {
        this.tpeIdPk = tpeIdPk;
    }

    public String getTpeDescripcion() {
        return tpeDescripcion;
    }

    public void setTpeDescripcion(String tpeDescripcion) {
        this.tpeDescripcion = tpeDescripcion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tpeIdPk != null ? tpeIdPk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TraTipoPersona)) {
            return false;
        }
        TraTipoPersona other = (TraTipoPersona) object;
        if ((this.tpeIdPk == null && other.tpeIdPk != null) || (this.tpeIdPk != null && !this.tpeIdPk.equals(other.tpeIdPk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.ups.entities.TraTipoPersona[ tpeIdPk=" + tpeIdPk + " ]";
    }
    
}
