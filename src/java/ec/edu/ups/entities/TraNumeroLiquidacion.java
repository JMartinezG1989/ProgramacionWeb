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
@Table(name = "tra_numero_liquidacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TraNumeroLiquidacion.findAll", query = "SELECT t FROM TraNumeroLiquidacion t"),
    @NamedQuery(name = "TraNumeroLiquidacion.findByTraIdPk", query = "SELECT t FROM TraNumeroLiquidacion t WHERE t.traIdPk = :traIdPk"),
    @NamedQuery(name = "TraNumeroLiquidacion.findByTraDes", query = "SELECT t FROM TraNumeroLiquidacion t WHERE t.traDes = :traDes"),
    @NamedQuery(name = "TraNumeroLiquidacion.findByTraHas", query = "SELECT t FROM TraNumeroLiquidacion t WHERE t.traHas = :traHas"),
    @NamedQuery(name = "TraNumeroLiquidacion.findByTraSuma", query = "SELECT t FROM TraNumeroLiquidacion t WHERE t.traSuma = :traSuma")})
public class TraNumeroLiquidacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "tra_id_pk")
    private Long traIdPk;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "tra_des")
    private Double traDes;
    @Column(name = "tra_has")
    private Double traHas;
    @Column(name = "tra_suma")
    private Double traSuma;

    public TraNumeroLiquidacion() {
    }

    public TraNumeroLiquidacion(Long traIdPk) {
        this.traIdPk = traIdPk;
    }

    public Long getTraIdPk() {
        return traIdPk;
    }

    public void setTraIdPk(Long traIdPk) {
        this.traIdPk = traIdPk;
    }

    public Double getTraDes() {
        return traDes;
    }

    public void setTraDes(Double traDes) {
        this.traDes = traDes;
    }

    public Double getTraHas() {
        return traHas;
    }

    public void setTraHas(Double traHas) {
        this.traHas = traHas;
    }

    public Double getTraSuma() {
        return traSuma;
    }

    public void setTraSuma(Double traSuma) {
        this.traSuma = traSuma;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (traIdPk != null ? traIdPk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TraNumeroLiquidacion)) {
            return false;
        }
        TraNumeroLiquidacion other = (TraNumeroLiquidacion) object;
        if ((this.traIdPk == null && other.traIdPk != null) || (this.traIdPk != null && !this.traIdPk.equals(other.traIdPk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.ups.entities.TraNumeroLiquidacion[ traIdPk=" + traIdPk + " ]";
    }
    
}
