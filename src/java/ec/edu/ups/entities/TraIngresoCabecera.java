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
@Table(name = "tra_ingreso_cabecera")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TraIngresoCabecera.findAll", query = "SELECT t FROM TraIngresoCabecera t"),
    @NamedQuery(name = "TraIngresoCabecera.findByIcaId", query = "SELECT t FROM TraIngresoCabecera t WHERE t.icaId = :icaId"),
    @NamedQuery(name = "TraIngresoCabecera.findByIcaAgente", query = "SELECT t FROM TraIngresoCabecera t WHERE t.icaAgente = :icaAgente"),
    @NamedQuery(name = "TraIngresoCabecera.findByIcaCaja", query = "SELECT t FROM TraIngresoCabecera t WHERE t.icaCaja = :icaCaja"),
    @NamedQuery(name = "TraIngresoCabecera.findByIcaCodage", query = "SELECT t FROM TraIngresoCabecera t WHERE t.icaCodage = :icaCodage"),
    @NamedQuery(name = "TraIngresoCabecera.findByIcaCodigo", query = "SELECT t FROM TraIngresoCabecera t WHERE t.icaCodigo = :icaCodigo"),
    @NamedQuery(name = "TraIngresoCabecera.findByIcaEstado", query = "SELECT t FROM TraIngresoCabecera t WHERE t.icaEstado = :icaEstado"),
    @NamedQuery(name = "TraIngresoCabecera.findByIcaFecha", query = "SELECT t FROM TraIngresoCabecera t WHERE t.icaFecha = :icaFecha"),
    @NamedQuery(name = "TraIngresoCabecera.findByIcaFechaIngreso", query = "SELECT t FROM TraIngresoCabecera t WHERE t.icaFechaIngreso = :icaFechaIngreso"),
    @NamedQuery(name = "TraIngresoCabecera.findByIcaNumeroDeposito", query = "SELECT t FROM TraIngresoCabecera t WHERE t.icaNumeroDeposito = :icaNumeroDeposito"),
    @NamedQuery(name = "TraIngresoCabecera.findByIcaNumero", query = "SELECT t FROM TraIngresoCabecera t WHERE t.icaNumero = :icaNumero"),
    @NamedQuery(name = "TraIngresoCabecera.findByIcaRetencionFuente", query = "SELECT t FROM TraIngresoCabecera t WHERE t.icaRetencionFuente = :icaRetencionFuente"),
    @NamedQuery(name = "TraIngresoCabecera.findByIcaRetencionIva", query = "SELECT t FROM TraIngresoCabecera t WHERE t.icaRetencionIva = :icaRetencionIva"),
    @NamedQuery(name = "TraIngresoCabecera.findByIcaTotal", query = "SELECT t FROM TraIngresoCabecera t WHERE t.icaTotal = :icaTotal"),
    @NamedQuery(name = "TraIngresoCabecera.findByIcaTotalRecaudado", query = "SELECT t FROM TraIngresoCabecera t WHERE t.icaTotalRecaudado = :icaTotalRecaudado"),
    @NamedQuery(name = "TraIngresoCabecera.findByIcaUsuario", query = "SELECT t FROM TraIngresoCabecera t WHERE t.icaUsuario = :icaUsuario")})
