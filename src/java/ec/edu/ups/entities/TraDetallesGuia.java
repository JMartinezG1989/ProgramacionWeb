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
@Table(name = "tra_detalles_guia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TraDetallesGuia.findAll", query = "SELECT t FROM TraDetallesGuia t"),
    @NamedQuery(name = "TraDetallesGuia.findByDguIdPk", query = "SELECT t FROM TraDetallesGuia t WHERE t.dguIdPk = :dguIdPk"),
    @NamedQuery(name = "TraDetallesGuia.findByAudEliminado", query = "SELECT t FROM TraDetallesGuia t WHERE t.audEliminado = :audEliminado"),
    @NamedQuery(name = "TraDetallesGuia.findByAudFechaInsercion", query = "SELECT t FROM TraDetallesGuia t WHERE t.audFechaInsercion = :audFechaInsercion"),
    @NamedQuery(name = "TraDetallesGuia.findByAudFechaModificacion", query = "SELECT t FROM TraDetallesGuia t WHERE t.audFechaModificacion = :audFechaModificacion"),
    @NamedQuery(name = "TraDetallesGuia.findByAudUsuarioInserto", query = "SELECT t FROM TraDetallesGuia t WHERE t.audUsuarioInserto = :audUsuarioInserto"),
    @NamedQuery(name = "TraDetallesGuia.findByAudUsuarioModifico", query = "SELECT t FROM TraDetallesGuia t WHERE t.audUsuarioModifico = :audUsuarioModifico"),
    @NamedQuery(name = "TraDetallesGuia.findByDguCantidad", query = "SELECT t FROM TraDetallesGuia t WHERE t.dguCantidad = :dguCantidad"),
    @NamedQuery(name = "TraDetallesGuia.findByDguDescripcion", query = "SELECT t FROM TraDetallesGuia t WHERE t.dguDescripcion = :dguDescripcion"),
    @NamedQuery(name = "TraDetallesGuia.findByDguUnidad", query = "SELECT t FROM TraDetallesGuia t WHERE t.dguUnidad = :dguUnidad"),
    @NamedQuery(name = "TraDetallesGuia.findByDguValorTotal", query = "SELECT t FROM TraDetallesGuia t WHERE t.dguValorTotal = :dguValorTotal"),
    @NamedQuery(name = "TraDetallesGuia.findByDguValorUnitario", query = "SELECT t FROM TraDetallesGuia t WHERE t.dguValorUnitario = :dguValorUnitario")})
public class TraDetallesGuia implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "dgu_id_pk")
    private Long dguIdPk;
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
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "dgu_cantidad")
    private Double dguCantidad;
    @Size(max = 200)
    @Column(name = "dgu_descripcion")
    private String dguDescripcion;
    @Size(max = 100)
    @Column(name = "dgu_unidad")
    private String dguUnidad;
    @Column(name = "dgu_valor_total")
    private Double dguValorTotal;
    @Column(name = "dgu_valor_unitario")
    private Double dguValorUnitario;
    @JoinColumn(name = "grc_dgu_fk", referencedColumnName = "grc_id_pk")
    @ManyToOne
    private TraGuiaRemisionCabecera grcDguFk;

    public TraDetallesGuia() {
    }

    public TraDetallesGuia(Long dguIdPk) {
        this.dguIdPk = dguIdPk;
    }

    public Long getDguIdPk() {
        return dguIdPk;
    }

    public void setDguIdPk(Long dguIdPk) {
        this.dguIdPk = dguIdPk;
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

    public Double getDguCantidad() {
        return dguCantidad;
    }

    public void setDguCantidad(Double dguCantidad) {
        this.dguCantidad = dguCantidad;
    }

    public String getDguDescripcion() {
        return dguDescripcion;
    }

    public void setDguDescripcion(String dguDescripcion) {
        this.dguDescripcion = dguDescripcion;
    }

    public String getDguUnidad() {
        return dguUnidad;
    }

    public void setDguUnidad(String dguUnidad) {
        this.dguUnidad = dguUnidad;
    }

    public Double getDguValorTotal() {
        return dguValorTotal;
    }

    public void setDguValorTotal(Double dguValorTotal) {
        this.dguValorTotal = dguValorTotal;
    }

    public Double getDguValorUnitario() {
        return dguValorUnitario;
    }

    public void setDguValorUnitario(Double dguValorUnitario) {
        this.dguValorUnitario = dguValorUnitario;
    }

    public TraGuiaRemisionCabecera getGrcDguFk() {
        return grcDguFk;
    }

    public void setGrcDguFk(TraGuiaRemisionCabecera grcDguFk) {
        this.grcDguFk = grcDguFk;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dguIdPk != null ? dguIdPk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TraDetallesGuia)) {
            return false;
        }
        TraDetallesGuia other = (TraDetallesGuia) object;
        if ((this.dguIdPk == null && other.dguIdPk != null) || (this.dguIdPk != null && !this.dguIdPk.equals(other.dguIdPk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.ups.entities.TraDetallesGuia[ dguIdPk=" + dguIdPk + " ]";
    }
    
}
