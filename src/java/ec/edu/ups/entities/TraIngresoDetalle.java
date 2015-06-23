/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jusan
 */
@Entity
@Table(name = "tra_ingreso_detalle")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TraIngresoDetalle.findAll", query = "SELECT t FROM TraIngresoDetalle t"),
    @NamedQuery(name = "TraIngresoDetalle.findByIdeId", query = "SELECT t FROM TraIngresoDetalle t WHERE t.ideId = :ideId"),
    @NamedQuery(name = "TraIngresoDetalle.findByIcaAbo", query = "SELECT t FROM TraIngresoDetalle t WHERE t.icaAbo = :icaAbo"),
    @NamedQuery(name = "TraIngresoDetalle.findByIcaAnt", query = "SELECT t FROM TraIngresoDetalle t WHERE t.icaAnt = :icaAnt"),
    @NamedQuery(name = "TraIngresoDetalle.findByIcaCan", query = "SELECT t FROM TraIngresoDetalle t WHERE t.icaCan = :icaCan"),
    @NamedQuery(name = "TraIngresoDetalle.findByIcaFecha", query = "SELECT t FROM TraIngresoDetalle t WHERE t.icaFecha = :icaFecha"),
    @NamedQuery(name = "TraIngresoDetalle.findByIcaNumero", query = "SELECT t FROM TraIngresoDetalle t WHERE t.icaNumero = :icaNumero"),
    @NamedQuery(name = "TraIngresoDetalle.findByIcaRecaudado", query = "SELECT t FROM TraIngresoDetalle t WHERE t.icaRecaudado = :icaRecaudado"),
    @NamedQuery(name = "TraIngresoDetalle.findByIcaValor", query = "SELECT t FROM TraIngresoDetalle t WHERE t.icaValor = :icaValor")})
public class TraIngresoDetalle implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ide_id")
    private Long ideId;
    @Size(max = 255)
    @Column(name = "ica_abo")
    private String icaAbo;
    @Size(max = 255)
    @Column(name = "ica_ant")
    private String icaAnt;
    @Size(max = 255)
    @Column(name = "ica_can")
    private String icaCan;
    @Column(name = "ica_fecha")
    @Temporal(TemporalType.DATE)
    private Date icaFecha;
    @Column(name = "ica_numero")
    private Integer icaNumero;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ica_recaudado")
    private Double icaRecaudado;
    @Column(name = "ica_valor")
    private Double icaValor;

    public TraIngresoDetalle() {
    }

    public TraIngresoDetalle(Long ideId) {
        this.ideId = ideId;
    }

    public Long getIdeId() {
        return ideId;
    }

    public void setIdeId(Long ideId) {
        this.ideId = ideId;
    }

    public String getIcaAbo() {
        return icaAbo;
    }

    public void setIcaAbo(String icaAbo) {
        this.icaAbo = icaAbo;
    }

    public String getIcaAnt() {
        return icaAnt;
    }

    public void setIcaAnt(String icaAnt) {
        this.icaAnt = icaAnt;
    }

    public String getIcaCan() {
        return icaCan;
    }

    public void setIcaCan(String icaCan) {
        this.icaCan = icaCan;
    }

    public Date getIcaFecha() {
        return icaFecha;
    }

    public void setIcaFecha(Date icaFecha) {
        this.icaFecha = icaFecha;
    }

    public Integer getIcaNumero() {
        return icaNumero;
    }

    public void setIcaNumero(Integer icaNumero) {
        this.icaNumero = icaNumero;
    }

    public Double getIcaRecaudado() {
        return icaRecaudado;
    }

    public void setIcaRecaudado(Double icaRecaudado) {
        this.icaRecaudado = icaRecaudado;
    }

    public Double getIcaValor() {
        return icaValor;
    }

    public void setIcaValor(Double icaValor) {
        this.icaValor = icaValor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ideId != null ? ideId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TraIngresoDetalle)) {
            return false;
        }
        TraIngresoDetalle other = (TraIngresoDetalle) object;
        if ((this.ideId == null && other.ideId != null) || (this.ideId != null && !this.ideId.equals(other.ideId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.ups.entities.TraIngresoDetalle[ ideId=" + ideId + " ]";
    }
    
}
