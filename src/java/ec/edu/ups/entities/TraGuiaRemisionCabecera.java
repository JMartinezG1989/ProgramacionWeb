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
@Table(name = "tra_guia_remision_cabecera")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TraGuiaRemisionCabecera.findAll", query = "SELECT t FROM TraGuiaRemisionCabecera t"),
    @NamedQuery(name = "TraGuiaRemisionCabecera.findByGrcIdPk", query = "SELECT t FROM TraGuiaRemisionCabecera t WHERE t.grcIdPk = :grcIdPk"),
    @NamedQuery(name = "TraGuiaRemisionCabecera.findByAudEliminado", query = "SELECT t FROM TraGuiaRemisionCabecera t WHERE t.audEliminado = :audEliminado"),
    @NamedQuery(name = "TraGuiaRemisionCabecera.findByAudFechaInsercion", query = "SELECT t FROM TraGuiaRemisionCabecera t WHERE t.audFechaInsercion = :audFechaInsercion"),
    @NamedQuery(name = "TraGuiaRemisionCabecera.findByAudFechaModificacion", query = "SELECT t FROM TraGuiaRemisionCabecera t WHERE t.audFechaModificacion = :audFechaModificacion"),
    @NamedQuery(name = "TraGuiaRemisionCabecera.findByAudUsuarioInserto", query = "SELECT t FROM TraGuiaRemisionCabecera t WHERE t.audUsuarioInserto = :audUsuarioInserto"),
    @NamedQuery(name = "TraGuiaRemisionCabecera.findByAudUsuarioModifico", query = "SELECT t FROM TraGuiaRemisionCabecera t WHERE t.audUsuarioModifico = :audUsuarioModifico"),
    @NamedQuery(name = "TraGuiaRemisionCabecera.findByGrcComponenteVenta", query = "SELECT t FROM TraGuiaRemisionCabecera t WHERE t.grcComponenteVenta = :grcComponenteVenta"),
    @NamedQuery(name = "TraGuiaRemisionCabecera.findByGrcEstado", query = "SELECT t FROM TraGuiaRemisionCabecera t WHERE t.grcEstado = :grcEstado"),
    @NamedQuery(name = "TraGuiaRemisionCabecera.findByGrcFecha", query = "SELECT t FROM TraGuiaRemisionCabecera t WHERE t.grcFecha = :grcFecha"),
    @NamedQuery(name = "TraGuiaRemisionCabecera.findByGrcFechaEmision", query = "SELECT t FROM TraGuiaRemisionCabecera t WHERE t.grcFechaEmision = :grcFechaEmision"),
    @NamedQuery(name = "TraGuiaRemisionCabecera.findByGrcFechaFinTraslado", query = "SELECT t FROM TraGuiaRemisionCabecera t WHERE t.grcFechaFinTraslado = :grcFechaFinTraslado"),
    @NamedQuery(name = "TraGuiaRemisionCabecera.findByGrcFechaInicioTraslado", query = "SELECT t FROM TraGuiaRemisionCabecera t WHERE t.grcFechaInicioTraslado = :grcFechaInicioTraslado"),
    @NamedQuery(name = "TraGuiaRemisionCabecera.findByGrcNumero", query = "SELECT t FROM TraGuiaRemisionCabecera t WHERE t.grcNumero = :grcNumero"),
    @NamedQuery(name = "TraGuiaRemisionCabecera.findByGrcSubtotal", query = "SELECT t FROM TraGuiaRemisionCabecera t WHERE t.grcSubtotal = :grcSubtotal"),
    @NamedQuery(name = "TraGuiaRemisionCabecera.findByGrcTotalConIva", query = "SELECT t FROM TraGuiaRemisionCabecera t WHERE t.grcTotalConIva = :grcTotalConIva"),
    @NamedQuery(name = "TraGuiaRemisionCabecera.findByGrcUsuario", query = "SELECT t FROM TraGuiaRemisionCabecera t WHERE t.grcUsuario = :grcUsuario")})
