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
@Table(name = "tra_conta_cuenta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TraContaCuenta.findAll", query = "SELECT t FROM TraContaCuenta t"),
    @NamedQuery(name = "TraContaCuenta.findByCocuIdPk", query = "SELECT t FROM TraContaCuenta t WHERE t.cocuIdPk = :cocuIdPk"),
    @NamedQuery(name = "TraContaCuenta.findByCocuCodigo", query = "SELECT t FROM TraContaCuenta t WHERE t.cocuCodigo = :cocuCodigo"),
    @NamedQuery(name = "TraContaCuenta.findByCocuNombre", query = "SELECT t FROM TraContaCuenta t WHERE t.cocuNombre = :cocuNombre")})
public class TraContaCuenta implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "cocu_id_pk")
    private Long cocuIdPk;
    @Size(max = 255)
    @Column(name = "cocu_codigo")
    private String cocuCodigo;
    @Size(max = 255)
    @Column(name = "cocu_nombre")
    private String cocuNombre;

    public TraContaCuenta() {
    }

    public TraContaCuenta(Long cocuIdPk) {
        this.cocuIdPk = cocuIdPk;
    }

    public Long getCocuIdPk() {
        return cocuIdPk;
    }

    public void setCocuIdPk(Long cocuIdPk) {
        this.cocuIdPk = cocuIdPk;
    }

    public String getCocuCodigo() {
        return cocuCodigo;
    }

    public void setCocuCodigo(String cocuCodigo) {
        this.cocuCodigo = cocuCodigo;
    }

    public String getCocuNombre() {
        return cocuNombre;
    }

    public void setCocuNombre(String cocuNombre) {
        this.cocuNombre = cocuNombre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cocuIdPk != null ? cocuIdPk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TraContaCuenta)) {
            return false;
        }
        TraContaCuenta other = (TraContaCuenta) object;
        if ((this.cocuIdPk == null && other.cocuIdPk != null) || (this.cocuIdPk != null && !this.cocuIdPk.equals(other.cocuIdPk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.ups.entities.TraContaCuenta[ cocuIdPk=" + cocuIdPk + " ]";
    }
    
}
