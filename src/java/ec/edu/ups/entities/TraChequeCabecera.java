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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jusan
 */
@Entity
@Table(name = "tra_cheque_cabecera")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TraChequeCabecera.findAll", query = "SELECT t FROM TraChequeCabecera t"),
    @NamedQuery(name = "TraChequeCabecera.findByCcaId", query = "SELECT t FROM TraChequeCabecera t WHERE t.ccaId = :ccaId"),
    @NamedQuery(name = "TraChequeCabecera.findByCcaEfectivo", query = "SELECT t FROM TraChequeCabecera t WHERE t.ccaEfectivo = :ccaEfectivo"),
    @NamedQuery(name = "TraChequeCabecera.findByCcaTotalRecaudado", query = "SELECT t FROM TraChequeCabecera t WHERE t.ccaTotalRecaudado = :ccaTotalRecaudado")})
public class TraChequeCabecera implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "cca_id")
    private Long ccaId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "cca_efectivo")
    private Double ccaEfectivo;
    @Column(name = "cca_total_recaudado")
    private Double ccaTotalRecaudado;

    public TraChequeCabecera() {
    }

    public TraChequeCabecera(Long ccaId) {
        this.ccaId = ccaId;
    }

    public Long getCcaId() {
        return ccaId;
    }

    public void setCcaId(Long ccaId) {
        this.ccaId = ccaId;
    }

    public Double getCcaEfectivo() {
        return ccaEfectivo;
    }

    public void setCcaEfectivo(Double ccaEfectivo) {
        this.ccaEfectivo = ccaEfectivo;
    }

    public Double getCcaTotalRecaudado() {
        return ccaTotalRecaudado;
    }

    public void setCcaTotalRecaudado(Double ccaTotalRecaudado) {
        this.ccaTotalRecaudado = ccaTotalRecaudado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ccaId != null ? ccaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TraChequeCabecera)) {
            return false;
        }
        TraChequeCabecera other = (TraChequeCabecera) object;
        if ((this.ccaId == null && other.ccaId != null) || (this.ccaId != null && !this.ccaId.equals(other.ccaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.ups.entities.TraChequeCabecera[ ccaId=" + ccaId + " ]";
    }
    
}
