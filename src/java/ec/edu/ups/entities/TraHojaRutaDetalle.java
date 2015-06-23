/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.entities;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "tra_hoja_ruta_detalle")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TraHojaRutaDetalle.findAll", query = "SELECT t FROM TraHojaRutaDetalle t"),
    @NamedQuery(name = "TraHojaRutaDetalle.findByHrdIdPk", query = "SELECT t FROM TraHojaRutaDetalle t WHERE t.hrdIdPk = :hrdIdPk"),
    @NamedQuery(name = "TraHojaRutaDetalle.findByAudEliminado", query = "SELECT t FROM TraHojaRutaDetalle t WHERE t.audEliminado = :audEliminado"),
    @NamedQuery(name = "TraHojaRutaDetalle.findByAudFechaInsercion", query = "SELECT t FROM TraHojaRutaDetalle t WHERE t.audFechaInsercion = :audFechaInsercion"),
    @NamedQuery(name = "TraHojaRutaDetalle.findByAudFechaModificacion", query = "SELECT t FROM TraHojaRutaDetalle t WHERE t.audFechaModificacion = :audFechaModificacion"),
    @NamedQuery(name = "TraHojaRutaDetalle.findByAudUsuarioInserto", query = "SELECT t FROM TraHojaRutaDetalle t WHERE t.audUsuarioInserto = :audUsuarioInserto"),
    @NamedQuery(name = "TraHojaRutaDetalle.findByAudUsuarioModifico", query = "SELECT t FROM TraHojaRutaDetalle t WHERE t.audUsuarioModifico = :audUsuarioModifico"),
    @NamedQuery(name = "TraHojaRutaDetalle.findByHrdCobroCuenca", query = "SELECT t FROM TraHojaRutaDetalle t WHERE t.hrdCobroCuenca = :hrdCobroCuenca"),
    @NamedQuery(name = "TraHojaRutaDetalle.findByHrdCobroRuta", query = "SELECT t FROM TraHojaRutaDetalle t WHERE t.hrdCobroRuta = :hrdCobroRuta"),
    @NamedQuery(name = "TraHojaRutaDetalle.findByHrdContenido", query = "SELECT t FROM TraHojaRutaDetalle t WHERE t.hrdContenido = :hrdContenido"),
    @NamedQuery(name = "TraHojaRutaDetalle.findByHrdDestinatario", query = "SELECT t FROM TraHojaRutaDetalle t WHERE t.hrdDestinatario = :hrdDestinatario"),
    @NamedQuery(name = "TraHojaRutaDetalle.findByHrdDestino", query = "SELECT t FROM TraHojaRutaDetalle t WHERE t.hrdDestino = :hrdDestino"),
    @NamedQuery(name = "TraHojaRutaDetalle.findByHrdFleteCancelado", query = "SELECT t FROM TraHojaRutaDetalle t WHERE t.hrdFleteCancelado = :hrdFleteCancelado"),
    @NamedQuery(name = "TraHojaRutaDetalle.findByHrdNumeroFactura", query = "SELECT t FROM TraHojaRutaDetalle t WHERE t.hrdNumeroFactura = :hrdNumeroFactura"),
    @NamedQuery(name = "TraHojaRutaDetalle.findByHrdRemitente", query = "SELECT t FROM TraHojaRutaDetalle t WHERE t.hrdRemitente = :hrdRemitente")})
public class TraHojaRutaDetalle implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "hrd_id_pk")
    private Long hrdIdPk;
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
    @Size(max = 200)
    @Column(name = "hrd_cobro_cuenca")
    private String hrdCobroCuenca;
    @Size(max = 200)
    @Column(name = "hrd_cobro_ruta")
    private String hrdCobroRuta;
    @Size(max = 200)
    @Column(name = "hrd_contenido")
    private String hrdContenido;
    @Size(max = 200)
    @Column(name = "hrd_destinatario")
    private String hrdDestinatario;
    @Size(max = 200)
    @Column(name = "hrd_destino")
    private String hrdDestino;
    @Size(max = 200)
    @Column(name = "hrd_flete_cancelado")
    private String hrdFleteCancelado;
    @Column(name = "hrd_numero_factura")
    private BigInteger hrdNumeroFactura;
    @Size(max = 200)
    @Column(name = "hrd_remitente")
    private String hrdRemitente;
    @JoinColumn(name = "hrc_hrd_fk", referencedColumnName = "hrc_id_pk")
    @ManyToOne
    private TraHojaRutaCabecera hrcHrdFk;

    public TraHojaRutaDetalle() {
    }

    public TraHojaRutaDetalle(Long hrdIdPk) {
        this.hrdIdPk = hrdIdPk;
    }

    public Long getHrdIdPk() {
        return hrdIdPk;
    }

    public void setHrdIdPk(Long hrdIdPk) {
        this.hrdIdPk = hrdIdPk;
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

    public String getHrdCobroCuenca() {
        return hrdCobroCuenca;
    }

    public void setHrdCobroCuenca(String hrdCobroCuenca) {
        this.hrdCobroCuenca = hrdCobroCuenca;
    }

    public String getHrdCobroRuta() {
        return hrdCobroRuta;
    }

    public void setHrdCobroRuta(String hrdCobroRuta) {
        this.hrdCobroRuta = hrdCobroRuta;
    }

    public String getHrdContenido() {
        return hrdContenido;
    }

    public void setHrdContenido(String hrdContenido) {
        this.hrdContenido = hrdContenido;
    }

    public String getHrdDestinatario() {
        return hrdDestinatario;
    }

    public void setHrdDestinatario(String hrdDestinatario) {
        this.hrdDestinatario = hrdDestinatario;
    }

    public String getHrdDestino() {
        return hrdDestino;
    }

    public void setHrdDestino(String hrdDestino) {
        this.hrdDestino = hrdDestino;
    }

    public String getHrdFleteCancelado() {
        return hrdFleteCancelado;
    }

    public void setHrdFleteCancelado(String hrdFleteCancelado) {
        this.hrdFleteCancelado = hrdFleteCancelado;
    }

    public BigInteger getHrdNumeroFactura() {
        return hrdNumeroFactura;
    }

    public void setHrdNumeroFactura(BigInteger hrdNumeroFactura) {
        this.hrdNumeroFactura = hrdNumeroFactura;
    }

    public String getHrdRemitente() {
        return hrdRemitente;
    }

    public void setHrdRemitente(String hrdRemitente) {
        this.hrdRemitente = hrdRemitente;
    }

    public TraHojaRutaCabecera getHrcHrdFk() {
        return hrcHrdFk;
    }

    public void setHrcHrdFk(TraHojaRutaCabecera hrcHrdFk) {
        this.hrcHrdFk = hrcHrdFk;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (hrdIdPk != null ? hrdIdPk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TraHojaRutaDetalle)) {
            return false;
        }
        TraHojaRutaDetalle other = (TraHojaRutaDetalle) object;
        if ((this.hrdIdPk == null && other.hrdIdPk != null) || (this.hrdIdPk != null && !this.hrdIdPk.equals(other.hrdIdPk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.ups.entities.TraHojaRutaDetalle[ hrdIdPk=" + hrdIdPk + " ]";
    }
    
}