public class TraGuiaRemisionCabecera implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "grc_id_pk")
    private Long grcIdPk;
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
    @Size(max = 50)
    @Column(name = "grc_componente_venta")
    private String grcComponenteVenta;
    @Size(max = 100)
    @Column(name = "grc_estado")
    private String grcEstado;
    @Column(name = "grc_fecha")
    @Temporal(TemporalType.DATE)
    private Date grcFecha;
    @Size(max = 20)
    @Column(name = "grc_fecha_emision")
    private String grcFechaEmision;
    @Size(max = 20)
    @Column(name = "grc_fecha_fin_traslado")
    private String grcFechaFinTraslado;
    @Column(name = "grc_fecha_inicio_traslado")
    @Temporal(TemporalType.DATE)
    private Date grcFechaInicioTraslado;
    @Column(name = "grc_numero")
    private BigInteger grcNumero;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "grc_subtotal")
    private Double grcSubtotal;
    @Column(name = "grc_total_con_iva")
    private Double grcTotalConIva;
    @Size(max = 100)
    @Column(name = "grc_usuario")
    private String grcUsuario;
    @JoinColumn(name = "tpe_grc_fk", referencedColumnName = "per_id_pk")
    @ManyToOne
    private TraPersona tpeGrcFk;
    @JoinColumn(name = "mtr_grc_fk", referencedColumnName = "mtr_id_pk")
    @ManyToOne
    private TraMotivoTraslados mtrGrcFk;
    @JoinColumn(name = "lug_grc_origen_fk", referencedColumnName = "lug_id_pk")
    @ManyToOne
    private TraLugares lugGrcOrigenFk;
    @JoinColumn(name = "lug_grc_destino_fk", referencedColumnName = "lug_id_pk")
    @ManyToOne
    private TraLugares lugGrcDestinoFk;
    @JoinColumn(name = "tfi_grc_fk", referencedColumnName = "fiv_id_pk")
    @ManyToOne
    private TraFacturaIvas tfiGrcFk;
    @OneToMany(mappedBy = "grcDguFk")
    private List<TraDetallesGuia> traDetallesGuiaList;

    public TraGuiaRemisionCabecera() {
    }

    public TraGuiaRemisionCabecera(Long grcIdPk) {
        this.grcIdPk = grcIdPk;
    }

    public Long getGrcIdPk() {
        return grcIdPk;
    }

    public void setGrcIdPk(Long grcIdPk) {
        this.grcIdPk = grcIdPk;
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

    public String getGrcComponenteVenta() {
        return grcComponenteVenta;
    }

    public void setGrcComponenteVenta(String grcComponenteVenta) {
        this.grcComponenteVenta = grcComponenteVenta;
    }

    public String getGrcEstado() {
        return grcEstado;
    }

    public void setGrcEstado(String grcEstado) {
        this.grcEstado = grcEstado;
    }

    public Date getGrcFecha() {
        return grcFecha;
    }

    public void setGrcFecha(Date grcFecha) {
        this.grcFecha = grcFecha;
    }

    public String getGrcFechaEmision() {
        return grcFechaEmision;
    }

    public void setGrcFechaEmision(String grcFechaEmision) {
        this.grcFechaEmision = grcFechaEmision;
    }

    public String getGrcFechaFinTraslado() {
        return grcFechaFinTraslado;
    }

    public void setGrcFechaFinTraslado(String grcFechaFinTraslado) {
        this.grcFechaFinTraslado = grcFechaFinTraslado;
    }

    public Date getGrcFechaInicioTraslado() {
        return grcFechaInicioTraslado;
    }

    public void setGrcFechaInicioTraslado(Date grcFechaInicioTraslado) {
        this.grcFechaInicioTraslado = grcFechaInicioTraslado;
    }

    public BigInteger getGrcNumero() {
        return grcNumero;
    }

    public void setGrcNumero(BigInteger grcNumero) {
        this.grcNumero = grcNumero;
    }

    public Double getGrcSubtotal() {
        return grcSubtotal;
    }

    public void setGrcSubtotal(Double grcSubtotal) {
        this.grcSubtotal = grcSubtotal;
    }

    public Double getGrcTotalConIva() {
        return grcTotalConIva;
    }

    public void setGrcTotalConIva(Double grcTotalConIva) {
        this.grcTotalConIva = grcTotalConIva;
    }

    public String getGrcUsuario() {
        return grcUsuario;
    }

    public void setGrcUsuario(String grcUsuario) {
        this.grcUsuario = grcUsuario;
    }

    public TraPersona getTpeGrcFk() {
        return tpeGrcFk;
    }

    public void setTpeGrcFk(TraPersona tpeGrcFk) {
        this.tpeGrcFk = tpeGrcFk;
    }

    public TraMotivoTraslados getMtrGrcFk() {
        return mtrGrcFk;
    }

    public void setMtrGrcFk(TraMotivoTraslados mtrGrcFk) {
        this.mtrGrcFk = mtrGrcFk;
    }

    public TraLugares getLugGrcOrigenFk() {
        return lugGrcOrigenFk;
    }

    public void setLugGrcOrigenFk(TraLugares lugGrcOrigenFk) {
        this.lugGrcOrigenFk = lugGrcOrigenFk;
    }

    public TraLugares getLugGrcDestinoFk() {
        return lugGrcDestinoFk;
    }

    public void setLugGrcDestinoFk(TraLugares lugGrcDestinoFk) {
        this.lugGrcDestinoFk = lugGrcDestinoFk;
    }

    public TraFacturaIvas getTfiGrcFk() {
        return tfiGrcFk;
    }

    public void setTfiGrcFk(TraFacturaIvas tfiGrcFk) {
        this.tfiGrcFk = tfiGrcFk;
    }

    @XmlTransient
    public List<TraDetallesGuia> getTraDetallesGuiaList() {
        return traDetallesGuiaList;
    }

    public void setTraDetallesGuiaList(List<TraDetallesGuia> traDetallesGuiaList) {
        this.traDetallesGuiaList = traDetallesGuiaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (grcIdPk != null ? grcIdPk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TraGuiaRemisionCabecera)) {
            return false;
        }
        TraGuiaRemisionCabecera other = (TraGuiaRemisionCabecera) object;
        if ((this.grcIdPk == null && other.grcIdPk != null) || (this.grcIdPk != null && !this.grcIdPk.equals(other.grcIdPk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.ups.entities.TraGuiaRemisionCabecera[ grcIdPk=" + grcIdPk + " ]";
    }
    
}
