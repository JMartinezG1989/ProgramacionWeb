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
@Table(name = "tra_comprobante_egreso_detalle")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TraComprobanteEgresoDetalle.findAll", query = "SELECT t FROM TraComprobanteEgresoDetalle t"),
    @NamedQuery(name = "TraComprobanteEgresoDetalle.findByCedId", query = "SELECT t FROM TraComprobanteEgresoDetalle t WHERE t.cedId = :cedId"),
    @NamedQuery(name = "TraComprobanteEgresoDetalle.findByCedAnt", query = "SELECT t FROM TraComprobanteEgresoDetalle t WHERE t.cedAnt = :cedAnt"),
    @NamedQuery(name = "TraComprobanteEgresoDetalle.findByCedCodigoEgreso", query = "SELECT t FROM TraComprobanteEgresoDetalle t WHERE t.cedCodigoEgreso = :cedCodigoEgreso"),
    @NamedQuery(name = "TraComprobanteEgresoDetalle.findByCedConcepto", query = "SELECT t FROM TraComprobanteEgresoDetalle t WHERE t.cedConcepto = :cedConcepto"),
    @NamedQuery(name = "TraComprobanteEgresoDetalle.findByCedDebe", query = "SELECT t FROM TraComprobanteEgresoDetalle t WHERE t.cedDebe = :cedDebe"),
    @NamedQuery(name = "TraComprobanteEgresoDetalle.findByCedDescuento", query = "SELECT t FROM TraComprobanteEgresoDetalle t WHERE t.cedDescuento = :cedDescuento"),
    @NamedQuery(name = "TraComprobanteEgresoDetalle.findByCedHaber", query = "SELECT t FROM TraComprobanteEgresoDetalle t WHERE t.cedHaber = :cedHaber"),
    @NamedQuery(name = "TraComprobanteEgresoDetalle.findByCedPorcentaje", query = "SELECT t FROM TraComprobanteEgresoDetalle t WHERE t.cedPorcentaje = :cedPorcentaje"),
    @NamedQuery(name = "TraComprobanteEgresoDetalle.findByCedRef", query = "SELECT t FROM TraComprobanteEgresoDetalle t WHERE t.cedRef = :cedRef")})
public class TraComprobanteEgresoDetalle implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ced_id")
    private Long cedId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ced_ant")
    private Double cedAnt;
    @Size(max = 50)
    @Column(name = "ced_codigo_egreso")
    private String cedCodigoEgreso;
    @Size(max = 100)
    @Column(name = "ced_concepto")
    private String cedConcepto;
    @Column(name = "ced_debe")
    private Double cedDebe;
    @Column(name = "ced_descuento")
    private Double cedDescuento;
    @Column(name = "ced_haber")
    private Double cedHaber;
    @Column(name = "ced_porcentaje")
    private Double cedPorcentaje;
    @Size(max = 50)
    @Column(name = "ced_ref")
    private String cedRef;

    public TraComprobanteEgresoDetalle() {
    }

    public TraComprobanteEgresoDetalle(Long cedId) {
        this.cedId = cedId;
    }

    public Long getCedId() {
        return cedId;
    }

    public void setCedId(Long cedId) {
        this.cedId = cedId;
    }

    public Double getCedAnt() {
        return cedAnt;
    }

    public void setCedAnt(Double cedAnt) {
        this.cedAnt = cedAnt;
    }

    public String getCedCodigoEgreso() {
        return cedCodigoEgreso;
    }

    public void setCedCodigoEgreso(String cedCodigoEgreso) {
        this.cedCodigoEgreso = cedCodigoEgreso;
    }

    public String getCedConcepto() {
        return cedConcepto;
    }

    public void setCedConcepto(String cedConcepto) {
        this.cedConcepto = cedConcepto;
    }

    public Double getCedDebe() {
        return cedDebe;
    }

    public void setCedDebe(Double cedDebe) {
        this.cedDebe = cedDebe;
    }

    public Double getCedDescuento() {
        return cedDescuento;
    }

    public void setCedDescuento(Double cedDescuento) {
        this.cedDescuento = cedDescuento;
    }

    public Double getCedHaber() {
        return cedHaber;
    }

    public void setCedHaber(Double cedHaber) {
        this.cedHaber = cedHaber;
    }

    public Double getCedPorcentaje() {
        return cedPorcentaje;
    }

    public void setCedPorcentaje(Double cedPorcentaje) {
        this.cedPorcentaje = cedPorcentaje;
    }

    public String getCedRef() {
        return cedRef;
    }

    public void setCedRef(String cedRef) {
        this.cedRef = cedRef;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cedId != null ? cedId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TraComprobanteEgresoDetalle)) {
            return false;
        }
        TraComprobanteEgresoDetalle other = (TraComprobanteEgresoDetalle) object;
        if ((this.cedId == null && other.cedId != null) || (this.cedId != null && !this.cedId.equals(other.cedId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.ups.entities.TraComprobanteEgresoDetalle[ cedId=" + cedId + " ]";
    }
    
}