public class TraIngresoCabecera implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ica_id")
    private Long icaId;
    @Size(max = 100)
    @Column(name = "ica_agente")
    private String icaAgente;
    @Size(max = 100)
    @Column(name = "ica_caja")
    private String icaCaja;
    @Size(max = 50)
    @Column(name = "ica_codage")
    private String icaCodage;
    @Size(max = 50)
    @Column(name = "ica_codigo")
    private String icaCodigo;
    @Size(max = 100)
    @Column(name = "ica_estado")
    private String icaEstado;
    @Column(name = "ica_fecha")
    @Temporal(TemporalType.DATE)
    private Date icaFecha;
    @Column(name = "ica_fecha_ingreso")
    @Temporal(TemporalType.DATE)
    private Date icaFechaIngreso;
    @Size(max = 100)
    @Column(name = "ica_numero_deposito")
    private String icaNumeroDeposito;
    @Column(name = "ica_numero")
    private Integer icaNumero;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ica_retencion_fuente")
    private Double icaRetencionFuente;
    @Column(name = "ica_retencion_iva")
    private Double icaRetencionIva;
    @Column(name = "ica_total")
    private Double icaTotal;
    @Column(name = "ica_total_recaudado")
    private Double icaTotalRecaudado;
    @Size(max = 100)
    @Column(name = "ica_usuario")
    private String icaUsuario;

    public TraIngresoCabecera() {
    }

    public TraIngresoCabecera(Long icaId) {
        this.icaId = icaId;
    }

    public Long getIcaId() {
        return icaId;
    }

    public void setIcaId(Long icaId) {
        this.icaId = icaId;
    }

    public String getIcaAgente() {
        return icaAgente;
    }

    public void setIcaAgente(String icaAgente) {
        this.icaAgente = icaAgente;
    }

    public String getIcaCaja() {
        return icaCaja;
    }

    public void setIcaCaja(String icaCaja) {
        this.icaCaja = icaCaja;
    }

    public String getIcaCodage() {
        return icaCodage;
    }

    public void setIcaCodage(String icaCodage) {
        this.icaCodage = icaCodage;
    }

    public String getIcaCodigo() {
        return icaCodigo;
    }

    public void setIcaCodigo(String icaCodigo) {
        this.icaCodigo = icaCodigo;
    }

    public String getIcaEstado() {
        return icaEstado;
    }

    public void setIcaEstado(String icaEstado) {
        this.icaEstado = icaEstado;
    }

    public Date getIcaFecha() {
        return icaFecha;
    }

    public void setIcaFecha(Date icaFecha) {
        this.icaFecha = icaFecha;
    }

    public Date getIcaFechaIngreso() {
        return icaFechaIngreso;
    }

    public void setIcaFechaIngreso(Date icaFechaIngreso) {
        this.icaFechaIngreso = icaFechaIngreso;
    }

    public String getIcaNumeroDeposito() {
        return icaNumeroDeposito;
    }

    public void setIcaNumeroDeposito(String icaNumeroDeposito) {
        this.icaNumeroDeposito = icaNumeroDeposito;
    }

    public Integer getIcaNumero() {
        return icaNumero;
    }

    public void setIcaNumero(Integer icaNumero) {
        this.icaNumero = icaNumero;
    }

    public Double getIcaRetencionFuente() {
        return icaRetencionFuente;
    }

    public void setIcaRetencionFuente(Double icaRetencionFuente) {
        this.icaRetencionFuente = icaRetencionFuente;
    }

    public Double getIcaRetencionIva() {
        return icaRetencionIva;
    }

    public void setIcaRetencionIva(Double icaRetencionIva) {
        this.icaRetencionIva = icaRetencionIva;
    }

    public Double getIcaTotal() {
        return icaTotal;
    }

    public void setIcaTotal(Double icaTotal) {
        this.icaTotal = icaTotal;
    }

    public Double getIcaTotalRecaudado() {
        return icaTotalRecaudado;
    }

    public void setIcaTotalRecaudado(Double icaTotalRecaudado) {
        this.icaTotalRecaudado = icaTotalRecaudado;
    }

    public String getIcaUsuario() {
        return icaUsuario;
    }

    public void setIcaUsuario(String icaUsuario) {
        this.icaUsuario = icaUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (icaId != null ? icaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TraIngresoCabecera)) {
            return false;
        }
        TraIngresoCabecera other = (TraIngresoCabecera) object;
        if ((this.icaId == null && other.icaId != null) || (this.icaId != null && !this.icaId.equals(other.icaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.ups.entities.TraIngresoCabecera[ icaId=" + icaId + " ]";
    }
    
}
