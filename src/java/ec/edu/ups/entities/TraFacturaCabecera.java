/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.entities;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author jusan
 */
@Entity
@Table(name = "tra_factura_cabecera")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TraFacturaCabecera.findAll", query = "SELECT t FROM TraFacturaCabecera t"),
    @NamedQuery(name = "TraFacturaCabecera.findByFcaIdPk", query = "SELECT t FROM TraFacturaCabecera t WHERE t.fcaIdPk = :fcaIdPk"),
    @NamedQuery(name = "TraFacturaCabecera.findByAudEliminado", query = "SELECT t FROM TraFacturaCabecera t WHERE t.audEliminado = :audEliminado"),
    @NamedQuery(name = "TraFacturaCabecera.findByAudFechaInsercion", query = "SELECT t FROM TraFacturaCabecera t WHERE t.audFechaInsercion = :audFechaInsercion"),
    @NamedQuery(name = "TraFacturaCabecera.findByAudFechaModificacion", query = "SELECT t FROM TraFacturaCabecera t WHERE t.audFechaModificacion = :audFechaModificacion"),
    @NamedQuery(name = "TraFacturaCabecera.findByAudUsuarioInserto", query = "SELECT t FROM TraFacturaCabecera t WHERE t.audUsuarioInserto = :audUsuarioInserto"),
    @NamedQuery(name = "TraFacturaCabecera.findByAudUsuarioModifico", query = "SELECT t FROM TraFacturaCabecera t WHERE t.audUsuarioModifico = :audUsuarioModifico"),
    @NamedQuery(name = "TraFacturaCabecera.findByFcaTotalConIva", query = "SELECT t FROM TraFacturaCabecera t WHERE t.fcaTotalConIva = :fcaTotalConIva"),
    @NamedQuery(name = "TraFacturaCabecera.findByFcaConcepto", query = "SELECT t FROM TraFacturaCabecera t WHERE t.fcaConcepto = :fcaConcepto"),
    @NamedQuery(name = "TraFacturaCabecera.findByFcaCondicion", query = "SELECT t FROM TraFacturaCabecera t WHERE t.fcaCondicion = :fcaCondicion"),
    @NamedQuery(name = "TraFacturaCabecera.findByFcaDestinatario", query = "SELECT t FROM TraFacturaCabecera t WHERE t.fcaDestinatario = :fcaDestinatario"),
    @NamedQuery(name = "TraFacturaCabecera.findByFcaDireccion", query = "SELECT t FROM TraFacturaCabecera t WHERE t.fcaDireccion = :fcaDireccion"),
    @NamedQuery(name = "TraFacturaCabecera.findByFcaEstado", query = "SELECT t FROM TraFacturaCabecera t WHERE t.fcaEstado = :fcaEstado"),
    @NamedQuery(name = "TraFacturaCabecera.findByFcaFecha", query = "SELECT t FROM TraFacturaCabecera t WHERE t.fcaFecha = :fcaFecha"),
    @NamedQuery(name = "TraFacturaCabecera.findByFcaFechaFac", query = "SELECT t FROM TraFacturaCabecera t WHERE t.fcaFechaFac = :fcaFechaFac"),
    @NamedQuery(name = "TraFacturaCabecera.findByFcaNguiaRemitente", query = "SELECT t FROM TraFacturaCabecera t WHERE t.fcaNguiaRemitente = :fcaNguiaRemitente"),
    @NamedQuery(name = "TraFacturaCabecera.findByFcaNumero", query = "SELECT t FROM TraFacturaCabecera t WHERE t.fcaNumero = :fcaNumero"),
    @NamedQuery(name = "TraFacturaCabecera.findByFcaRemitente", query = "SELECT t FROM TraFacturaCabecera t WHERE t.fcaRemitente = :fcaRemitente"),
    @NamedQuery(name = "TraFacturaCabecera.findByFcaRuc", query = "SELECT t FROM TraFacturaCabecera t WHERE t.fcaRuc = :fcaRuc"),
    @NamedQuery(name = "TraFacturaCabecera.findByFcaSubtotal", query = "SELECT t FROM TraFacturaCabecera t WHERE t.fcaSubtotal = :fcaSubtotal"),
    @NamedQuery(name = "TraFacturaCabecera.findByFcaTelefono", query = "SELECT t FROM TraFacturaCabecera t WHERE t.fcaTelefono = :fcaTelefono"),
    @NamedQuery(name = "TraFacturaCabecera.findByFcaUsuario", query = "SELECT t FROM TraFacturaCabecera t WHERE t.fcaUsuario = :fcaUsuario")})
