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
@Table(name = "tra_comprobante_egreso_cabecera")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TraComprobanteEgresoCabecera.findAll", query = "SELECT t FROM TraComprobanteEgresoCabecera t"),
    @NamedQuery(name = "TraComprobanteEgresoCabecera.findByCecId", query = "SELECT t FROM TraComprobanteEgresoCabecera t WHERE t.cecId = :cecId"),
    @NamedQuery(name = "TraComprobanteEgresoCabecera.findByCecEstado", query = "SELECT t FROM TraComprobanteEgresoCabecera t WHERE t.cecEstado = :cecEstado"),
    @NamedQuery(name = "TraComprobanteEgresoCabecera.findByCecFecha", query = "SELECT t FROM TraComprobanteEgresoCabecera t WHERE t.cecFecha = :cecFecha"),
    @NamedQuery(name = "TraComprobanteEgresoCabecera.findByCecFechas", query = "SELECT t FROM TraComprobanteEgresoCabecera t WHERE t.cecFechas = :cecFechas"),
    @NamedQuery(name = "TraComprobanteEgresoCabecera.findByCecNumeroCheque", query = "SELECT t FROM TraComprobanteEgresoCabecera t WHERE t.cecNumeroCheque = :cecNumeroCheque"),
    @NamedQuery(name = "TraComprobanteEgresoCabecera.findByCecNumero", query = "SELECT t FROM TraComprobanteEgresoCabecera t WHERE t.cecNumero = :cecNumero"),
    @NamedQuery(name = "TraComprobanteEgresoCabecera.findByCecObservaciones", query = "SELECT t FROM TraComprobanteEgresoCabecera t WHERE t.cecObservaciones = :cecObservaciones"),
    @NamedQuery(name = "TraComprobanteEgresoCabecera.findByCecSon", query = "SELECT t FROM TraComprobanteEgresoCabecera t WHERE t.cecSon = :cecSon"),
    @NamedQuery(name = "TraComprobanteEgresoCabecera.findByCecUsuario", query = "SELECT t FROM TraComprobanteEgresoCabecera t WHERE t.cecUsuario = :cecUsuario"),
    @NamedQuery(name = "TraComprobanteEgresoCabecera.findByCecValor", query = "SELECT t FROM TraComprobanteEgresoCabecera t WHERE t.cecValor = :cecValor")})
public class TraComprobanteEgresoCabecera implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "cec_id")
    private Long cecId;
    @Size(max = 100)
    @Column(name = "cec_estado")
    private String cecEstado;
    @Column(name = "cec_fecha")
    @Temporal(TemporalType.DATE)
    private Date cecFecha;
    @Column(name = "cec_fechas")
    @Temporal(TemporalType.DATE)
    private Date cecFechas;
    @Size(max = 100)
    @Column(name = "cec_numero_cheque")
    private String cecNumeroCheque;
    @Column(name = "cec_numero")
    private Integer cecNumero;
    @Size(max = 100)
    @Column(name = "cec_observaciones")
    private String cecObservaciones;
    @Size(max = 100)
    @Column(name = "cec_son")
    private String cecSon;
    @Size(max = 100)
    @Column(name = "cec_usuario")
    private String cecUsuario;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "cec_valor")
    private Double cecValor;

    public TraComprobanteEgresoCabecera() {
    }

    public TraComprobanteEgresoCabecera(Long cecId) {
        this.cecId = cecId;
    }

    public Long getCecId() {
        return cecId;
    }

    public void setCecId(Long cecId) {
        this.cecId = cecId;
    }

    public String getCecEstado() {
        return cecEstado;
    }

    public void setCecEstado(String cecEstado) {
        this.cecEstado = cecEstado;
    }

    public Date getCecFecha() {
        return cecFecha;
    }

    public void setCecFecha(Date cecFecha) {
        this.cecFecha = cecFecha;
    }

    public Date getCecFechas() {
        return cecFechas;
    }

    public void setCecFechas(Date cecFechas) {
        this.cecFechas = cecFechas;
    }

    public String getCecNumeroCheque() {
        return cecNumeroCheque;
    }

    public void setCecNumeroCheque(String cecNumeroCheque) {
        this.cecNumeroCheque = cecNumeroCheque;
    }

    public Integer getCecNumero() {
        return cecNumero;
    }

    public void setCecNumero(Integer cecNumero) {
        this.cecNumero = cecNumero;
    }

    public String getCecObservaciones() {
        return cecObservaciones;
    }

    public void setCecObservaciones(String cecObservaciones) {
        this.cecObservaciones = cecObservaciones;
    }

    public String getCecSon() {
        return cecSon;
    }

    public void setCecSon(String cecSon) {
        this.cecSon = cecSon;
    }

    public String getCecUsuario() {
        return cecUsuario;
    }

    public void setCecUsuario(String cecUsuario) {
        this.cecUsuario = cecUsuario;
    }

    public Double getCecValor() {
        return cecValor;
    }

    public void setCecValor(Double cecValor) {
        this.cecValor = cecValor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cecId != null ? cecId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TraComprobanteEgresoCabecera)) {
            return false;
        }
        TraComprobanteEgresoCabecera other = (TraComprobanteEgresoCabecera) object;
        if ((this.cecId == null && other.cecId != null) || (this.cecId != null && !this.cecId.equals(other.cecId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.ups.entities.TraComprobanteEgresoCabecera[ cecId=" + cecId + " ]";
    }
    
}
