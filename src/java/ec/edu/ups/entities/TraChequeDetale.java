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
@Table(name = "tra_cheque_detale")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TraChequeDetale.findAll", query = "SELECT t FROM TraChequeDetale t"),
    @NamedQuery(name = "TraChequeDetale.findByCdeId", query = "SELECT t FROM TraChequeDetale t WHERE t.cdeId = :cdeId"),
    @NamedQuery(name = "TraChequeDetale.findByCdeNumeroCheque", query = "SELECT t FROM TraChequeDetale t WHERE t.cdeNumeroCheque = :cdeNumeroCheque"),
    @NamedQuery(name = "TraChequeDetale.findByCdeValor", query = "SELECT t FROM TraChequeDetale t WHERE t.cdeValor = :cdeValor"),
    @NamedQuery(name = "TraChequeDetale.findByCdeVencimiento", query = "SELECT t FROM TraChequeDetale t WHERE t.cdeVencimiento = :cdeVencimiento")})
public class TraChequeDetale implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "cde_id")
    private Long cdeId;
    @Size(max = 50)
    @Column(name = "cde_numero_cheque")
    private String cdeNumeroCheque;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "cde_valor")
    private Double cdeValor;
    @Size(max = 50)
    @Column(name = "cde_vencimiento")
    private String cdeVencimiento;

    public TraChequeDetale() {
    }

    public TraChequeDetale(Long cdeId) {
        this.cdeId = cdeId;
    }

    public Long getCdeId() {
        return cdeId;
    }

    public void setCdeId(Long cdeId) {
        this.cdeId = cdeId;
    }

    public String getCdeNumeroCheque() {
        return cdeNumeroCheque;
    }

    public void setCdeNumeroCheque(String cdeNumeroCheque) {
        this.cdeNumeroCheque = cdeNumeroCheque;
    }

    public Double getCdeValor() {
        return cdeValor;
    }

    public void setCdeValor(Double cdeValor) {
        this.cdeValor = cdeValor;
    }

    public String getCdeVencimiento() {
        return cdeVencimiento;
    }

    public void setCdeVencimiento(String cdeVencimiento) {
        this.cdeVencimiento = cdeVencimiento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cdeId != null ? cdeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TraChequeDetale)) {
            return false;
        }
        TraChequeDetale other = (TraChequeDetale) object;
        if ((this.cdeId == null && other.cdeId != null) || (this.cdeId != null && !this.cdeId.equals(other.cdeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.ups.entities.TraChequeDetale[ cdeId=" + cdeId + " ]";
    }
    
}