public class TraFacturaCabecera implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "fca_id_pk")
    private Long fcaIdPk;
    @Size(max = 1)
    @Column(name = "aud_eliminado")
    private String audEliminado;
    @Column(name = "aud_fecha_insercion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date audFechaInsercion;
    @Column(name = "aud_fecha_modificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date audFechaModificacion;
    @Size(max = 255)
    @Column(name = "aud_usuario_inserto")
    private String audUsuarioInserto;
    @Size(max = 255)
    @Column(name = "aud_usuario_modifico")
    private String audUsuarioModifico;
    @Column(name = "fca_total_con_iva")
    private BigInteger fcaTotalConIva;
    @Size(max = 200)
    @Column(name = "fca_concepto")
    private String fcaConcepto;
    @Size(max = 100)
    @Column(name = "fca_condicion")
    private String fcaCondicion;
    @Size(max = 100)
    @Column(name = "fca_destinatario")
    private String fcaDestinatario;
    @Size(max = 200)
    @Column(name = "fca_direccion")
    private String fcaDireccion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "fca_estado")
    private String fcaEstado;
    @Column(name = "fca_fecha")
    @Temporal(TemporalType.DATE)
    private Date fcaFecha;
    @Column(name = "fca_fecha_fac")
    @Temporal(TemporalType.DATE)
    private Date fcaFechaFac;
    @Column(name = "fca_nguia_remitente")
    private Integer fcaNguiaRemitente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fca_numero")
    private long fcaNumero;
    @Size(max = 100)
    @Column(name = "fca_remitente")
    private String fcaRemitente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "fca_ruc")
    private String fcaRuc;
    @Column(name = "fca_subtotal")
    private BigInteger fcaSubtotal;
    @Size(max = 100)
    @Column(name = "fca_telefono")
    private String fcaTelefono;
    @Size(max = 100)
    @Column(name = "fca_usuario")
    private String fcaUsuario;
    @OneToMany(mappedBy = "fcaIdPk")
    private List<TraFacturaEstado> traFacturaEstadoList;
    @JoinColumn(name = "tpco_id_pk", referencedColumnName = "tpco_id_pk")
    @ManyToOne
    private TraFacturaTipoPagoCobro tpcoIdPk;
    @JoinColumn(name = "fiv_id_pk", referencedColumnName = "fiv_id_pk")
    @ManyToOne
    private TraFacturaIvas fivIdPk;
    @OneToMany(mappedBy = "fcaIdPk")
    private List<TraFacturaDetalle> traFacturaDetalleList;

    public TraFacturaCabecera() {
    }

    public TraFacturaCabecera(Long fcaIdPk) {
        this.fcaIdPk = fcaIdPk;
    }

    public TraFacturaCabecera(Long fcaIdPk, String fcaEstado, long fcaNumero, String fcaRuc) {
        this.fcaIdPk = fcaIdPk;
        this.fcaEstado = fcaEstado;
        this.fcaNumero = fcaNumero;
        this.fcaRuc = fcaRuc;
    }

    public Long getFcaIdPk() {
        return fcaIdPk;
    }

    public void setFcaIdPk(Long fcaIdPk) {
        this.fcaIdPk = fcaIdPk;
    }

    public String getAudEliminado() {
        return audEliminado;
    }

    public void setAudEliminado(String audEliminado) {
        this.audEliminado = audEliminado;
    }

    public Date getAudFechaInsercion() {
        return audFechaInsercion;
    }

    public void setAudFechaInsercion(Date audFechaInsercion) {
        this.audFechaInsercion = audFechaInsercion;
    }

    public Date getAudFechaModificacion() {
        return audFechaModificacion;
    }

    public void setAudFechaModificacion(Date audFechaModificacion) {
        this.audFechaModificacion = audFechaModificacion;
    }

    public String getAudUsuarioInserto() {
        return audUsuarioInserto;
    }

    public void setAudUsuarioInserto(String audUsuarioInserto) {
        this.audUsuarioInserto = audUsuarioInserto;
    }

    public String getAudUsuarioModifico() {
        return audUsuarioModifico;
    }

    public void setAudUsuarioModifico(String audUsuarioModifico) {
        this.audUsuarioModifico = audUsuarioModifico;
    }

    public BigInteger getFcaTotalConIva() {
        return fcaTotalConIva;
    }

    public void setFcaTotalConIva(BigInteger fcaTotalConIva) {
        this.fcaTotalConIva = fcaTotalConIva;
    }

    public String getFcaConcepto() {
        return fcaConcepto;
    }

    public void setFcaConcepto(String fcaConcepto) {
        this.fcaConcepto = fcaConcepto;
    }

    public String getFcaCondicion() {
        return fcaCondicion;
    }

    public void setFcaCondicion(String fcaCondicion) {
        this.fcaCondicion = fcaCondicion;
    }

    public String getFcaDestinatario() {
        return fcaDestinatario;
    }

    public void setFcaDestinatario(String fcaDestinatario) {
        this.fcaDestinatario = fcaDestinatario;
    }

    public String getFcaDireccion() {
        return fcaDireccion;
    }

    public void setFcaDireccion(String fcaDireccion) {
        this.fcaDireccion = fcaDireccion;
    }

    public String getFcaEstado() {
        return fcaEstado;
    }

    public void setFcaEstado(String fcaEstado) {
        this.fcaEstado = fcaEstado;
    }

    public Date getFcaFecha() {
        return fcaFecha;
    }

    public void setFcaFecha(Date fcaFecha) {
        this.fcaFecha = fcaFecha;
    }

    public Date getFcaFechaFac() {
        return fcaFechaFac;
    }

    public void setFcaFechaFac(Date fcaFechaFac) {
        this.fcaFechaFac = fcaFechaFac;
    }

    public Integer getFcaNguiaRemitente() {
        return fcaNguiaRemitente;
    }

    public void setFcaNguiaRemitente(Integer fcaNguiaRemitente) {
        this.fcaNguiaRemitente = fcaNguiaRemitente;
    }

    public long getFcaNumero() {
        return fcaNumero;
    }

    public void setFcaNumero(long fcaNumero) {
        this.fcaNumero = fcaNumero;
    }

    public String getFcaRemitente() {
        return fcaRemitente;
    }

    public void setFcaRemitente(String fcaRemitente) {
        this.fcaRemitente = fcaRemitente;
    }

    public String getFcaRuc() {
        return fcaRuc;
    }

    public void setFcaRuc(String fcaRuc) {
        this.fcaRuc = fcaRuc;
    }

    public BigInteger getFcaSubtotal() {
        return fcaSubtotal;
    }

    public void setFcaSubtotal(BigInteger fcaSubtotal) {
        this.fcaSubtotal = fcaSubtotal;
    }

    public String getFcaTelefono() {
        return fcaTelefono;
    }

    public void setFcaTelefono(String fcaTelefono) {
        this.fcaTelefono = fcaTelefono;
    }

    public String getFcaUsuario() {
        return fcaUsuario;
    }

    public void setFcaUsuario(String fcaUsuario) {
        this.fcaUsuario = fcaUsuario;
    }

    @XmlTransient
    public List<TraFacturaEstado> getTraFacturaEstadoList() {
        return traFacturaEstadoList;
    }

    public void setTraFacturaEstadoList(List<TraFacturaEstado> traFacturaEstadoList) {
        this.traFacturaEstadoList = traFacturaEstadoList;
    }

    public TraFacturaTipoPagoCobro getTpcoIdPk() {
        return tpcoIdPk;
    }

    public void setTpcoIdPk(TraFacturaTipoPagoCobro tpcoIdPk) {
        this.tpcoIdPk = tpcoIdPk;
    }

    public TraFacturaIvas getFivIdPk() {
        return fivIdPk;
    }

    public void setFivIdPk(TraFacturaIvas fivIdPk) {
        this.fivIdPk = fivIdPk;
    }

    @XmlTransient
    public List<TraFacturaDetalle> getTraFacturaDetalleList() {
        return traFacturaDetalleList;
    }

    public void setTraFacturaDetalleList(List<TraFacturaDetalle> traFacturaDetalleList) {
        this.traFacturaDetalleList = traFacturaDetalleList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fcaIdPk != null ? fcaIdPk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TraFacturaCabecera)) {
            return false;
        }
        TraFacturaCabecera other = (TraFacturaCabecera) object;
        if ((this.fcaIdPk == null && other.fcaIdPk != null) || (this.fcaIdPk != null && !this.fcaIdPk.equals(other.fcaIdPk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.ups.entities.TraFacturaCabecera[ fcaIdPk=" + fcaIdPk + " ]";
    }
    
}
