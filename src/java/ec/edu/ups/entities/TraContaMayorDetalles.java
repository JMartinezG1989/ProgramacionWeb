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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jusan
 */
@Entity
@Table(name = "tra_conta_mayor_detalles")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TraContaMayorDetalles.findAll", query = "SELECT t FROM TraContaMayorDetalles t"),
    @NamedQuery(name = "TraContaMayorDetalles.findByComadeId", query = "SELECT t FROM TraContaMayorDetalles t WHERE t.comadeId = :comadeId"),
    @NamedQuery(name = "TraContaMayorDetalles.findByComadeAsientoCierre", query = "SELECT t FROM TraContaMayorDetalles t WHERE t.comadeAsientoCierre = :comadeAsientoCierre"),
    @NamedQuery(name = "TraContaMayorDetalles.findByComadeDebe", query = "SELECT t FROM TraContaMayorDetalles t WHERE t.comadeDebe = :comadeDebe"),
    @NamedQuery(name = "TraContaMayorDetalles.findByComadeHaber", query = "SELECT t FROM TraContaMayorDetalles t WHERE t.comadeHaber = :comadeHaber"),
    @NamedQuery(name = "TraContaMayorDetalles.findByComadeSaldo", query = "SELECT t FROM TraContaMayorDetalles t WHERE t.comadeSaldo = :comadeSaldo"),
    @NamedQuery(name = "TraContaMayorDetalles.findByComadeSaldoCierre", query = "SELECT t FROM TraContaMayorDetalles t WHERE t.comadeSaldoCierre = :comadeSaldoCierre"),
    @NamedQuery(name = "TraContaMayorDetalles.findByComadeSaldoDebeBalComp", query = "SELECT t FROM TraContaMayorDetalles t WHERE t.comadeSaldoDebeBalComp = :comadeSaldoDebeBalComp"),
    @NamedQuery(name = "TraContaMayorDetalles.findByComadeSaldoHaberBalComp", query = "SELECT t FROM TraContaMayorDetalles t WHERE t.comadeSaldoHaberBalComp = :comadeSaldoHaberBalComp"),
    @NamedQuery(name = "TraContaMayorDetalles.findByComadeTotalDebeBalComp", query = "SELECT t FROM TraContaMayorDetalles t WHERE t.comadeTotalDebeBalComp = :comadeTotalDebeBalComp"),
    @NamedQuery(name = "TraContaMayorDetalles.findByComadeTotalHaberBalComp", query = "SELECT t FROM TraContaMayorDetalles t WHERE t.comadeTotalHaberBalComp = :comadeTotalHaberBalComp"),
    @NamedQuery(name = "TraContaMayorDetalles.findByComadeFecha", query = "SELECT t FROM TraContaMayorDetalles t WHERE t.comadeFecha = :comadeFecha")})
public class TraContaMayorDetalles implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "comade_id")
    private Long comadeId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "comade_asiento_cierre")
    private Double comadeAsientoCierre;
    @Column(name = "comade_debe")
    private Double comadeDebe;
    @Column(name = "comade_haber")
    private Double comadeHaber;
    @Column(name = "comade_saldo")
    private Double comadeSaldo;
    @Column(name = "comade_saldo_cierre")
    private Double comadeSaldoCierre;
    @Column(name = "comade_saldo_debe_bal_comp")
    private Double comadeSaldoDebeBalComp;
    @Column(name = "comade_saldo_haber_bal_comp")
    private Double comadeSaldoHaberBalComp;
    @Column(name = "comade_total_debe_bal_comp")
    private Double comadeTotalDebeBalComp;
    @Column(name = "comade_total_haber_bal_comp")
    private Double comadeTotalHaberBalComp;
    @Column(name = "comade_fecha")
    @Temporal(TemporalType.DATE)
    private Date comadeFecha;

    public TraContaMayorDetalles() {
    }

    public TraContaMayorDetalles(Long comadeId) {
        this.comadeId = comadeId;
    }

    public Long getComadeId() {
        return comadeId;
    }

    public void setComadeId(Long comadeId) {
        this.comadeId = comadeId;
    }

    public Double getComadeAsientoCierre() {
        return comadeAsientoCierre;
    }

    public void setComadeAsientoCierre(Double comadeAsientoCierre) {
        this.comadeAsientoCierre = comadeAsientoCierre;
    }

    public Double getComadeDebe() {
        return comadeDebe;
    }

    public void setComadeDebe(Double comadeDebe) {
        this.comadeDebe = comadeDebe;
    }

    public Double getComadeHaber() {
        return comadeHaber;
    }

    public void setComadeHaber(Double comadeHaber) {
        this.comadeHaber = comadeHaber;
    }

    public Double getComadeSaldo() {
        return comadeSaldo;
    }

    public void setComadeSaldo(Double comadeSaldo) {
        this.comadeSaldo = comadeSaldo;
    }

    public Double getComadeSaldoCierre() {
        return comadeSaldoCierre;
    }

    public void setComadeSaldoCierre(Double comadeSaldoCierre) {
        this.comadeSaldoCierre = comadeSaldoCierre;
    }

    public Double getComadeSaldoDebeBalComp() {
        return comadeSaldoDebeBalComp;
    }

    public void setComadeSaldoDebeBalComp(Double comadeSaldoDebeBalComp) {
        this.comadeSaldoDebeBalComp = comadeSaldoDebeBalComp;
    }

    public Double getComadeSaldoHaberBalComp() {
        return comadeSaldoHaberBalComp;
    }

    public void setComadeSaldoHaberBalComp(Double comadeSaldoHaberBalComp) {
        this.comadeSaldoHaberBalComp = comadeSaldoHaberBalComp;
    }

    public Double getComadeTotalDebeBalComp() {
        return comadeTotalDebeBalComp;
    }

    public void setComadeTotalDebeBalComp(Double comadeTotalDebeBalComp) {
        this.comadeTotalDebeBalComp = comadeTotalDebeBalComp;
    }

    public Double getComadeTotalHaberBalComp() {
        return comadeTotalHaberBalComp;
    }

    public void setComadeTotalHaberBalComp(Double comadeTotalHaberBalComp) {
        this.comadeTotalHaberBalComp = comadeTotalHaberBalComp;
    }

    public Date getComadeFecha() {
        return comadeFecha;
    }

    public void setComadeFecha(Date comadeFecha) {
        this.comadeFecha = comadeFecha;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (comadeId != null ? comadeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TraContaMayorDetalles)) {
            return false;
        }
        TraContaMayorDetalles other = (TraContaMayorDetalles) object;
        if ((this.comadeId == null && other.comadeId != null) || (this.comadeId != null && !this.comadeId.equals(other.comadeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.ups.entities.TraContaMayorDetalles[ comadeId=" + comadeId + " ]";
    }
    
}
